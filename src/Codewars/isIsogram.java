package Codewars;

import java.util.Locale;

public class isIsogram {
    public static void main(String[] args) {
        System.out.println(isogram("Spains"));
    }

    public static boolean isogram(String str) {
        boolean repeatingLetter = false;
        int[] alphabet= new int[26];
        String string = str.toLowerCase();

        if (str.length()==0){
            return true;
        }

        for (int i = 0; i < str.length(); i++) {
           int letter = string.charAt(i);
           alphabet[letter-97]++;
        }
        for (int ltr : alphabet) {
            if (ltr > 1) {
                repeatingLetter = true;
                break;
            }
        }

        return !repeatingLetter;
    }


}
