import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
    /*   // =====-------while loop
        int i =5;
        while(i <=15){
            System.out.print(i+" ");
            i++;  */
        //======-------------- do-while loops
//        int i =0;
//        do {
//            i+=2;
//            System.out.println(i);
//        } while (i<=100);

//        int i =100;
//        do {
//            i-=5;
//            System.out.println(i);
//        } while (i>-10);

//        long i =2;
//        do {
//            i*=i;
//            System.out.println(i);
//        } while (i<1000000);

//        =-----------for loops

//        for(int i=5;i<=15;i++) {
//            System.out.println(i);
//        }

//        for(int i=0;i<=100;i+=2){
//            System.out.println(i);
//        }

//        for(int i =100; i>-10;i-=5){
//            System.out.println(i);
//        }

//        long i = 2;
//        System.out.println(i);
//        for(i=2;i<1000000;){
//            i*=i;
//            System.out.println(i);
//
//        }

//------ fizzbuzz test
//    int i= 1;
//    do{
//        if(i%3==0 & i%5==0){
//            System.out.println("FizzBuzz");
//        }else if(i%3==0){
//            System.out.println("Fizz");
//        } else if(i%5==0){
//            System.out.println("Buzz");
//        } else{
//            System.out.println(i);
//        }
//        i++;
//
//    }while(i<=100);

// ===------------- tables ---------===

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a number to go up to: ");
        String input = "y";
        int num = scan.nextInt();
        int i= 1;

        System.out.println("here is your table!");
        System.out.println(" ");
        System.out.println("Number | Squared | Cubed");

        while(input.equalsIgnoreCase("y")){

            System.out.println("Number | Squared | Cubed");
            do{
                System.out.format("  %-5s|   %-6d|  %-4s \n", i, (i*2),(i*3));
                i++;
            } while (i<=num);
            System.out.println("Would you like to keep going?: (Y/N)");
            input = scan.next();
           if (input.equalsIgnoreCase("y")){
               num+=5;
           } else {
               System.out.println("Thank you! Goodbye!");
           }
        }   // I can easily refactor this - why do I need to make an int do while, when the while does everything but better y'know?
            // but it works 🤷🏽‍


        /* =====--------------- Grading Scale ---------------===== */
/*
        String testInput = "y";
        while (testInput.equalsIgnoreCase("y")) {
            System.out.println("input the number of your grade: ");
            int grade = scan.nextInt();
            String letter;
            if (grade < 0 || grade > 100) {
                System.out.println("invalid entry");
            } else {


                if (grade >= 88) {
                    letter = "A";
                    if (grade >= 97) {
                        letter += "+";
                    }
                    if (grade <= 93) {
                        letter += "-";
                    }
                    System.out.format("You got an %2s!\n", letter);
                } else if (grade >= 80) {
                    letter = "B";
                    if (grade >= 86) {
                        letter += "+";
                    }
                    if (grade <= 85) {
                        letter += "-";
                    }
                    System.out.format("You got an %2s!\n", letter);
                } else if (grade >= 67) {
                    letter = "C";
                    if (grade >= 75) {
                        letter += "+";
                    }
                    if (grade <= 72) {
                        letter += "-";
                    }
                    System.out.format("You got an %2s!\n", letter);
                } else if (grade >= 60) {
                    letter = "D";
                    if (grade >= 65) {
                        letter += "+";
                    }
                    if (grade <= 62) {
                        letter += "-";
                    }
                    System.out.format("You got an %2s!\n", letter);
                } else {
                    letter = "F";
                    if (grade >= 55) {
                        letter += "+";
                    }
                    if (grade <= 30) {
                        letter += "-";
                    }
                    System.out.format("You got an %2s!\n", letter);
                }
                System.out.println("Would you like to keep going?: (Y/N)");
                testInput = scan.next();
            }
*/



        // unused code
        /*       switch(grade){   switch needs exact int. no booleans for switch case in java.
            case(grade< 97 & grade>88 ):
                System.out.println("You got an A!");
                break;
            case(grade< 87 & grade>80):
                System.out.println("You got a B!");
                break;
            case(grade< 79 & grade>67):
                System.out.println("You got a C!");
                break;
            case(grade< 60 & grade>66):
                System.out.println("You got a D!");
                break;
            default:
                System.out.println("buh-burr. F! Fail!");

        }
*/

    }


}

