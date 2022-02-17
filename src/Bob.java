import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String toBob = "";
        while (!(toBob.equalsIgnoreCase("Goodbye"))) {
            System.out.println("what do you want to say to bob? ");
            toBob = input.nextLine();

            if (toBob.equalsIgnoreCase("hello") || toBob.equalsIgnoreCase("hi")) {
                System.out.println("Bob says \"" + toBob + ".\"");
            } else if (toBob.endsWith("?")) {
                System.out.println("Bob says \"Sure..\"");
            } else if (toBob.endsWith("!")) {
                System.out.println("Bob says \"Woah, chill out!\"");
            } else if (toBob.equalsIgnoreCase("")) {
                System.out.println("Bob says \"Fine! Be that way!\"");
            } else if (toBob.equalsIgnoreCase("goodbye")) {
                System.out.println("Bob says \"totes. see ya.\"");
            } else {
                System.out.println("Bob says \"Whatever.\"");
            }

        }

    }
}
