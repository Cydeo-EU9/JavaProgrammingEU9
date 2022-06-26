package week08;

public class ShoppingAppTests {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 13 case"}; // items[i] ---> String
        double[] prices = {99.99, 350.50, 9.99, 250.0, 439.50, 39.99}; // prices[i] ---> double
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("---Find the first index of 'Gloves' in items array-----");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")) {
                System.out.println("Gloves found at index = " + i);
                break;  // to get out of the loop
            }
        }

        System.out.println("-----Print everything in the items list except items that contains 'J'------");
        // to skip item we need continue;
        for (int i = 0; i < items.length; i++) {
            if(items[i].contains("J")){
                continue;  // branching statement
            }
            System.out.println("items = " + items[i]);
        }

        System.out.println("---set a boolean variable true if 'ipad' exits in the items----");
        boolean itemExists = false;
        for (String item : items) {
             if(item.equalsIgnoreCase("ipad")){
                 itemExists = true;
                 break;
             }
        }
        if(itemExists){
            System.out.println("We have ipad in the list");
        }

    }
}
