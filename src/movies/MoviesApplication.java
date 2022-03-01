package movies;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inpt;


        do {
            System.out.print("what would you like to do?\n\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - Add a movie to the list\n");
            System.out.print("Enter your choice: ");

            inpt = input.nextInt();

            if (inpt == 0) {
                System.out.println("Thank you, Goodbye");
            } else if (inpt == 1) {
                Movie.list("all");
            } else if (inpt == 2) {
                Movie.list("Animated");
            } else if (inpt == 3) {
                Movie.list("drama");
            } else if (inpt == 4) {
                Movie.list("horror");
            } else if (inpt == 5) {
                Movie.list("scifi");
            } else if (inpt == 6) {
                System.out.println("Enter the name of your movie:");
                input.nextLine(); // consumes the excess line to correctly get multi-worded titles
                String name =input.nextLine();
                int category;
                do {
                    System.out.println("\nEnter the number id of the category of your movie:");
                    System.out.println("IDs: \n0 - Animated\n1 - Drama\n2 - Horror\n3 - Sci-fi\n4 - Comedy\n5 - Musical");
                    category = input.nextInt();
                    if (category > 5 | category < -1){
                        System.out.println("Error! enter a valid id..");
                    }
                } while (category > 5 | category < -1);
                Movie.add(name, category);
            } else {
                System.out.println("incorrect input try again");
            }



        } while (inpt != 0);
    }

}
