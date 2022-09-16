import java.util.Scanner;

public class practice {

    static boolean isAnagram(String a, String b) {
        // Complete the function static boolean isAnagram(String a, String b) {

// test for invalid input
        if (a == null || b == null || a.equals("") || b.equals(""))
            throw new IllegalArgumentException();

// initial quick test for non-anagrams
        if (a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        String[] c = a.split("");
        String[] d = b.split("");
        for(String letter: d){
            // if c has index of d and not last iteration
            // continue else return false
            //on last iteration, if made it all the way through both arrays, return true instead.
        }
    //
    return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = "search";
        String b = "rescue";
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

