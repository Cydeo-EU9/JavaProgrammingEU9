package week15;

import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {

        System.out.println("Hello, enter an integer number which is a positive number bigger than zero");
        int x = 5;

        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();
        try {
            System.out.println(x / y); // there is a possibility that you might get ArithmeticException, InputMismatchException
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        // below lines of code very important for my test case, even if I get exception I don't want execution to stop
        System.out.println("How are you?");
        System.out.println("Some more lines of code");

        // Maya: in which cases we should throw an exception and in which write a condition/pre-condition using a basic if statement
/*
Try Catch is applied to mostly unimportant steps
if it is an important you would like to see that it fails, as a tester

We can handle arithmeticexception but with one catch we could not handle inputmismatch exception
 */

    }
}
