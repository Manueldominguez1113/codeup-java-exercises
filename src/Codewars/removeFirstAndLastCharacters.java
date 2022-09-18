package Codewars;

public class removeFirstAndLastCharacters
{
    public static void main(String[] args) {
        System.out.println(remove("Beta"));
    }

    public static String remove(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(str.length()-1);
        sb.deleteCharAt(0);
        return sb.toString();
    }
}
