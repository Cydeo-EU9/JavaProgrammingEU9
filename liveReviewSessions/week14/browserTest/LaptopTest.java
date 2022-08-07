package week14.browserTest;

public class LaptopTest extends DemoBlazeTest{

        public int quantity;

        public LaptopTest(Browser browser, OS operatingSystem, int quantity){
            super(browser,operatingSystem);
            this.quantity=quantity;
        }


    void shopFor(String product){
       super.product=product;
        System.out.println("Adding "+this.quantity+" amount of "+super.product+" to cart");
    }



}
