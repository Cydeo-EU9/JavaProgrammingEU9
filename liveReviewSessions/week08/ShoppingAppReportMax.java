package week08;

public class ShoppingAppReportMax {
    public static void main(String[] args) {
        String[] items = {"Shoes","Jacket","Gloves","Airpods","iPad","iphone 13 case"};
        double[] prices = {99.99, 350.50, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345,12346,12347,12348,12349,12350};
/*
Find the item which is most expensive and capture itemId, index in the list, price: print all
When you get question about MAX or MIN values always start with an assumption
You need to compare two items so you can find which is bigger
 */
        double maxPrice = prices[0];
        int indexOfMaxPrice = 0;
        double minPrice = prices[0];
        int indexOfMinPrice = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]>maxPrice){
                maxPrice = prices[i];
                indexOfMaxPrice=i;
            }
            if(prices[i]<minPrice){
                minPrice = prices[i];
                indexOfMinPrice=i;
            }
        }

        System.out.println("maxPrice = " + maxPrice);
        System.out.println("minPrice = " + minPrice);

        System.out.println("itemID of MaxPriced item] = " + itemIDs[indexOfMaxPrice]);
    }
}
