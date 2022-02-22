package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;

    String getString() {
        System.out.println("please write out your string");
        return scanner.nextLine();
    }

    boolean yesNo() // if y || yes || yeah, true, else false
    {
        System.out.println("yes or no?");
        String response = scanner.next();
        return response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yeah") || response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("True");
    }
   
    int getInt(int min, int max)  // continue to prompt for input until it is within the limits of min and max.
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

    int getInt(){
        System.out.println("input your number:\n");
        return scanner.nextInt();
    }
    double getDouble(double min, double max)
    {
        double input=-20.00;
        while(input<min | input>max){
            System.out.format("\ninput your number between %s and %s\n",min, max);
            input = scanner.nextInt();
            if (input<min | input>max) {
                System.out.println("invalid number.");
            }
        }
        return input;

    }
    double getDouble(){
        System.out.println("input your number:\n");
        return scanner.nextInt();
    }

}

