package Codewars;

import java.util.Arrays;

public class digitizeArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(89302)));
    }

    public static int[] digitize(long n) {
        // Code here
        String num= String.valueOf(n);
        int[] array = new int[num.length()];

        for(int i=0; i<num.length(); i++){
            array[num.length()-(i+1)]= Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        return array;
    }
}
