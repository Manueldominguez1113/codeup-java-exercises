package Codewars;

public class sentenceSmasher {
    public static void main(String[] args) {
        System.out.println(smash("hello","this","is","my","sentence!"));
    }

    public static String smash(String... words) {
        // TODO Write your code below this comment please
        StringBuilder sentence = new StringBuilder();
        for (int i=0; i< words.length;i++) {
            if(i!=0){ //if not the first word add a space before
                sentence.append(" ");
            }
            sentence.append(words[i]);
        }

        return sentence.toString();
    }
}
