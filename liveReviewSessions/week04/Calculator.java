package week04;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // We will get two numbers of Double from user and we will get a char (+,-,/,%,*)

        double num1, num2, result;
        result = 0;
        char operator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two double type numbers : ");

        num1 = scanner.nextDouble();  //  CTRL+D to copy paste that line
        num2 = scanner.nextDouble();  //  CTRL+D for MAC: CMND+D  to copy paste that line

        /*
        To autoFormat your code in IntelliJ we use
        Windows: CTRL + ALT + L
        Mac: CMND+Option+L
         */

        System.out.println("Enter arithmetic operation you want (+,-,/,%,*) : ");
        operator = scanner.next().charAt(0);  // to get char with scanner we are using String manipulation

        System.out.println("Is first number bigger than second number ? ");
        boolean answer = scanner.nextBoolean(); // true or false

        switch (operator){
            case '+':
                result = num1+num2;
                break;
            case '-':   // This condition has a Nested Condition inside
                if(answer) {
                    result = num1 - num2;
                }else{
                    result = num2 - num1;
                }
                break;
            case '/':
                if(answer && num2!=0){
                    result = num1 / num2;
                }else {
                    if(num1!=0){
                        result = num2 / num1;
                    }else{
                        System.err.println("Unwanted Number");
                    }
                 }
                break;
            case '*':
               result = num1*num2;
               break;
            case '%':
                /*
                Syntax for Ternary operator
                variable = condition ? trueValue : falseValue ;
                 */
                result = answer ? num1%num2 : num2%num1;
            break;
            default:
                System.err.println("Unrecognized Operation");
                break;
        }

        System.out.println("result = " + result);

    }
}
