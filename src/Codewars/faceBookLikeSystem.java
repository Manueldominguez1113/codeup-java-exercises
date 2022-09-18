package Codewars;

import java.util.Arrays;

public class faceBookLikeSystem {
    public static void main(String[] args) {
        System.out.println(whoLikesIt("Alex", "Jacob"));
    }

    public static String whoLikesIt(String... names) {
        //Do your magic here
        int list = names.length;
        String likes = "";

        switch (list) {
            case (0): {
                likes = "no one likes this";
                break;
            }
            case (1): {
                likes = names[0] + " likes this";
                break;
            }
            case (2): {
                likes = names[0] + " and " + names[1] + " likes this";
                break;
            }
            case (3): {
                likes = names[0] + ", " + names[1] + " and " + names[2] + " likes this";
                break;
            }
            default: {
                likes = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others likes this";
            }
        }

        return likes;
    }
}
