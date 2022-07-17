package week10and11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SmallTasksWithArrayList {
    public static void main(String[] args) {
        /*
         1. write a program that can set the last element of the Integer arraylist to zero
                        ex:
                            list = [1,2,3,4,5];
                            output: [1,2,3,4,0];
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("numbers = " + numbers);
        numbers.set(numbers.size()-1,0);
        System.out.println("numbers = " + numbers);

        /*
         2. write a method that can swap the first and last elements of an ArrayList
         paremeter---> ArrayList
         return Type ---> a new ArrayList with result
         */
        numberSwapper(numbers);
        System.out.println("numbers after swapping = " + numbers);

        /*
        3. write a method that can multiply each odd number by 2 in an arraylist
                        ex: list = [1,2,3,4,5];
                            output: [2,2,6,4,10]
         */

        System.out.println("numbers after multiplier = " + oddMultiplier(numbers));
    }

    public static ArrayList<Integer> numberSwapper(ArrayList<Integer> arrayList){
        Collections.swap(arrayList,0,arrayList.size()-1);
        return arrayList;
    }

    public static ArrayList<Integer> oddMultiplier(ArrayList<Integer> arrayList){
        // need to iterate through my arraylist to find and multiply our ODD numbers
        // we use % modulus operator
        for (int i = 0; i < arrayList.size(); i++) {
             if(arrayList.get(i)%2==1){ // checking ODD numbers
                 arrayList.set(i,arrayList.get(i)*2);
             }
        }
        return arrayList;
    }
}
