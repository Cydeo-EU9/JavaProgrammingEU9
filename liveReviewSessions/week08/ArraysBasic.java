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
    }
}
