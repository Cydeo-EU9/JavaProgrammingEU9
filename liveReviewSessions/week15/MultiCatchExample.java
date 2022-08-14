package week15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) {

        // Important note: The code that might generate exception need to go inside try block, otherwise you can handle it

        System.out.println("Hello, enter an integer number which is a positive number bigger than zero");
        int x = 5;
        Scanner scanner = new Scanner(System.in);
        try {
            int y = scanner.nextInt();

            System.out.println(x / y); // there is a possibility that you might get ArithmeticException, InputMismatchException

        }catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
        }catch (InputMismatchException inputMismatchException){
            inputMismatchException.printStackTrace();
        }

        // below lines of code very important for my test case, even if I get exception I don't want execution to stop
        System.out.println("How are you?");
        System.out.println("Some more lines of code");


    }
}
