package Codewars;

public class evenOrOdd {
    public static void main(String[] args) {
        int[] array = {0,2,3,4};
        System.out.println(oddOrEven(array));
    }
    public static String oddOrEven (int[] array) {
        int result = 0;
        for (int j : array) {
            result += j;
        }

        if (result % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
