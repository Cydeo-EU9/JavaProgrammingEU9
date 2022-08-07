package week14;

import java.util.Scanner;

public class ShopListMakerApp {

   // static GroceryList list = new GroceryList();

    public static Scanner scanner; // global variable for this class - Declare the object reference
  //  public static int x ; // this a global variable

    public static void main(String[] args) {
        GroceryList list = new GroceryList();
        printInstructions();
   //     System.out.println(x);
        //  Scanner input = new Scanner(System.in);

        boolean toContinue = true;
        while(toContinue){
            System.out.println("Enter your NEXT choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    System.out.println(list);
                    break;
                case 2:
                    System.out.println("Enter your grocery item:");
                    scanner.nextLine();
                    list.addItemToList(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Enter item number to be modified: ");
                    int itemNo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter a replacement item : ");
                    String newItem = scanner.nextLine();
                    list.modifyGroceryItem(itemNo,newItem);
                    break;
                case 4:
                    System.out.println("Enter the item number that will be removed");
                    int itemNumber = scanner.nextInt();
                    scanner.nextLine();
                    list.removeItem(itemNumber);
                    break;
                case 5:
                    System.out.println("Enter item name that you want to search:");
                    scanner.nextLine();
                    String searchItem = scanner.nextLine();
                    System.out.println(list.findItem(searchItem));
                    break;
                case 6:
                    toContinue = false;
                    break;
            }



        }

    }
    // some method, if I don't wanna create an object : should be static

    public static void printInstructions() {
    //     x = 10;
        scanner = new Scanner(System.in);   // initialize
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
