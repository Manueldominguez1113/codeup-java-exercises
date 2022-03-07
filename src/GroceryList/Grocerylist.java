package GroceryList;

public class Grocerylist {
    public static Grocery[] List(){
        return new Grocery[]{
                new Grocery("oranges","fruit"),
                new Grocery("apples","fruit"),
                new Grocery("strawberries","fruit"),
                new Grocery("grapes","fruit"),
                new Grocery("bananas","fruit"),
                new Grocery("potatoes","vegetables"),
                new Grocery("carrots","vegetables"),
                new Grocery("broccoli","vegetables"),
                new Grocery("celery","vegetables"),
                new Grocery("corn","vegetables"),
                new Grocery("onions","vegetables"),
                new Grocery("lettuce","vegetables"),
                new Grocery("beef","meat"),
                new Grocery("lamb","meat"),
                new Grocery("pork","meat"),
                new Grocery("chicken","meat"),
                new Grocery("venison","meat"),
                new Grocery("veal","meat"),
                new Grocery("milk","dairy"),
                new Grocery("butter","dairy"),
                new Grocery("cheese","dairy"),
                new Grocery("whey","dairy")
        };
    }
}
