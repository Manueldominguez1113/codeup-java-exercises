package Codewars;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class twoToOne {
    public static void main(String[] args) {
        System.out.println(longest("axxxbyz","aaacccdzy"));
    }


    public static String longest (String s1, String s2) {
        // your code

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if (sb.indexOf(String.valueOf(s1.charAt(i))) == -1){
                sb.append(s1.charAt(i));
            }
        }

        for(int i=0;i<s2.length();i++){
            if (sb.indexOf(String.valueOf(s2.charAt(i))) == -1){
                sb.append(s2.charAt(i));
            }
        }

        String letters = sb.toString();
        char[] answer = letters.toCharArray();
        Arrays.sort(answer);

        return new String(answer);

    }

}
