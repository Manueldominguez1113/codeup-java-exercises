package GroceryList;

import util.Input;

import java.util.ArrayList;

public class Grocery {

    private String name;
    private String category;
    private int quantity;
    static ArrayList<Grocery> groceries= new ArrayList<>();

    public Grocery(String item, String category) {
        this.name = item;
        this.category = category;
    }


    public Grocery(Grocery item, int quantity) {
        this.name = item.name;
        this.category = item.category;
        this.quantity = quantity;

    }

    static Grocery[] groceryList = Grocerylist.List();  //full list of store products



    public static void section(String category) {
        for (Grocery item : groceryList) {
            if (item.category.equalsIgnoreCase(category) || category.equalsIgnoreCase("all")) {
                System.out.println("----------------------------");
                System.out.println(item.name + " , " + item.category);
            }
        }
    }

    public static Grocery selection(String input) {
        for (Grocery item : groceryList) {
            if (input.equalsIgnoreCase(item.name)) {
                return item;
            }
        }
        return null;
    }

    public static void addThis(Grocery item, int count) {
        groceries.add(new Grocery(item, count));
    }

    public static void viewList(){
        int i =1;

        for (Grocery grocer : groceries) {
            System.out.println(grocer.name+" " +grocer.category+" "+ grocer.quantity);
            i++;
        }
    }



    public static void groceryList() {
        boolean createList = true;
        boolean newItem = true;
        String addItem;
        int count;
        while (createList) {

            while (newItem) {

                System.out.println("choose a category: \n1.fruits\n2.vegetables\n3.meat\n4.dairy\n5.all");
                int category = Input.getInt(1, 5);
                if (category == 1) {
                    do {
                        System.out.println("select a fruit");// link to list
                        Grocery.section("fruit");
                        addItem = Input.getString();

                        if (Grocery.selection(addItem) == null) {
                            System.out.println("error! not found, try again");
                        }
                    } while (Grocery.selection(addItem) == null);
                    System.out.println("how many "+addItem+"s would you like?");
                    count = Input.getInt();
                    if (count !=0){
                        Grocery.addThis(Grocery.selection(addItem), count);
                    }
                } else if (category == 2) {
                    System.out.println("select a vegetable");//link to list
                    Grocery.section("vegetables");
                    addItem = Input.getString();

                } else if (category == 3) {
                    System.out.println("select a meat");//link to list
                    Grocery.section("meat");
                    addItem = Input.getString();

                } else if (category == 4) {
                    System.out.println("select a dairy product"); //link to list
                    Grocery.section("dairy");
                    addItem = Input.getString();

                } else if (category == 5) {
                    System.out.println("select from list");
                    Grocery.section("all");
                    addItem = Input.getString();

                } else {
                    System.out.println("sorry, we didnt get the category you were looking for.");
                }

                System.out.println("would you like to enter a new item?");
                newItem = Input.yesNo();
            }

            System.out.println("Would you like to continue on your list? Y/N");
            createList = Input.yesNo();
        }
    }

}


