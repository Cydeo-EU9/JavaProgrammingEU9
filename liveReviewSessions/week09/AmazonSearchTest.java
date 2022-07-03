package week09;

import java.util.Scanner;

public class AmazonSearchTest {
    public static void main(String[] args) {

        System.out.println("--Staring Amazon Search Test---");
        SearchTest.openBrowser("Firefox");
        SearchTest.navigateToUrl("https://www.amazon.com/");
        System.out.println(SearchTest.searchForItem("Java"));
        if(!SearchTest.verifyResultsAreDisplayed("Java")){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        /*
        To Scanner class methods we created object of the class
         Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
         */



    }
}
