package week09;

public class SearchTest {

    public static void main(String[] args) {

        System.out.println("--Starting Etsy Search Smoke Test------");
        // step 1 open browser
        openBrowser("Chrome");
        // step 2 navigate to the app
        navigateToUrl("https://www.etsy.com/");
        // step 3 send search item
        System.out.println(searchForItem("wooden spoon"));

        if(!verifyResultsAreDisplayed("wooden spoon")){
            System.out.println("Search Test for Etsy PASSED");
        }else {
            System.out.println("Search Test for Etsy FAILED");
        }

        /*
        As a tester ; without verification you have NO use to the company
        expected VS actual
         */
    }

    public static void openBrowser(String browser){           // no return method with one parameter
        System.out.println("Launching "+browser+" browser");
    }

    public static void navigateToUrl(String url){
        System.out.println("Navigating to "+url);
    }

    public static String searchForItem(String item){
        String searchResult = "15,811 results for "+item;
        return searchResult;
    }

    public static boolean verifyResultsAreDisplayed(String item){
        return searchForItem(item).isEmpty();
    }
}
