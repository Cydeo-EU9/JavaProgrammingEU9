package week15;

public class CheckedExceptionExample {
    public static void main(String[] args)  {

        try {
            Thread.sleep(5000);  // checked exception: inside the method it throws an exception so we need to handle it
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*
        There are two ways of handling checked exceptions
        1. in method signature you can use throws keyword : throws InterruptedException
        2. we can handle with try catch
         */

        System.out.println("Hello after 5 seconds of sleep");


    }
}
