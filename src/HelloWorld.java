public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.print(" World");
        int MyFavoriteNumber;
        String myString;
        float myNumber;
        MyFavoriteNumber = 3;
        myString = "this is my first string in java!";
        myNumber = 123; // completed 3.14, float should be double. long is 9mill to -9mill. no fractions.
        System.out.println("");

        System.out.println(MyFavoriteNumber);
        System.out.println(myString);
        System.out.println(myNumber);

        int x = 5;
        System.out.println(x++); // this means show x, then +1
        System.out.println(x); // which is why this one is changed, and not the one before.

        x = 5;
        System.out.println(++x); // this means +1, then show x.
        System.out.println(x);

        // class is already a named preset function, so i cannot use the word class to name my own function.
        // String theNumberThree = "three";  string cannot cast to integer?
        // Object o = theNumberThree;
        // int three = (int) o;

        int s;
        s = 4;
        s += 5;
        System.out.println(s);
        int g = 3;
        int f = 4;
        f *= g;

        int r = 10;
        int c = 2;
        r = r / c;
        c = c - r;

        /*What happens if you assign a value to a numerical
         variable that is larger (or smaller)
         than the type can hold? What happens if you increment
          a numeric variable past the type's capacity?*/

//         byte no= 300;
//        System.out.println(no);  lossy conversion from int to byte


    }
}
