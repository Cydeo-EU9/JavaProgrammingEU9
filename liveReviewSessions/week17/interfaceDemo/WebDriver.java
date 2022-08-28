package week17.interfaceDemo;

public interface WebDriver {
    void get(String url);
    void findElement(String locator);
    void quit();
    String getTitle();
}
