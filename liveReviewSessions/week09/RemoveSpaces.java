package week09;

import java.util.Arrays;

public class RemoveSpaces {
     /*
          Task 3 :    Write a method that can remove  all extra space from String


    			 Input: "  Hello world      I      love      Java    "
        	     Output: Hello world I love Java
       */
     public static void main(String[] args) {
         String str = "  Hello world      I      love      Java    ";
         System.out.println(removeExtraSpaces(str));
         System.out.println(removeWithSimpleWay(str));
     }
    public static String removeExtraSpaces(String input){
        String[] s = input.trim().split(" "); // this line also keeps empty spaces as a array element
      //  System.out.println(Arrays.toString(s));
      //  System.out.println(s.length);
        String result = "";
        for(String each: s){      // check each element of s array
            if(!each.isEmpty()){   // add it to our result string is it is NOT an empty element
                result +=each+" ";
            }
        }
      return result;
    }
    public static String removeWithSimpleWay(String input){

         return input.trim().replaceAll(" ","");
   }

}
