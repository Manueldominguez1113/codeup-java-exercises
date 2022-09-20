package Codewars;

public class nextPerfectSquare {
    public static void main(String[] args) {
        System.out.println(findNextSquare(121));
    }

    public static long findNextSquare(long sq) {
        long side= (long)Math.floor(Math.sqrt(sq))+1;
        return side*side;



    }
}
