package Codewars;

import java.util.regex.Pattern;

public class SecureTester {
    public static void main(String[] args) {
        System.out.println(alphanumeric("apples1324"));
    }

    public static boolean alphanumeric(String s){

        if(s.length()<1){
            return false;
        }


        return Pattern.compile("[a-zA-Z0-9]*").matcher(s).matches();
    }
}
