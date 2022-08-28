package week17.interfaceDemo;

public class DriverObjects {
    public static void main(String[] args) {

        ChromeDriver driver1 = new ChromeDriver();
        FirefoxDriver driver2 = new FirefoxDriver();

        // Polymorphism

      //  WebDriver driverSuper = new ChromeDriver();
        WebDriver driverSuper = new FirefoxDriver();

        driver1.get("www.cydeo.com");
        driver1.someUniqueMethodForChrome();
        driver2.get("www.cydeo.com");
        driver2.someUniqueMethodForFireFox();

        driverSuper.get("www.cydeo.com");
        ((FirefoxDriver) driverSuper).someUniqueMethodForFireFox();

        driverSuper = new ChromeDriver();
        driverSuper.get("www.cydeo.com");
        ((ChromeDriver) driverSuper).someUniqueMethodForChrome();

    }
}
