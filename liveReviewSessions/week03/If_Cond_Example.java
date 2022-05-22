package week03;

public class If_Cond_Example {
    public static void main(String[] args) {
        /*
        Write Java program that will accept three numbers and return the greatest number.
        Assume that your numbers are not equal....
• Input:
Enter first number: 4
Enter second number: 8
Enter third number: 1
• Output:
The greatest number is: 8
         */

        int num1,num2,num3;

        int maxNum;

        num1 = 4; num2 = 8; num3 = 1;

        if(num1>num2 && num1>num3){
            maxNum = num1;
        }else if (num2>num1 && num2 > num3){
            maxNum = num2;
        }else {
            maxNum = num3;  // if non of the conditions above is true then there is only one solution left
        }

        System.out.println("maxNum = " + maxNum);



    }
}
