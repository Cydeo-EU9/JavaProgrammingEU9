package week14;

public class DemoBlazeTest extends TestCase{
    public String product;

    public DemoBlazeTest(Browser browser, OS operatingSystem){
        super(browser,operatingSystem);
    }

    public DemoBlazeTest() {
    }

    public void navigateTo(String link){
        System.out.println("Navigating to "+link+" using "+super.browser.getBrowserType());
    }

}
