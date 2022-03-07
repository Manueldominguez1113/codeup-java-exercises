package GroceryList;

import java.util.ArrayList;

public class Grocery {

    private String name;
    private String category;
    public ArrayList<Grocery> Groceries = new ArrayList<>();

    public Grocery(String item, String category) {
this.name = item;
this.category = category;
Groceries.add(this);

    }

    static Grocery[] groceryList = Grocerylist.List();

    public static void section(String category){
        for(Grocery item: groceryList){
            if (item.category.equalsIgnoreCase(category)|| category.equalsIgnoreCase("all")){
                System.out.println("----------------------------");
                System.out.println(item.name +" , " + item.category);
            }
        }
    }
}


