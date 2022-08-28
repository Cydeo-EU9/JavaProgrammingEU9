package week17.interfaceDemo;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FireFoxDriver - navigating to : "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FireFoxdriver - locating element by : "+locator);
    }

    @Override
    public void quit() {
        System.out.println("FireFoxDriver - quiting the driver ");
    }

    @Override
    public String getTitle() {
        return "EU9 Test Automation";
    }

    public void someUniqueMethodForFireFox(){
        System.out.println("this methd only belongs to Firefox");
    }

}
