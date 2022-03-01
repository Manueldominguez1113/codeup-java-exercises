import java.util.Arrays;
import java.util.Random;
public class ServerNameGenerator {

        static String[] adjectives = {"outrageous","precious","strange","unusual","victorious","wandering","wild","lucky","helpless","friendly"};
        static String[] nouns = {"parrot","queen","sandwich","magician","whale","machine","elephant","potato","monkey","doctor"};

    public static String randomizer(String[] array1, String[] array2){
        Random dice1= new Random();
        return array1[dice1.nextInt(10)] +"-"+ array2[dice1.nextInt(10)];
    }

    public static void main(String[] args) {
        System.out.println("here is your server name:");
        System.out.println(randomizer(adjectives, nouns));

    }
}
