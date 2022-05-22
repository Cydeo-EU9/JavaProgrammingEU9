package week03;

public class OperatorsExamples {
    public static void main(String[] args) {

        // Assignment Operator

        int x = 10;

        x+=2; // x = x+2 : 12
        System.out.println("x = " + x); // 12
        
        x-=2;
        System.out.println("x = " + x); // 10

        x*=2;
        System.out.println("x = " + x);// 20

        x/=2;
        System.out.println("x = " + x); // 10

        x%=2;
        System.out.println("x = " + x);// 0


        // Relational Operators : > , < , >= , <=  result is boolean either true false

        int num1 = 10;
        int num2 = 5;
        boolean b = num1>num2; // true    x = y + z

        System.out.println("First number number is greater than Second number " + b);

    }
}
