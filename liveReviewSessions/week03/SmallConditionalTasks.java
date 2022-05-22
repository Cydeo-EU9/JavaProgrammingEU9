package week03;

public class SmallConditionalTasks {
    public static void main(String[] args) {

        // Write an if statement that assigns 5 to x when y is equal to 20
        /*
        When we are dealing with Variables there are two actions 1. Declare 2. Initialize
         */

        int y = 20;
        int x ;  // declared my variable but not value

//        if(y == 20 ){
//            // code segment
//            x = 5;
//        }else
//        {
//            x = 0;
//        }
//        System.out.println("x = " + x);

        boolean b = y == 20; // true

        if(b){   // if the condition is NOT met what the compiler will do
            x = 5;  // initialize
        }else
        {
            x = 0; // initialize
        }
        System.out.println("x = " + x);

        // Our compiler is DUMB: you need to tell every step

        char ch1 = 'A';
        char ch2 = 'Z';

        if(ch2 > ch1){
            System.out.println("Second Character comes after First One");
        }else{
            System.out.println("First Character comes after Second One");
        }

        /*
        Write a Java program:
1) Declare a variable and initialize user age.
2) Then the program will show if the user is eligible to vote. A Person who is eligible to
vote must be older than or equal to 18 years old.
Input: Enter your age :18
Output: You are eligible to vote
         */

        int age ;  // declare
        age = 10;
        String eligibleOrNot ;
        if(age >= 18 ){
            eligibleOrNot = "Eligible";
        }else{
            eligibleOrNot = "Not Eligible";
        }
        System.out.println("eligibleOrNot for Voting = " + eligibleOrNot);

    }
}
