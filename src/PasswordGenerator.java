import java.util.Scanner;

public class PasswordGenerator {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    begin();


    }

    static void begin() {
        String input;
        System.out.print("Welcome to the password generator! ");
        do {
            System.out.print("Are you ready to receive a password?\ntype in \"Y\" to begin\ntype in \"N\" for info on passwords\n");
            input = scan.next();
        if(input.equalsIgnoreCase("n")){
            System.out.println("""
                    
                    A strong password has:
                    at least 15 characters
                    uppercase letters
                    lowercase letters
                    numbers
                    symbols, such as ! " ? $ ? % * () _ - + = { [ }] : ; @ ` ~ # | < , > . ? /
                    
                    """); //extra line of space is intentional
            System.out.println("""
                    A strong password is:
                     not your username
                    not your name, your friend’s name, your family member’s name, or a common name
                    not your date of birth
                    not a dictionary word
                    not like your previous passwords
                    not a keyboard pattern, such as qwerty, asdfghjkl, or 12345678
                    
                    """); //extra spacing is intentional
        }
        } while (!input.equalsIgnoreCase("y"));
    }

}
