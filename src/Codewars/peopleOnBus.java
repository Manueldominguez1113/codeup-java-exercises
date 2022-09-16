package Codewars;

import java.util.ArrayList;

public class peopleOnBus {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();

        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});
        System.out.println(countPassengers(list));
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        int total = 0;
        for (int[] stop : stops) {
            total+= stop[0];
            total-=stop[1];
        }

        return total;
    }

}
