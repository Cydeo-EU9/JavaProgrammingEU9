package week14.browserTest;

public class DemoBlazeTest extends TestCase{
    public String product;

    public DemoBlazeTest(Browser browser, OS operatingSystem){
        super(browser,operatingSystem);
    }

    public DemoBlazeTest() {
    }

    public void navigateTo(String productPage){
        System.out.println("Navigating to "+productPage+" using "+super.browser.getBrowserType());
    }

    void shopFor(String product){
        this.product=product;
        System.out.println("Navigating to "+this.product+" \'s Page");
    }

}
