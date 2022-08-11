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

        String[] c = a.split("").sort();
        String[] d = b.split("").sort();
    //
    return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

}
