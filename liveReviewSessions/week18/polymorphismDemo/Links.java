package week18.polymorphismDemo;

public class Links extends Browser implements WebElement{


    public void getLinkHref(){
        System.out.println("https://www.java.com");
    }

    @Override
    public void click() {
        System.out.println("Clicking the Link");
    }

    @Override
    public void sendKeys(String input) {
        System.out.println("Un-supported Action");
    }

    @Override
    public String getText() {
        System.out.println("Getting Link Text");
        return "Oracle Java";
    }

    @Override
    public Links locateElement(String locator) {
        return new Links();
    }
}
