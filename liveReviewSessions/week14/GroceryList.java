package week14;

import java.util.ArrayList;

public class GroceryList { // blueprint class that holds function and object of Shopping items
// We will create some instance methods that will do the action defined in the print instructions

    private ArrayList<String> groceryList;  // creating an encapsulated object of ArrayList Class

    public GroceryList() {
        groceryList = new ArrayList<>();
    }

    public void addItemToList(String item){
        groceryList.add(item);
    }
    public void modifyGroceryItem (int position, String newItem){
        // set() method modifes arraylist
        groceryList.set(position, newItem);
        System.out.println("Grocery Item "+ (position)+" has been modified");
    }

}
