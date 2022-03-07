package GroceryList;
import util.Input;
public class MainGroceryApp {
    public static void main(String[] args) {
        int choice=0;
        Customer customer=new Customer();


        while(choice != 3) {
            System.out.println("what would you like to do?(enter the number) \n1. add to your grocery list\n 2. view your current grocery list\n3. finish your list");
            choice = Input.getInt(1, 3);
            if (choice == 1) {
                Customer.groceryList();
            }
            if (choice == 2) {
                // if 2, show the customer.grocerylist + the quantities hashmap in a sout and ask if they would like to edit it. maybe find a way to motion to finialize from here?
            }
            if (choice == 3) {
                System.out.println("here is your list..");
                //if 3, "print out" the list and quantities of the items.
                System.out.println("thank you for using my app! Goodbye!");
            }
        }



    }
}
