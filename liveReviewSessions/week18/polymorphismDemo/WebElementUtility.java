package week18.polymorphismDemo;

public class WebElementUtility {


    // we also have polyMorphism used here
    public static void clickElement (WebElement element){
        System.out.println("Clicking on the Element");
        element.click();  // object reference decides which method is reachable
    }

    public static WebElement getLinkWithText(String txt){
        System.out.println("Searching for a link with txt "+txt);
        return new Links();
    }


}
