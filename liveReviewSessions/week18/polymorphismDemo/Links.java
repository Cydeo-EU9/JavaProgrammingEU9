package week18.polymorphismDemo;

public class Links implements WebElement{




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
}
