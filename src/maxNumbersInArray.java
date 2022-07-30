import java.util.Arrays;

public class maxNumbersInArray {
    //take in an array of numbers, [25, 5 ,2, 3, 4, 5], and return an array of the numbers that appear the most
    public static void main(String[] args) {
        int[] array = new int[]{25, 5, 2, 3, 4, 5, 2, 3, 3, 3};

        int[] solution = solution(array);
        System.out.print("number(s) that appear the most are: [");
        for (int i=0; i<solution.length;i++) {
            System.out.print(solution[i]);
            if(i!=solution.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static int[] solution(int[] array) {
        int[] numbers = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};   //{0,1,2,3,4,5,6,7,8,9}

        for (int number : array) {
            String stringNumber = String.valueOf(number);
            for (int i = 0; i < stringNumber.length(); i++) { // separate each number to single digits, then compare each digit to my array
                int x = Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
                numbers[x] += 1;          // so if the digit is a 0, numbers[0] ++, up to numbers[9]++
            }
        }
        int max = 0;
        for (int number : numbers) { // find highest number
            if (number > max) {
                max = number;
            }
        }
        int count = 0;
        //now that we have max. find all indexes of the highest number.
        for (int number : numbers) {
            if (number == max) {
                count++;
            }
        }
        // lastly, count = length of new array, place all indexes of the max number into that array
        int[] answer = new int[count];
        int previous = 0;
        for (int i = 0; i < answer.length; i++) {

            for (int x = 0; x < numbers.length; x++) {
                if (numbers[x] == max && x>previous) { // hits max and isnt in the answer already
                    answer[i]= x;// since x will be 0,1,2,3,4,5,6,7,8,9; were just recording where it happened;
                    previous=x; //record last occuring max so if x is less than last recorded index, itll skip.
                    break; // now stop iterating to not overlap
                }
            }
        }

        return answer;
    }

}



