package week14;

import java.util.Scanner;

public class ShopListMakerApp {

    public static Scanner scanner; // global variable for this class - Declare the object reference

    public static void main(String[] args) {

        printInstructions();
       //  Scanner input = new Scanner(System.in);

        boolean toContinue = true;
        while(toContinue){
            System.out.println("Enter your NEXT choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 6:
                    toContinue = false;
                    break;
            }



        }

    }
    // some method, if I don't wanna create an object : should be static

    public static void printInstructions() {
        scanner = new Scanner(System.in);   // iniialize
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
