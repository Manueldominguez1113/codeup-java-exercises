import java.util.ArrayList;
import java.util.Arrays;

public class diagonalMatrixSum {
// with a given matrix, and a given length and width of a 45 degree rectangle, solve for the maximum possible sum of the
// rectangle within the matrix.
//      matrix[row][column]

// ex:
//  [ 0, 1, 2, 3, 4, 5]
//  [10, 3, 7, 9, 0, 3]
//  [20, 0, 1, 5, 8, 6]
//  [ 5, 0,10, 6, 4, 2]
// A=2 && B=3

//   makes three possibilities...
//  [ X, 1, X, X, X, X]     [ X, X, 2, X, X, X]      [ X, X, X, 3, X, X]
//  [10, 3, 7, X, X, X]     [ X, 3, 7, 9, X, X]      [ X, X, 7, 9, 0, X]
//  [ X, 0, 1, 5, X, X]     [ X, X, 1, 5, 8, X]      [ X, X, X, 5, 8, 6]
//  [ X, X,10, X, X, X]     [ X, X, X, 6, X, X]      [ X, X, X, X, 4, X]
//      sum= 37                 sum= 41                 sum =42

// in a perfect square (4x4), this seems to be the equation:
//                length-1=x
//   0 [            x            ]
//   1 [        x-1 x x+1        ]
//   2 [    x-2 x-1 x x+1 x+2    ]
//   3 [x-3 x-2 x-1 x x+1 x+2 x+3]
//   4 [    x-2 x-1 x x+1 x+2    ]
//   5 [        x-1 x x+1        ]
//   6 [            x            ]
//   7 [                         ]
//

// in a 5x3 this is different, we can see the length will be a negative iterator, and the width will be positive
//  [                 x            ]
//  [             x-1 x x+1        ]  pattern i can see is it goes down and left by 1 for each number in length.
//  [         x-2 x-1 x x+1 x+2    ] then, it goes down plus 1 for each width in a zigzag.
//  [     x-3 x-2 x-1 x x+1        ]    ie:
//  [ x-4 x-3 x-2 x-1 x            ]        [x]
//  [     x-3 x-2 x-1              ]        [x  x+1]
//  [         x-2                  ]        [   x+1 x+2]
//  [                              ]  so if i can tell the program to add matrix[0][x] + matrix[1][x]+ matrix 1[x+1] + matrix[2][x+1] + matrix[2][x+2]
//                                     then tell it to continue at matrix[1][x-1] until it reaches matrix[4][x-3], then add matrix[5][x-4] diagonal 3[width] times.

    //5x4?
    //       |__length-1_______|
    //       |               |_width-1____|
//        |-[                 x            ]
//        | [       5     x-1 x x+1    4   ]
//        | [         x-2 x-1 x x+1 x+2    ]
// length | [     x-3 x-2 x-1 x x+1 x+2 x+3]
//   -1   | [ x-4 x-3 x-2 x-1 x x+1 x+2    ]
//   +    | [     x-3 x-2 x-1 x x+1        ]
// width  | [   4     x-2 x-1 x      5     ]
//   -1   |-[             x-1              ]
//


    //   [            x            ]      final row needs to be matrix[length][0] to start, then
    //   [        x-1 x x+1        ]      go down one left one, width amount of times.
    //   [    x-2 x-1 x x+1 x+2    ]
    //   [x-3 x-2 x-1 x x+1 x+2 x+3]        not including overlapping starting point 0, its length-1 and width-1
    //   [    x-2 x-1 x x+1 x+2    ]
    //   [        x-1 x x+1        ]
    //   [            x            ]

//how do I program this to understand that?

    static int[][] matrix = new int[][]{
            {0, 1, 2, 3, 4, 5},
            {10, 3, 7, 9, 0, 3},
            {20, 0, 1, 5, 8, 6},
            {5, 0, 10, 6, 4, 2}

    };
    static int a = 2; // change these variables to test the function!
    static int b = 3;

    public static void main(String[] args) {
        matrixCheck();
        System.out.println("\nhighest possible sum for rectangle " + a + "x" + b + ": " + matrixRun(a, b));               // now shall take in our length and width and return the highest sum
    }

    public static void matrixCheck() {
        for (int[] row : matrix) {                 //for(int i=0; i<matrix.length; i++){
            for (int number : row) {                // for(int x=0; x <matrix[i].length;i++)
                System.out.printf("%02d ", number);      //      sout(" "+matrix[i][x]);
            }                                       //}
            System.out.print("\n");                 //sout("\n");
        }                                           //} }       basically just prints out each number in the matrix
    }

    public static int matrixRun(int length, int width) {
        int highestNum = 0;
        if (length == 1 && width == 1) {          //different run in case the size of square is one


            for (int[] row : matrix) {
                for (int number : row) {
                    if (number > highestNum) {      //if the square is 1x1. just go down the list and find highest number.
                        highestNum = number;
                    }
                }
            }
            return highestNum;
        }

        //next, I need to make a checker, to find out how many ways can length*width can fix into our matrix.
        //matrix[0][0] being a starting point, I need to calc matrix[x+(length-1+width-1)][x+(length-1+width-1)] to make sure the rectangle can fit in that location.
        //needs to shoot me a list of locations the rect can start at.

        for (int x = 0; x < matrix.length; x++) { // go through each row...
            ArrayList<Integer> startPoints = startingPoints(x, length, width); //collect the starting points
            if (startPoints != null) {                                          // on each possible row only
                for(int y: startPoints) {                                   // for each Y coordinate in the points...
                    int numInRect = rectangleSum(x,y,length, width);        //do the function with x and y coordinates to begin.

                    if (numInRect > highestNum) {                           // if the sum is higher, replace.
                        highestNum = numInRect;
                    }
                }
            }

        }


        return highestNum;
    }

    public static int rectangleSum(int x,int y, int length, int width) {
        int numInRect = 0;
        int startingY = y;
        System.out.println("x was: "+x+" \nand Y was: "+y);
        for (int j = 0; j <= length - 1; j++) { // this should iterate length amount of times(including 0 so -1), then the final diagonal will be done if j=length

            int row = j+ x;                  //row =j, so it starts at 0 and goes down by one each cycle.
            for (int i = 0; i < width; i++) {
                numInRect += matrix[row][startingY + i];
                if (i != 0 && j != length - 1) {      //if not the first iteration and also not the final diagonal...
                    numInRect += matrix[row][startingY + (i - 1)]; // if not zero row, then grab the previous column in new row too.
                }
                row++; //go down(positive) one row each i;
            }
            startingY--; // pull start back one time after each iteration
        }
        System.out.println("one possible rectangle at matrix["+x+"]["+y+"] summed up to "+ numInRect);
        return numInRect;       //total sum from this rectangle
    }

    public static ArrayList<Integer> startingPoints(int row, int length, int width) {
        int amountOfHits = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        if (row + (length - 1) + (width - 1) < matrix.length) //check if row can even fit the rectangle form here first.
        {
            for (int i = 0; i < matrix[0].length; i++) {  //go down this row and...
                if (i - (length - 1)>=0 && i+(width - 1) < matrix[0].length) { // check if the rectangle can fit in the spot.
                    amountOfHits++;
                    answer.add(i);
                    //if true, add to list as Y coordinate.
                }


            }
        }
        if (amountOfHits != 0) {
            return answer;
        } else return null;
    }
}

