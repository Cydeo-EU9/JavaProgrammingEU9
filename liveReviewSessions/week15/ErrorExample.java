package week15;

public class ErrorExample {

    // somehow you created a bad code that generates infinite loop
    // We usually do NOT handle ERRORs, we just don't do it

    /*
   Runtime Errors are due to bad coding
   Compile time errors: Your code does NOT EVEN compile
     */
    public static void main(String[] args) {
        try {
            deathlyMethod();
        }catch (StackOverflowError error){
                  System.out.println(error.getClass());
        }
        // in the catch block after exception name don't we have write e? For an object
        // the name of the bad guy does not matter- error, obj, e, r ....

        System.out.println("Codes after Error executed or NOT?");
    }


    static int counter = 0;

    public static void deathlyMethod(){
        System.out.println(counter++);
       // deathlyMethod();  you can escape from making error by changing your code
    }
}
