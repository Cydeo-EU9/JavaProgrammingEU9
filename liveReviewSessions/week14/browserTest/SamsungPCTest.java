package week14.browserTest;

public class SamsungPCTest {
    public static void main(String[] args) {
        /*
        We will test https://www.demoblaze.com/index.html#
        add Samsung PC to cart
        and verify that it added
        1. Open browser
        2. navigate to url
        3. click to product
        4. add 4 laptops to cart
        */
        Browser browser = new Browser("Chrome");
        OS os = new OS("MAC");
        TestCase testCaseSamsung = new TestCase(browser,os);
        System.out.print("Step 1. ");
        testCaseSamsung.navigateTo("https://www.demoblaze.com/index.html#");

    DemoBlazeTest demoBlazeTestSamsung = new DemoBlazeTest(browser,os);
        System.out.print("Step 2. ");
    demoBlazeTestSamsung.navigateTo("Laptops");
        System.out.print("Step 3. ");
    demoBlazeTestSamsung.shopFor("Samsung PC");

    LaptopTest laptopTest = new LaptopTest(browser,os,4);
        System.out.print("Step 4. ");
    laptopTest.shopFor("Samsung PC");

    /*
    Selenium:
    get("url");
    navigateTo("url);
    findElement().....
     */

    }

}
