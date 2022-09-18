package Codewars;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        try{
            for (String prem: singlePermutations("abcd")) {
                System.out.println(prem);
            }
        } catch (NullPointerException e){
            System.out.println("function was null");
        }
    }

    public static List<String> singlePermutations(String s) {
        // Your code here!
        List<String> possibilities = null;
        for (int i=0;i<s.length();i++){
            for (int j=0;j<s.length();j++){
                s.charAt(j);
            }
        }

        return possibilities;
    }
}
