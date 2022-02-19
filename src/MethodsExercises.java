import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello!\nwhat would you like to do? type in:\n\"Add\", \"Sub\", \"Multiply\", \"Divide\", \"Modulus\"\n" +
                "alternatively, type \"range\", \"Factorial\"");
        String inp = sc.next();
        // assuming the user puts the correct code so i dont have to fight errors.
        if (inp.equalsIgnoreCase("Range")) {  // added to make ranges in question 2
            System.out.println(getInteger(1, 10));

        } else if (inp.equalsIgnoreCase("Factorial")) {   // added to support factorials in question 3
            System.out.println("running Factorial.. " + Factorial());
        } else {

            System.out.format("next, input the numbers you'd like to %s\n", inp);
            System.out.println("number 1:");
            int numOne = sc.nextInt();
            System.out.println("number 2:");
            int numTwo = sc.nextInt();
            if (inp.equalsIgnoreCase("add")) {
                System.out.println(Addition(numOne, numTwo));
            } else if (inp.equalsIgnoreCase("Sub")) {
                System.out.println(Subtraction(numOne, numTwo));
            } else if (inp.equalsIgnoreCase("Multiply")) {
                System.out.println(Multiplication(numOne, numTwo));
            } else if (inp.equalsIgnoreCase("Divide")) {
                System.out.println(Division(numOne, numTwo));
            } else if (inp.equalsIgnoreCase("Modulus")) {
                System.out.println("remainder: " + Modulus(numOne, numTwo));
            }
        }
//int numOne = getInteger(1, 10);
    }

    public static int Addition(int first, int second) {
        return first + second;
    }

    public static int Subtraction(int first, int second) {
        return first - second;
    }

    public static int Multiplication(int first, int second) {
//        return first * second;
/*
        int total = 0;
        for(int i =0;i<second;){

            total += first;
            i++;
        }
        return total;
*/
        int total = 0;
        return addIntoItself(first, second, total);

    }

    public static float Division(int first, int second) {
        return (float) first / second;
        // divide by 0 is infinity, and the computer understands that.
    }

    public static int Modulus(int first, int second) {
        return first % second;
    }

    public static int addIntoItself(int first, int second, int total) {
        if (second <= 0) {
            System.out.print("Total: ");
            return total;
        }
        total += first;
        return addIntoItself(first, second - 1, total);
    }

    public static int getInteger(int min, int max) {
        Scanner rangeNum = new Scanner(System.in);
        int inpt;
        do {
            System.out.println("Enter a number between 1 and 10: ");
            inpt = rangeNum.nextInt();
            if (inpt < min || inpt > max) {
                System.out.println("Error! out of range! try again.");
            }

        } while (inpt < min | inpt > max);
        return inpt;
    }

    public static int Factorial(){
        return
    }
}
