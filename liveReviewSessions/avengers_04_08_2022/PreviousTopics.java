package avengers_04_08_2022;

import avengers_28_07_2022.Replit_Method_LameDB;

import java.util.Arrays;

public class PreviousTopics {
    public static void main(String[] args) {
        
        /*
        Strings: Char sequences
        literal way: "string"
        with new keyword
         */
        String str1 = "Cydeo";  String str2 = "Cydeo"; // String pool, they both point to the same object
        System.out.println("(str2 == str1) = " + (str2 == str1));

        String str3 = new String("Cydeo"); String str4 = new String("Cydeo"); // this is created in Heap Memory
        System.out.println("(str4  == str3 = " + (str4  == str3));

        str3 = str4;  // What happens to the old str3 object ---> garbage collector cleans

        System.out.println("(str4  == str3 = " + (str4  == str3));  // checks if objects are same
        
        // best way of checking the value if they are equal: for object and Strings
        System.out.println("str4.equals(str1) = " + str4.equals(str1)); // checks if values are same

        System.out.println("-------Loops------");
        /*
        Iterator
        for(initialization; Condition ; Iterator ){ statements }
        while(condition) { Statement} repeated if statement
         */

        /*
        Arrays: One of the data structure, collection types, Map
        - fixed size
        - to print:  System.out.println(Arrays.toString(arr));
        - supports primitive and non-primitive(object)
        - it can have multi-dimension
        - to get the size : .length() method
         */
        int[] arr = {4,7,67,34,54};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
      }

        String[] arrStr = {};

        arrStr = new String[5];

        /*
        Arraylist
        - dynamic size: at the background they are using Arrays
        - Example: we create a custom method, that adds extra element to an existing Array
        - supports ONLY non-primitive(object), to be able to store primitive values
        what we have ? Wrapper Classes
        Collections are very important topic for Interview
         */

        /*
        Calling a custom method from a different class:
        Different scenarios:
        - if both classes are in the same package; we just write ClassName.MethodName
        - if both classes are NOT in the same package; first import then call ClassName.MethodName
         */

        System.out.println("CustomMethods.isEligible(25) = " + CustomMethods.isEligible(25));

        // We will call lameDb method from another package
        Replit_Method_LameDB.lameDb("1etsy#2wooden#3spoon","add","1","bbb");
    }
}
