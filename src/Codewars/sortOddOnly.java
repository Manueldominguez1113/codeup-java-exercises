package Codewars;

import java.util.Arrays;

public class sortOddOnly {
    public static void main(String[] args) {
        int[] array = {
                5, 3, 2, 8, 1, 4
        };

        System.out.println(Arrays.toString(sortArray(array)));
    }

    public static int[] sortArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i]%2==0){
                continue;
            }
            for (int j = array.length - 1; j >= 0; j--) {
                if(array[j]%2==0){
                    continue;
                }
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();

        return array;
    }
}

