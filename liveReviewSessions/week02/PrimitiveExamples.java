package week02;

public class PrimitiveExamples {
    public static void main(String[] args) {
        // Variables : Primitive Types: Numbers || Characters  || Boolean
        /*
        Numbers: Integers ----> byte -> short -> int -> long
                decimals(floating points) ---> float and double
        Characters: char data type
                    not primitive however String : collection of chars
        Boolean: true / false   (1000100111)
         */
        // DataType
        /*
        DataType variableName = Value ; 1. Declare and 2.initialize at the same line

        DataType variableName; 1. Declare
        variableName = Value; 2.initialize

        DataType variableName1, variableName2;
         */

        byte num1; // Declare a variable
        num1 = 123; // Initialize, assign a value

        num1 = 121; // re-assigne a different value

        short num2 = 12398; // declare and initialize

        int distance = 1_000_000_000;
        System.out.println("distance = " + distance);

        long distanceMore = 3_000_000_000l;  // passing the limit so I have to put L
        long distanceShorter = 1_000_000_000; // inside the limit

        float rate = 1000.5F;
        double dNumber = 123.4;

        System.out.println("----After Castings-----");
        // I will assign num1 (byte) to num2 (short) --- > from smaller dataType to bigger dataType
        num2 = num1; // there is implicit casting : done by compiler
        System.out.println("num2 = " + num2);

        // I will assign distance variable value to num2 variable ----> from bigger dataType to a smaller dataType
        num2 = (short) distance;  // explicit casting ---> done ny developer/tester
        System.out.println("num2 = " + num2);

        char ch = 'a';
        System.out.println("ch = " + ch);

        int x = 5 + ch;  // 97 = 'a'   ascii table
        System.out.println("x = " + x);

        String str = ""+'J'+'a'+'v'+'a';  // empty ""; makes all the chars coming after to turn into Strings
        System.out.println("str = " + str);  // Java
/*
Note: Important rulo of Java --> java runs from left to right : String+char = String
"C"  --- > String
'C'  ----> char

 */


        int y = 'J'+'a'+'v'+'a';
        System.out.println("y = " + y); // 386


   boolean b1 = true;   // you can assign conditions to these variable
   boolean b2 = false;
        System.out.println("b2 = " + b2);
        /*
        x=5;
        y=2;
        x > y ---> true result
         */

        double _average = 5.5;
        String EU9 = "EU9 is great";
        String println = "Not a reserved word";
      //  String for = "reserved word";
    }

    /*
    Naming Rules --- Examples for Valid (V) and Invalid (I) Examples:
    _average : V  --> we can use _ and $ underScore at the beginning of variableName
    EU9 : V --- we can use numbers if they are not first characters
    ABC : V
    println : V not a reserved word
    for : I reserved word for java
    "hello" : I starts with "
    sum_of_data : V
    first-name : I  we can not use - dash
    42isTheSolution : I --- can NOT start with number

variable name: starts with small letter, and if you have more word, then we use camel case
sumOfData (naming convention)

     */

}
