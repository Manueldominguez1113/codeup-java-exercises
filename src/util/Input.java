package util;

import java.util.Scanner;

public class Input {

    private static final Scanner scanner= new Scanner(System.in);

    public static String getString() {
        return scanner.next();
    }

    public static boolean yesNo() // if y || yes || yeah, true, else false
    {
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
        try{
           return Integer.parseInt(getString());
        } catch(NumberFormatException e){
            System.out.println("exception: please enter only a whole number. " + e.getMessage());
            return getInt();
        }

        // Integer.valueOf(String s); says it's redundant by parseInt. --because Integer.valueOf(String s) == new Integer(Integer.parseInt(S))
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
        try {
            return Double.parseDouble(getString());
            // similar to the previous one, intellij thinks parseDouble is more efficient than valueOf.
        } catch (NumberFormatException e){
            System.out.println("Exception: please enter a valid number");
        return getDouble();
        }
    }

    public static int getBinary(){
        try {
            return Integer.parseInt(getString(), 2);
            // similar to the previous one, intellij thinks parseDouble is more efficient than valueOf.
        } catch (NumberFormatException e){
            System.out.println("Exception: please enter a valid number");
            return getBinary();
        }
    }

    public static int getHex(){
        try {
            return Integer.parseInt(getString(), 16);
            // similar to the previous one, intellij thinks parseDouble is more efficient than valueOf.
        } catch (NumberFormatException e){
            System.out.println("Exception: please enter a valid number");
            return getHex();
        }
    }
}

