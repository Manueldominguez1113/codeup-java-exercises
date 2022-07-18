import java.util.Scanner;

public class SumupDigits {
    public static void main(String[] args) {
        //please put in a number and switch the type here as per the prompt
        int numbers = 123456;
        sumOfAll(numbers);
    }

    public static void sumOfAll(String numbers) {

        String[] array = numbers.split("");
        int total = 0;
        for (String number : array) {
            int num = Integer.parseInt(number);
            total += num;
        }
        System.out.println(total);
    }

    public static void sumOfAll(int numbers) {
        String numberString = String.valueOf(numbers);

        String[] array = numberString.split("");
        int total = 0;
        for (String number : array) {
            int num = Integer.parseInt(number);
            total += num;
        }
        System.out.println(total);
    }

}
// Create a function that will:
//
//Accept any number as input.
//Validate that input and convert it to an integer as necessary.
//Return the sum of the individual digits of that integer.