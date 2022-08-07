package week14.browserTest;

public class TestCase {

    Browser browser;  // edge, chrome, firefox....
    OS operatingSystem; // MAC, Windows, Linux
    String name;
    int age;
    // .........
    /*
    We have two instance variables; browser type, OS type
    When I create an object of TestCase
     */

    public TestCase() {
    }

    public TestCase(Browser browser, OS operatingSystem) {
        this.browser = browser;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "TestCase{" +
                "browser=" + browser.getBrowserType() +
                ", operatingSystem=" + operatingSystem.getOS() +
                '}';
    }

    public void navigateTo(String url){
        System.out.println("Opening "+url+" with "+browser.getBrowserType()+" in the "+operatingSystem.getOS());
    }


}
