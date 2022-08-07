package week14;

import java.util.ArrayList;

public class GroceryList { // blueprint class that holds function and object of Shopping items
// We will create some instance methods that will do the action defined in the print instructions

    private ArrayList<String> groceryList;  // creating an encapsulated object of ArrayList Class

    public GroceryList() {
        groceryList = new ArrayList<>();
    }

    public void addItemToList(String item) {
        groceryList.add(item);
    }

    public void modifyGroceryItem(int position, String newItem) {
        // set() method modifes arraylist
        groceryList.set(position-1, newItem);
        System.out.println("Grocery Item " + (position) + " has been modified");
    }

    public void removeItem(int position) {
        groceryList.remove(position-1);
    }

    @Override
    public String toString() {
        String list = "You have " + groceryList.size() + " items in your shopping list";
        for (int i = 0; i < groceryList.size(); i++) {
            list += "\n" + (i + 1) + "." + groceryList.get(i);
        }

        return list;
    }
}
