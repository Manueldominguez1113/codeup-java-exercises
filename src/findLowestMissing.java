import java.sql.SQLOutput;

public class findLowestMissing {

    //find lowest missing number in an array

    static int[] arr = new int[]{4, 5, 7, 2, 6, 3, 8, 1};

    //output should be : 4
    public static void main(String[] args) {
        System.out.println(answer(arr));
    }

    public static int answer(int[] arr) {
        //i need to sort the arr.
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
            }
        }
//        for (int i : arr) {System.out.print(i);}
        //now that its sorted, need to go through each number and find the first missing number that isn't zero
        int answer;
        for(answer=1;answer<=arr[arr.length-1];){
            int number=answer;      //save current number
            for(int i=0;i<arr.length;i++){
                if(arr[i]==answer){     //if answer is found increase by one and break out.
                    answer++;
                    break;
                }
            }
            if (answer==number){ //if the number did not change then it was not found in the array and must be my answer
                break;
            }
            if (answer==arr[arr.length-1]){ // if it made it to the end and the last number changed above(meaning it did not skip any digits) than add 1 so next int is lowest missing number
                answer++;
            }
        }


        return answer;
    }

}
