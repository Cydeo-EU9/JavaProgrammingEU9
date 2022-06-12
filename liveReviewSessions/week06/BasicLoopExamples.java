package week06;

public class BasicLoopExamples {
    public static void main(String[] args) {
/*
Question-1:

         Write a for loop that displays the following set of numbers:

         0,10,20,30,40,50,...1000

         int i = 0 initialization
         i<=1000 : condition
         i+=10: iteration
 */
// -------iterate 10 by 10
        for(int i = 0; i<=1000 ; i+=10){
            if(i<1000) {
                System.out.print(i + ",");
            }else{
                System.out.print(i);
            }
        }
        System.out.println("--------------------------------");
// iterate 1 by 1
        for(int i = 0; i<=1000 ; i++){
            if(i%10==0){
                if(i<1000) {
                    System.out.print(i + ",");
                }else{
                    System.out.print(i);
                }
            }
    }

    //    System.out.println(i);
/*
How can I use "int i" variable declaration twice inside same java class?
 int i : is local to the for loop that we created
 */
        System.out.println("----------------------------------------");
        int x = 0; // initialization
        for(  ; x <= 1000 ; ){ // condition
            if(x%10==0){
                System.out.print(x+" ");
            }
            x++; // iteration
        }

        System.out.println("x = " + x); // our iterated variable "x" is NOT local anymore

        System.out.println();
        System.out.println("-----------------------");

        boolean check = true;

        for(int i = 0; check ; i+=10){

            System.out.print(i+" ");

            if(i==1000){
                check = false;
            }
        }


    }


}
