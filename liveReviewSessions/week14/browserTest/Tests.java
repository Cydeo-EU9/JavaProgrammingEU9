package week14.browserTest;

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
        testCaseOne.browser = browser; // browser object
        testCaseOne.operatingSystem = os; // operatingsytem object
        testCaseOne.name = "Oscar"; // string object
        testCaseOne.age = 45; // integer object


        System.out.println(testCaseOne);


        // create TestCase object with parameters

        TestCase testCaseTwo = new TestCase(new Browser("Chrome"),new OS("Windows"));
        System.out.println(testCaseTwo);

    }
}
