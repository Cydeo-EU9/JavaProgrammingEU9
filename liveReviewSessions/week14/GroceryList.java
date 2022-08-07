package week14;

import java.util.ArrayList;
import java.util.Scanner;

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

    public String findItem(String searchItem){
        String searchResult;
        if(groceryList.size()==0){
            return null;
        }
        searchResult = "Not Found";
        int index = groceryList.indexOf(searchItem);
        if(index>=0){
            searchResult = searchItem+ " item found at line "+(index+1);
        }
        return searchResult;
    }

    @Override
    public String toString() {
        String list = "You have " + groceryList.size() + " items in your shopping list";
        for (int i = 0; i < groceryList.size(); i++) {
            list += "\n" + (i + 1) + "." + groceryList.get(i);
        }

        return list;
    }

    public void printInstructions() {

        System.out.println("Select : ");
        System.out.println("\t 0 - To print menu options.");
        System.out.println("\t 1 - To print the list of Shopping Items.");
        System.out.println("\t 2 - To add an item in the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item in the list.");
        System.out.println("\t 5 - To search an item in the list.");
        System.out.println("\t 6 - Quit the application.");
    }
}
