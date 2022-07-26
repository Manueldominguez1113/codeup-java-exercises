import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    static Scanner scan = new Scanner(System.in);
    static final String lowerList = "abcdefghijklmnopqrstuvwxyz";
    static final String upperList = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String digitsList = "0123456789";
    static final String punctList = "!@#$%&*()_+-=[]|,./?><";

//first iteration i want to make without constructor, then i shall try again in a new file with a constructor.

    public static void main(String[] args) {
        userInterface();


    }

    static void userInterface() {
        String input;
        System.out.print("Welcome to the password generator! ");
        do {
            System.out.print("Are you ready to receive a password?\ntype in \"Y\" to begin\ntype in \"N\" for info on passwords\n");
            input = scan.next();
            if (input.equalsIgnoreCase("n")) {
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
        setup();
    }

    public static void setup() {
        String lower;
        String upper;
        String numbers;
        String punctuation;
        String yesOrNoOnly = "Please only type in 'Y' for yes or 'N' for no";

        System.out.println("please enter how long you wish the password to be:\n");
        int length = scan.nextInt();
        if (length == 0) {
            System.out.println("Sorry, length cannot be zero");
            setup();
            return; // return stops the rest of the function from continuing after the recursion, preventing repeated questions.
        }
        do {
            System.out.println("would you like lowercase characters included? Y/N");
            lower = scan.next();
            if (!YorNOnly(lower)) {
                System.out.println(yesOrNoOnly);
            }
        } while (!YorNOnly(lower));
        do {
            System.out.println("would you like uppercase characters included? Y/N");
            upper = scan.next();
            if (!YorNOnly(upper)) {
                System.out.println(yesOrNoOnly);
            }
        } while (!YorNOnly(upper));
        do {
            System.out.println("would you like numbers included? Y/N");
            numbers = scan.next();
            if (!YorNOnly(numbers)) {
                System.out.println(yesOrNoOnly);
            }
        } while (!YorNOnly(numbers));
        do {
            System.out.println("would you like special characters to be included? Y/N");
            punctuation = scan.next();
            if (!YorNOnly(punctuation)) {
                System.out.println(yesOrNoOnly);
            }
        } while (!YorNOnly(punctuation));

        if (!YNConvert(lower) && !YNConvert(upper) && !YNConvert(numbers) && !YNConvert(punctuation)) { // if all is false...
            System.out.println("Clever, but password generator needs at least one true to create anything. please try again.");
            setup();
            return;
        }

        generator(length, YNConvert(lower), YNConvert(upper), YNConvert(numbers), YNConvert(punctuation));
    }

    public static boolean YorNOnly(String answer) {
        return answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N");
    }

    public static boolean YNConvert(String answer) {
        return answer.equalsIgnoreCase("Y");
    }

    public static void generator(int length, boolean lowercase, boolean uppercase, boolean numbers, boolean punctuation) {
        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime()); // creates a random based on the current time to help enforce more randomness;
        int amountOfLists = 0;
        //collecting our categories
        List<String> charCategories = new ArrayList<>(4);
        if (lowercase) {
            charCategories.add(lowerList);
            amountOfLists++;
        }
        if (uppercase) {
            charCategories.add(upperList);
            amountOfLists++;
        }
        if (numbers) {
            charCategories.add(digitsList);
            amountOfLists++;
        }
        if (punctuation) {
            charCategories.add(punctList);
            amountOfLists++;
        }
        // Build the password.
        for (int i = 0; i < length; i++) {
            String charCategory = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }
        String pass = new String(password);
        System.out.println("new password is:\n" + pass);
        switch (amountOfLists) {
            case (1): {
                if (length <= 9) {
                    System.out.println("password is only "+length+" characters long with only setting. do not rely on this password! I recommend you add more settings next time!");
                } else if(length>10){
                    System.out.println("password is "+length+" characters long but only uses one setting. try not to stick with this password!");
                }
                break;
            }
            case (2): {
                if (length <= 9) {
                    System.out.println("password is only "+length+" characters long using two settings. I do not recommend this password.");
                } else if(length>10){
                    System.out.println("password is "+length+" characters long using two settings! this is a decent password, but consider adding more settings!");
                }
                break;
            }
            case (3): {
                if (length <= 9) {
                    System.out.println("password is only "+length+" characters long using three settings. for better security, use longer passwords.");
                } else if(length>10){
                    System.out.println("password is "+length+" characters long using three settings! this is a great password!");
                }
                break;
            }
            case (4): {
                if (length <= 9) {
                    System.out.println("password is only "+length+" characters long using all settings. for even better security, use longer passwords.");
                } else if(length>10){
                    System.out.println("password is "+length+" characters long using all settings! this is a strong password!");
                }
                break;
            }
        }


       // System.out.println("copy and save it somewhere safe."); // thinking of making a writer to save to txt file next time.
        System.out.println("\nwould you like to make another?");
        String again = scan.next();
        if (again.equalsIgnoreCase("Y")) {
            System.out.println("\n\n");
            userInterface();
        }
        System.out.println("\nGoodbye! remember, your password is: \n" + pass);

    }

}
