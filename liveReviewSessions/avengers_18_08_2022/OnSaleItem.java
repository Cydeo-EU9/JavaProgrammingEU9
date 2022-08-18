package avengers_18_08_2022;

public class OnSaleItem extends Item {

    // inherits from Item Class
    /**
     * private instance variable, used for discount percentage
     */

    private double discountPercent; // 10 percent --> 0.1 user will input 0.1

    /**
     * public constructor for OnSaleItem
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discountPercent
     *
     * - Calls Super class constructor by passing name,quantity,catalogNumber,price
     * - it will assign the price after deducting(minus) discount from the price
     * - assigns discount
     */

    public OnSaleItem(String name,int quantity,int catalogNumber,double price,double  discountPercent){
        super(name,quantity,catalogNumber,(price-discountPercent*price));
        this.discountPercent=discountPercent;
    }


    /**
     * getter for discount
     * @return
     */

    public double getDiscountPercent(){
        return this.discountPercent;
    }



    /**
     * setter for discount
     * @param discountPercent
     */
    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    /**
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     *      * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     *
     */
    @Override
    public String toString() {
        return "OnSaleItem{" +
                "discountPercent=" + discountPercent +
                '}';
    }
}
