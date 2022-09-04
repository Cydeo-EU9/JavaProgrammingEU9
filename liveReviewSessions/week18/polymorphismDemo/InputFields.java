package week18.polymorphismDemo;

public class InputFields implements WebElement{


    @Override
    public void click() {
        System.out.println("Clicking the input field");
    }

    @Override
    public void sendKeys(String input) {
        System.out.println();
    }

    @Override
    public String getText() {
        return null;
    }
}
