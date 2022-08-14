package week15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter a number : ");
            int num = scanner.nextInt();
            System.out.println("you entered num = " + num);
        }catch (InputMismatchException e){
            System.out.println("You entered an invalid value !!");
        }finally {
            scanner.close();
            System.out.println("Finally block always run except for that 3 conditions");
        }

        /*
        Final specifier : when we use at class, that class can not be inherited
                        when we use final for a method, it can not be overriden
                        when we use it for a variable, the variable can not change
        Finalize ...related to Garbage Collector
         */



    }
}
