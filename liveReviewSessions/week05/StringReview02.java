package week05;

public class StringReview02 {
    public static void main(String[] args) {
        /*
        length(): NO parameter ---- returns integer
        toUpperCase() or toLowerCase: ---> NO parameter and returns the same String in uppercase or lowercase letter
         */
        String message = "EU9 is doing so great!!";

        int count = message.length();

        System.out.println("count = " + count);

        /*
        message.length(); it is very useful to create Loops that involves Strings, for getting Size
         */

        System.out.println(message.toUpperCase()); // creating and action at the same line

        /*
        message.toUpperCase() : what happens in the JAVA memory, a new string is created in the String Pool
        however 'message' my object reference is still pointing to the old object (original)
         */
        System.out.println(message);

        message = message.toUpperCase();

        System.out.println("message = " + message);

        String message2 = message.toLowerCase();

        System.out.println("message2 = " + message2);


    }
}
