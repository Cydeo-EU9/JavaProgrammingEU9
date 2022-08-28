package week17.interfaceDemo;

public class ChromeDriver implements WebDriver{

    @Override
    public void get(String url) {
        System.out.println("ChromeDriver - navigating to : "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Chromedriver - locating element by : "+locator);
    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver - quiting the driver ");
    }

    @Override
    public String getTitle() {
        return "EU9 Test Automation";
    }

    public void someUniqueMethodForChrome(){
        System.out.println("this methd only belongs to Chrome");
    }
}
