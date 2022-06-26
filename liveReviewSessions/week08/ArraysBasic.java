package week08;

import java.util.Arrays;

public class ArraysBasic {
    public static void main(String[] args) {

        int code = 200;

        /*
        When you have more than one data
        DATA Structures in JAVA
        Arrays : size is fixed, not re-sizable, hold same type of Data, primitives and objects
        ArrayList, List, Collections, Set, Map.... --> Object Type

        Arrays: are zero indexed Data Structure
        Default Values:
        int  ---> 0
        double ---> 0.0
        String ----> null
         */

        int[] codes = new int[8]; // my array holds 8 elements, they are all interger type

        codes[0] = 200; // first element
        codes[2] = 204; // third element
        codes[codes.length-1] = 500; // last element
        for (int i = 0; i < codes.length; i++) {
            System.out.println("codes["+i+"] = " + codes[i]);
        }

        System.out.println(Arrays.toString(codes));

        System.out.println("----second way of creating arrays");

        int [] statusCodes = {200,201,204,400,401,403,404,500}; // declare and initialize your array

        for (int i = 0; i < statusCodes.length; i++) {
            System.out.println("statusCodes = " + statusCodes[i]);

        }

    //    String str = new String("Bad Request"); // we are creating a String object
        /*
        PIQ : explain String pool and JAVA memory structure
        2 ways of creating String
        literal way  : goes to String Pool
        with new keyword : not in the string pool
Each Status Code means = 200 : OK
Each Status Code means = 201 : Created
Each Status Code means = 204 : No Content
Each Status Code means = 400 : Bad Request
Each Status Code means = 401 : Unauthorized
Each Status Code means = 403 : Forbidden
Each Status Code means = 404 : Not Found
Each Status Code means = 500 : Internal Server Error
         */
        String [] responseTypes = new String[]{"OK","Created","No Content","Bad Request","Unauthorized","Forbidden","Not Found","Internal Server Error"};

        int sizeOfArrays = responseTypes.length;

        for (int i=0; i<sizeOfArrays; i++){
            String text = statusCodes[i]+" : "+responseTypes[i];
            System.out.println("Each Status Code means ="+text);
        }


    }
}
