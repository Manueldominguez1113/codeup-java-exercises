import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello!\nwhat would you like to do? type in:\n\"Add\", \"Sub\", \"Multiply\", \"Divide\", \"Modulus\"\n" +
                "alternatively, type \"range\", \"Factorial\",\"Dice\"");
        String inp = sc.next();
        // assuming the user puts the correct code so i dont have to fight errors.
        if (inp.equalsIgnoreCase("Range")) {  // added to make ranges in question 2
            System.out.println(getInteger(1, 10));

        } else if (inp.equalsIgnoreCase("Factorial")) {   // added to support factorials in question 3
            System.out.println("\nTotal: " + Factorial());
        } else if (inp.equalsIgnoreCase("Dice")) {   // added to support factorials in question 3
            String answer="y";
            while (answer.equalsIgnoreCase("y")) {  //did util random.. honestly its the same thing as math.random from reading.
                System.out.println("how many sides are on your die?\n"); // just need to import java.lang.random instead.
                int sides = sc.nextInt();
                System.out.println("\nRolling 2 dice! \n");
                DiceRoll(sides);
                System.out.println("\nwould you like to roll again? Y/N");
                answer = sc.next();
            }
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
            System.out.println("Your number: ");
            inpt = rangeNum.nextInt();
            if (inpt < min || inpt > max) {
                System.out.println("Error! out of range! try again.");
            }

        } while (inpt < min | inpt > max);
        return inpt;
    }

    public static int Factorial(){
//        Scanner numberFact = new Scanner(System.in); //no longer necessary as my minmax function will get the right numbers.
        System.out.println("enter a number to be factorial'd from 1 to 12:\n");
        int input= getInteger(1,12);
        System.out.format("%s! = ", input);
        return Factoriali(input, input); // total will always start with the same number.
    }

    public static int Factoriali(int in, int total){
        in -= 1;
        if(in <=0){
            return total;
        }
        System.out.format("\n%s * %s =",total, in);
        total *= in;
        System.out.format("%s", total);
        return Factoriali(in,total);
    }

    public static void DiceRoll(int sides){
     Random Die = new Random();
     int dieOne= Die.nextInt((sides-1)+1)+1;  // ((max-min)+1)+min
     int dieTwo= Die.nextInt((sides-1)+1)+1;
     int total= dieOne+ dieTwo;
        System.out.format("Dice rolled! you got %s and %s! total: %s!", dieOne, dieTwo, total);
    }
}
