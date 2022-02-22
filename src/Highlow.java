import java.util.Scanner;
import java.util.Random;

public class Highlow {
    public static void main(String[] args) {
        Scanner play = new Scanner(System.in);
        System.out.println("Welcome to my game!\n I shall secretly roll a 100 sided die, and you must guess in 6 tries what the number is.");
        System.out.println("ready? y/n");
        String input = play.next();
        while (input.equalsIgnoreCase("y")) {
            game();
            System.out.println("\nWant to play again? y/n");
            input = play.next();
        }
    }

    public static void game() {
        Scanner scan = new Scanner(System.in);
        Random roll = new Random();

        int number = roll.nextInt((100 - 1) + 1) + 1;
        int attempts = 6;

        System.out.println("The Number has rolled!\nGuess my number between one an 100!");
        int start = scan.nextInt();

        do {
            if (attempts < 6) {
                System.out.format("\ntry again! %s attempts left!\n", attempts);
                start = scan.nextInt();
            }
            attempts--;
            if (attempts == 0) {
                break;
            }

            if (start > number) {
                System.out.println("lower..");
            } else if (start < number) {
                System.out.println("higher..");
            }

        } while (start != number);

        if (start == number) {
            System.out.println("good guess!! you win!");
        } else {
            System.out.format("Game Over! you lose! my number was %s", number);
        }

    }
}
