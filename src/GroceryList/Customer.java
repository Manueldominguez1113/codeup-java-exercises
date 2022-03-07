package GroceryList;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class Customer {
    private ArrayList<Integer> groceries;
    private HashMap<String, Integer> quantity;
    // created at start to save each customers list of products.
    Customer() {
        System.out.println("welcome new customer!");
        this.groceries = new ArrayList<>();
        this.quantity = new HashMap<>();
    }

    public static void groceryList(){
        boolean createList = true;
        boolean newItem = true;


        while (createList) {

                while (newItem) {

                    System.out.println("choose a category: \n1.fruits\n2.vegetables\n3.meat\n4.dairy\n5.all");
                    int category = Input.getInt(1, 5);
                    if (category == 1) {
                        System.out.println("select a fruit");// link to list
                        Grocery.section("fruit");

                    } else if (category == 2) {
                        System.out.println("select a vegetable");//link to list
                        Grocery.section("vegetables");

                    } else if (category == 3) {
                        System.out.println("select a meat");//link to list
                        Grocery.section("meat");

                    } else if (category == 4) {
                        System.out.println("select a dairy product"); //link to list
                        Grocery.section("dairy");

                    } else if(category == 5){
                        System.out.println("select from list");
                        Grocery.section("all");
                } else {
                            System.out.println("sorry, we didnt get the category you were looking for.");
                        }

                    System.out.println("would you like to enter a new item?");
                    newItem= Input.yesNo();
                }

            System.out.println("Would you like to continue on your list? Y/N");
            createList = Input.yesNo();
        }
    }


}
