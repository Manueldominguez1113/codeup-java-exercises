
import java.util.Arrays;



public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers)); // need to string to pull convert it otherwise this
                                        // outputs the location of the array, which i cant use right now

        String[] persons = {"John", "Caleb", "Alex"};

        for (String person: persons){
             Person group =new Person(person);

            group.sayHello();
        }
        System.out.println("added kyle to our array "+addPerson(persons, "Kyle"));
    }
        public static String addPerson(String[] Array, String person){
            String[] newArray = Arrays.copyOf(Array, Array.length + 1);
            newArray[newArray.length-1] = person;
            return Arrays.toString(newArray);
        }

}

