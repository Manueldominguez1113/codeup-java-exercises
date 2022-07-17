
public class NarcissisticNumbers {

    public static void main(String[] args) {
        NNumberGen();
    }

    //this function takes in the number, and responds with whether it's narcissistic or not
    public static boolean NNumbers(int number) {
        String n = String.valueOf(number);
        int length = n.length();
        String[] digits = n.split("");
        int total = 0;
        for (String num : digits) {
            double squared = Math.pow(Integer.parseInt(num), length);
            total += squared;
            // System.out.println(num+"^"+ length+" = " + squared);
        }
        // System.out.println(" = "+total);
        return total == number;
    }

    //need to make a new function to generate numbers and output the first 25 numbers
    public static void NNumberGen() {
        System.out.println("beginning to generate narcissistic numbers...");
        for (int i = 0; i <= 9930000; i++) {
            if (NNumbers(i)) {
                System.out.println(i + " is a narcissistic number");
            }
        }

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