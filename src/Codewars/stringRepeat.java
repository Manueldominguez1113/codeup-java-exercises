package Codewars;

public class stringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(6,"hello"));
    }
    public static String repeatStr(final int repeat, final String string) {
        String answer="";
        for(int i=0; i<repeat; i++){
            answer+= string;
        }

        return answer;
    }
}
