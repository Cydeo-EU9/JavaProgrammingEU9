package week05;

public class StringReview01 {

    public static void main(String[] args) {

        String str1 = "Java"; // literal way of creating String

        String str2 = "Java"; // literal

        /*
        Java Compiler checks the String Pool. And if there is alreay a string in the pool, Java does not create a new one.
        str1: reference to our String object
        str2: reference to our String object
         */
        System.out.println(str1==str2); // check if the objects are same ---> TRUE

        String str3 = new String("Java"); // Java does not check String Pool, it just creates totally a new String object

        System.out.println(str1 == str3 ); // FALSE

        // WHen you just want to check if the contents are same : .equals() method
        System.out.println(str1.equals(str2)); // True
        System.out.println(str1.equals(str3)); // true

        /*
        ArrayList, Collections, OOP topics: object equality and content equality not same thing

         */

        String str4 = "JaVa";
        System.out.println(str1.equalsIgnoreCase(str4)); // Case insensitive




    }

}
