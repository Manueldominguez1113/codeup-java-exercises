package Codewars;

import java.util.*;

public class WeightSort {
    public static void main(String[] args) {
      //  System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));

    }
    //would have worked. except Hashmaps don't do repeating keys.
    /*public static String orderWeight(String strng) {
        // your code
        HashMap<String, Integer> weights = new HashMap<String, Integer>();

        String[] newStr = strng.split(" ");
        for (String wght : newStr) {
            int sum = 0;
            for (int i = 0; i < wght.length(); i++) {
                sum += Integer.parseInt(String.valueOf(wght.charAt(i)));
            }
            System.out.println("sum of " + wght + " = " + sum);
            weights.put(wght, sum);
        }

        ArrayList<String> sortedWT = sortByVal(weights);
        //now I need to print the sorted keys into a string
        StringBuilder end = new StringBuilder();
        for(int i =0 ; i< sortedWT.size();i++){
            if(i!=0){ // add a space before if not the first element
                end.append(" ");
            }
            end.append(sortedWT.get(i));
        }


        return end.toString();
    }

    private static ArrayList<String> sortByVal(HashMap<String, Integer> weight) {
        //need to turn Hashmap into List to use sort.
        List<Map.Entry<String, Integer>> list =
                new LinkedList<>(weight.entrySet());

        list.sort(Map.Entry.comparingByValue());

        //now sorted by values, I only need the keys.
        ArrayList<String> sortedWeights= new ArrayList<>(list.size());

        for (Map.Entry<String, Integer> pair : list) {
            sortedWeights.add(pair.getKey());
        }

        return sortedWeights;
    }*/
    public static String orderWeight(String strng) {}

}
