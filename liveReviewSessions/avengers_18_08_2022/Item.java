package avengers_18_08_2022;

public class Item {
    /*
    In this assignment you will practice:
inheritance
constructors and calling parent class constructor
overriding
list with custom classes

Please follow the instructions on top of each method.

Work on this flow:
Item > OnSaleItem > TJMaxx
     */

    //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    /**
     * public constructor with:
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     *
     * assigns to values to instance variables
     */
    public Item(String name, int quantity,int catalogNumber,double price){
        this.name=name;
        this.price=price;
        this.catalogNumber=catalogNumber;
        this.quantity=quantity;
    }


    /**
     * setter for name instance variable
     * @param name
     */

        public void setName(String name){this.name=name;}


    /**
     * setter for variable price which is private
     * @param price
     */
        public void setPrice(double price){this.price=price;}


    /**
     * getter for price
     * @return
     */

        public double getPrice(){return this.price;}


    /**
     * getter for name
     * @return
     */

        public String getName(){return this.name;}


    public int getCatalogNumber() {
        return catalogNumber;
    }

    /**
     * Override toString:
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */

    @Override
    public String toString() {
        return "Regular Item{" +
                "name='" + name + '\'' +
                ", catalogNumber=" + catalogNumber +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
