package util;

import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getString() {
        System.out.println("please write out your string");
        return scanner.nextLine();
    }

    public static boolean yesNo() // if y || yes || yeah, true, else false
    {
        System.out.println("yes or no?");
        String response = scanner.next();
        return response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yeah") || response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("True");
    }

    public static int getInt(int min, int max)  // continue to prompt for input until it is within the limits of min and max.
    {
        int input=-120;
        while(input<min | input>max){
        System.out.format("\ninput your number between %s and %s\n",min, max);
        input = scanner.nextInt();
        if (input<min | input>max) {
            System.out.println("invalid number.");
        }
        }
        return input;

    }

    public static int getInt(){
        System.out.println("input your number:\n");
        return scanner.nextInt();
    }
    public static double getDouble(double min, double max)
    {
        double input=0.00;
        while(input<min | input>max){
            System.out.format("\ninput your number between %s and %s\n",min, max);
            input = scanner.nextDouble();
            if (input<min | input>max) {
                System.out.println("invalid number.");
            }
        }
        return input;

    }
    public static double getDouble(){
        System.out.println("input your number:\n");
        return scanner.nextDouble();
    }

}

