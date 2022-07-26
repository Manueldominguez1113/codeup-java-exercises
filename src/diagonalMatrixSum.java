import java.util.Arrays;

public class diagonalMatrixSum {
// with a given matrix, and a given length and width of a 45 degree rectangle, solve for the maximum possible sum of the
// retangle within the matrix.
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
//how do I program this to understand that?

    static int[][] matrix = new int[][]{
            {0, 1, 2, 3, 4, 5},
            {10, 3, 7, 9, 0, 3},
            {20, 0, 1, 5, 8, 6},
            {5, 0, 10, 6, 4, 2}

    };
    static int a = 2;
    static int b = 3;

    public static void main(String[] args) {
        matrixCheck();
        //System.out.println(Arrays.toString(matrixRun(1, 1))); //in a single 1x1 square, returns highest number, which is 20.
        System.out.println(matrixRun(a,b));               // now shal take in our length and width and return the highest sum
    }

    public static void matrixCheck() {
        for (int[] row : matrix) {                 //for(int i=0; i<matrix.length; i++){
            for (int number : row) {                // for(int x=0; x <matrix[i].length;i++)
                System.out.print(" " + number);      //      sout(" "+matrix[i][x]);
            }                                       //}
            System.out.print("\n");                 //sout("\n");
        }                                           //} }       basically just prints out each number in the matrix
    }

    public static int matrixRun(int length, int width) {
        if (length == 1 && width == 1) {          //different run in case the size of square is one
            int highestNum = 0;

            for (int[] row : matrix) {
                for (int number : row) {
                    if (number > highestNum) {
                        highestNum = number;
                    }
                }
            }
            return highestNum;
        }

            int numInRect= 0;
            for (int i=0;i<width;i++){
                    if(i==0) {
                        numInRect += matrix[i][length - (1)];
                    }
            }
            return numInRect;
        }
    }

