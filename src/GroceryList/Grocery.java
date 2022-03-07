package GroceryList;

import util.Input;

import java.util.ArrayList;
import java.util.Comparator;


public class Grocery {

    private String name;
    private String category;
    private int quantity;
    static ArrayList<Grocery> groceries = new ArrayList<>();

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

    public static Comparator<Grocery> groceryNameComparator = (s1, s2) -> {
        String grocerName1 = s1.name;
        String grocerName2 = s2.name;

        //ascending order
        return grocerName1.compareTo(grocerName2);

        //descending order
        //return grocerName2.compareTo(grocerName1);
    };

    public static Comparator<Grocery> groceryCategoryComparator = (s1, s2) -> {
        String grocerCat1 = s1.category;
        String grocerCat2 = s2.category;

        //ascending order
        return grocerCat1.compareTo(grocerCat2);

    };

    public static void viewList() {

        groceries.sort(groceryNameComparator);
        groceries.sort(groceryCategoryComparator);
        for (Grocery grocer : groceries) {

            System.out.println(grocer.name + " " + grocer.category + " " + grocer.quantity);

        }
        editList();
    }

    public static Grocery itemFinder() {
        System.out.println("which item would you like to edit? input the name:");
        String item = Input.getString();

        for (Grocery items : groceries) {
            if (items.name.equalsIgnoreCase(item)) {
                return items;
            } else {
                System.out.println("item not found in list, please type the name of the item in your grocery list.");
            }
        }
        return itemFinder();
    }

    public static void remover(Grocery item) {
groceries.remove(item);
    }

    public static void editList() {

        System.out.println("would you like to edit an item? Y/N");
        boolean edit = Input.yesNo();
        while (edit) {

            Grocery run = itemFinder();
            System.out.println(run.name + " " + run.category + " " + run.quantity);
            System.out.println("\n change the amount of this item, put 0 to remove this item");
            int amount = Input.getInt();
            if (amount == 0) {
remover(run);
            } else{
                run.quantity = amount;
            }


            System.out.println("would you like to edit another item? Y/N");
            edit = Input.yesNo();
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
                        Grocery.section("fruit"); //pulls list of fruits
                        addItem = Input.getString();

                        if (Grocery.selection(addItem) == null) {
                            System.out.println("error! not found, try again");
                        }
                    } while (Grocery.selection(addItem) == null);
                    System.out.println("how many " + addItem + " would you like?");
                    count = Input.getInt();
                    if (count != 0) {
                        Grocery.addThis(Grocery.selection(addItem), count);
                    }
                } else if (category == 2) {
                    do {
                        System.out.println("select a vegetable");// link to list
                        Grocery.section("vegetables");
                        addItem = Input.getString();

                        if (Grocery.selection(addItem) == null) {
                            System.out.println("error! not found, try again");
                        }
                    } while (Grocery.selection(addItem) == null);
                    System.out.println("how many " + addItem + " would you like?");
                    count = Input.getInt();
                    if (count != 0) {
                        Grocery.addThis(Grocery.selection(addItem), count);
                    }
                } else if (category == 3) {
                    do {
                        System.out.println("select a meat");// link to list
                        Grocery.section("meat");
                        addItem = Input.getString();

                        if (Grocery.selection(addItem) == null) {
                            System.out.println("error! not found, try again");
                        }
                    } while (Grocery.selection(addItem) == null);
                    System.out.println("how many " + addItem + " would you like?");
                    count = Input.getInt();
                    if (count != 0) {
                        Grocery.addThis(Grocery.selection(addItem), count);
                    }
                } else if (category == 4) {
                    do {
                        System.out.println("select a dairy");// link to list
                        Grocery.section("dairy");
                        addItem = Input.getString();

                        if (Grocery.selection(addItem) == null) {
                            System.out.println("error! not found, try again");
                        }
                    } while (Grocery.selection(addItem) == null);
                    System.out.println("how many " + addItem + " would you like?");
                    count = Input.getInt();
                    if (count != 0) {
                        Grocery.addThis(Grocery.selection(addItem), count);
                    }
                } else if (category == 5) {
                    do {
                        System.out.println("select from list");// link to list
                        Grocery.section("all");
                        addItem = Input.getString();

                        if (Grocery.selection(addItem) == null) {
                            System.out.println("error! not found, try again");
                        }
                    } while (Grocery.selection(addItem) == null);
                    System.out.println("how many " + addItem + " would you like?");
                    count = Input.getInt();
                    if (count != 0) {
                        Grocery.addThis(Grocery.selection(addItem), count);
                    }
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


