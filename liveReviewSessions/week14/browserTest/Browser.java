package week14.browserTest;

public class Browser {
        private String browserType;

    public Browser() {
    }

    public Browser(String browserType) {
        setBrowserType(browserType);
    }

    public String getBrowserType() {
        return browserType;
    }

    public void setBrowserType(String browserType) {
        this.browserType = browserType;
    }

    @Override
    public String toString() {
        return "Browser{" +
                "browserType='" + browserType + '\'' +
                '}';
    }
}
