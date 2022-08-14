package week15.customExceptions;

public class CustomExceptionTest {
    public static void main(String[] args) {
        /*
        With custom exceptions we can create more specialized exceptions of our own
        Classes are 50 minutes, when it is passed someone will throw exception
         */

       int minute = 35; // try both positive and negative scenario

        System.out.println("Oscar is talking about "+minute+" minutes");

        if(minute>50){
            throw new BreakTimeException("Hey Oscar when is the break Time!"); // *
        }

        System.out.println("Oscar will continue another "+(50-minute)+" minutes");
        // if the condition is true the execution will stop at line *

        double balance = 395.50;

        double itemPrice = 500.0;

        System.out.println("I have "+ balance + " Euros in my account, and the item is  "+itemPrice);

        if(itemPrice > balance){
            throw new InsufficientBalanceException("Transaction declined due to insufficient balance hold !");
        }

    }
}
