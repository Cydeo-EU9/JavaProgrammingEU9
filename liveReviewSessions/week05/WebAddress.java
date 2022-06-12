package week05;

import java.util.Scanner;

public class WebAddress {
    public static void main(String[] args) {

/*
Create a class named WebAddress, and write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov

            equals() method : this is checking if the string is exactly the same
            equalsignorecase() method : checking the letter with case insensitive
 */

        // create a scanner to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a valid website: such as www.amazon.com");

        String userEntry = scanner.next();

        // www.amazon.com
        int indexOfFirstDot = userEntry.indexOf('.');
     //   int indexOfSecondDot = userEntry.indexOf('.',indexOfFirstDot);
        int indexOfSecondDot = userEntry.lastIndexOf('.');

        String beginningOfUrl = userEntry.substring(0,indexOfFirstDot);
        String endingOfUrl = userEntry.substring(indexOfSecondDot+1);

        boolean isValid = beginningOfUrl.equalsIgnoreCase("www") &&
                (endingOfUrl.equalsIgnoreCase("gov")||endingOfUrl.equalsIgnoreCase("com")||endingOfUrl.equalsIgnoreCase("edu"));

// if there is only one line of code I can leave out '{' curly braces
        if(isValid)
            System.out.println("Valid Website");
        else
            System.out.println("Invalid Website");

        scanner.close();

    }

}
