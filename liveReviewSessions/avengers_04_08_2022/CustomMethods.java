package avengers_04_08_2022;

public class CustomMethods {
    /*
    grouping a series of codes: it makes action, we make it reusable
    AccessModifier Specifier ReturnType MethodName( Parameters ){ Statement }

    from main method{  MethodName(argument)   }
    pass by value
     */
    public static void main(String[] args) {
        int personAge = 10;
        if(personAge>21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }
        int personTwoAge = 20;
        if(personTwoAge>21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }
        int personThreeAge = 25;
        if(personThreeAge>21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }

        String result = "";
        /*
        create a method that returns String, and we assign the string to a variable
         */

        result = isEligible(personAge);
        System.out.println("result = " + result);
    }

    public static String isEligible(int age){
        return age>21 ? "Eligible":"Not Eligible"; // ternary
    }

}
