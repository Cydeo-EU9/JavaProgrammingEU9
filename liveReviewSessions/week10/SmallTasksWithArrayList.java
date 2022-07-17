package week10;

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

    }

    public static ArrayList<Integer> numberSwapper(ArrayList<Integer> arrayList){
        Collections.swap(arrayList,0,arrayList.size()-1);
        return arrayList;
    }
}
