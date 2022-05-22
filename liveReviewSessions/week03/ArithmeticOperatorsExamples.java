package week03;

public class ArithmeticOperatorsExamples {
    public static void main(String[] args) {

        // you should pay attention to Data Types
        System.out.println(10/3); // in math 3.333   in JAVA we only 3
        /*
        10 as int
        3 as int
        int/int  = gives you integer result
         */
        System.out.println(10/3.0); // 3.3333333333333335    int/double = reveal double result
        System.out.println(10.0/3);  // 3.3333333333333335  other variable which int is casted to double implicitly
        System.out.println(10.0/3.0);// 3.3333333333333335

        System.out.println("-----------------------------------------");

        //  % modules sign: gives remainder
        int leftover = 17%3;  // you can assign the result of an operator to a variable
        System.out.println("leftover = " + leftover);

        int outcome = 12 + 6 / 3 ;
        System.out.println("outcome = " + outcome); // 14
        // re-assign
        outcome = 4 + 17 % 2 -1 ;
        System.out.println("outcome = " + outcome); // 4

        outcome = 3+4*4+5*(4+3)-1;
        System.out.println("outcome = " + outcome); // 53


        int num1,num2,sum; // declare variable
        num1 = 46;
        num2 = 90;
        sum = num1 + num2;

        System.out.println("sum = " + sum); // 136


        /*
        Conversion formula is
        (C*1,8+32)=F
         */

        double tempInCelcius, tempInFahrenheit;
        tempInCelcius = 70.2;
        tempInFahrenheit = tempInCelcius*1.8+32;
        System.out.println("tempInFahrenheit = " + tempInFahrenheit); // 158.36


    }
}
