import java.io.PrintStream;
import java.util.Scanner;
public class exercise218 {
    public static void main(String[] args) {
        name();
        System.out.println(input());
    }

    public static PrintStream name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter username: ");
        String name = scanner.next();
        return System.out.format("Welcome, %s!", name);
    }

    public static Integer input() {
// 2. write a method that accepts 2 numbers from user input and returns the result of those two numbers added together
        Scanner number = new Scanner(System.in);
        System.out.println("addition. enter number one");
        int numbOne = number.nextInt();
        System.out.println("addition. enter number two");
        int numbTwo = number.nextInt();
    return numbOne + numbTwo;
    }
}