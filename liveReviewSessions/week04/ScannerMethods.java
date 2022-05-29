package week04;

import java.util.*;  // when we need to use this class we have to import this library

public class ScannerMethods {
    public static void main(String[] args) {

        /*
        Scanner is a class, and from this class we create object so we can get input from console
         */
        System.out.println("Output");
        /*
        DataType variableName/referenceName = someValue
        Scanner scan/input/justSomeName = new Scanner(System.in)
        new Scanner(System.in) ---> object of Scanner: this object can NOW reach our methods
        next() --> String inputs
        nextInt() ---> integer data types
        .......
         */

        int x = 5;

        // Create your scanner object and IMPORT UTIL library
        Scanner scan = new Scanner(System.in);

        // Prompt user for an input type
        System.out.println("Enter an Integer number : ");

        // pick up the value
        int y = scan.nextInt();

        // use the value
        int sum = x + y;

        System.out.println("sum = " + sum);

        scan.close();


    }
}
