import java.util.Scanner;

public class ConsoleClasses {

    public static void main(String[] args) {
        double pi = 3.14159;

        // System.out.printf("the value of pi is %.2f", pi);



        Scanner scanner = new Scanner(System.in);
//       scanner.useDelimiter("\n"); // made no difference? but when i change from new line. i cannot continue.
        /*
        System.out.print("Enter a sentence: ");
        String userInput1 = scanner.nextLine();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();

        System.out.println("You entered: --> \"" + userInput1 *//*+" "+ userInput2+ " " + userInput3*//* +"\" <--");
*/


        /* int userinput =scanner.nextInt()
        insert Hello string in int expectation.
        Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at ConsoleClasses.main(ConsoleClasses.java:15)

Process finished with exit code 1

        copypasted 3 userinput strings. if i did more than 3, it cuts off the sentence at 3 words. if i did less. itll next line
        and wait for the next word

       if i prompt for a sentence i see it working similarly. itll cut off with next(), but nextLine() will capture the entire sentence.
*/

//            System.out.println("enter the length of the room: ");
//            String lengthInput = scanner.nextLine();
//            float l =Float.parseFloat(lengthInput); // int l= Integer.parseInt() would get me a solid number.
//            System.out.println("enter the width of the room: ");
//            String widthInput = scanner.nextLine();
//            float w =Float.parseFloat(widthInput);


        System.out.println("enter the length of the room: ");
        int l = scanner.nextInt();
        System.out.println("enter the width of the room: ");
        int w = scanner.nextInt();


        System.out.println("You're area: --> \" "+ l*w +"  \" <--");
        System.out.println("You're perimeter: --> \" "+ ((2*l)+(2*w)) +"  \" <--");
  // I don't see delimiter doing anything in this scenario. but i read it can be used to separate input by specific characters.
    }
}
