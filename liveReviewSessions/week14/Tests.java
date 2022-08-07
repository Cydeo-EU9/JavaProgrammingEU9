package week14;

public class Tests {
    public static void main(String[] args) {

        // create testCase object with No parameter constructor
        TestCase testCaseOne = new TestCase();
        // browser object
           Browser browser = new Browser();
          browser.setBrowserType("Chrome");
        // OS object
          OS os = new OS();
          os.setOS("Windows");
        testCaseOne.browser = browser;
        testCaseOne.operatingSystem = os;

        System.out.println(testCaseOne);


        // create TestCase object with parameters

        TestCase testCaseTwo = new TestCase(new Browser("Chrome"),new OS("Windows"));
        System.out.println(testCaseTwo);

    }
}
