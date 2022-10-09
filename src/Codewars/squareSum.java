package Codewars;

public class squareSum {
    public static void main(String[] args) {
        int[] array = {2, 1, 2};
        System.out.println(squareSum(array));
    }

    public static int squareSum(int[] n) {
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            sum+= n[i] * n[i];
        }

        return sum;
    }
}
