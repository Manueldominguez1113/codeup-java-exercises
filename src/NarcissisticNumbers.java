
public class NarcissisticNumbers {

    public static void main(String[] args) {
        System.out.println(NNumbers(153));
    }

    public static int NNumbers(int number){
        String n= String.valueOf(number);
        int length = n.length();
        n.split("");

        return length;
    }

}
/*
prompt:         Narcissistic Numbers
A narcissistic number is a non-negative integer (n) with m digits where the sum of all the individual digits raised to the power m is equal to n.

For example:

If n is 153, then m (the number of digits) is 3 and:

13 + 53 + 33 = 1 + 125 + 27 = 153

So, 153 is a narcissistic number.

Objective: Write a script to generate and output the first 25 narcissistic integers.*/