import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i =5;
//        while(i <=15){
//            System.out.println(i);
//            i++;
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

//        int i =2;
//        do {
//            i*=i;
//            System.out.println(i);
//        } while (i<60000); // wont run corrently once passes 1million. 60k works better.

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

//        int i = 2;
//        System.out.println(i);
//        for(i=2;i<60000;){
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
        int num = scan.nextInt();
        int i= 1;

        System.out.println("here is your table!");
        System.out.println(" ");
        System.out.println("Number | Squared | Cubed");
        do{
            System.out.format("  %-5s|   %-6d|  %-4s \n", i, (i*2),(i*3));
            i++;
        } while (i<=num);
        System.out.println("Would you like to keep going?: (Y/N)");
        String input = scan.next();
        while(input.equalsIgnoreCase("y")){
            num+=5;
            System.out.println("Number | Squared | Cubed");
            do{
                System.out.format("  %-5s|   %-6d|  %-4s \n", i, (i*2),(i*3));
                i++;
            } while (i<=num);
            System.out.println("Would you like to keep going?: (Y/N)");
            input = scan.next();
        }   // I can easily refactor this - why do I need to make an int do while, when the while does everything but better y'know?
            // but it works 🤷🏽‍



    }
}
