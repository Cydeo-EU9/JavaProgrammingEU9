package week19;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkListExample {
    public static void main(String[] args) {

        List<Integer> linkList = new LinkedList<>();

        linkList.add(10);
        linkList.addAll(Arrays.asList(3,67,34,23,78));

        /*
        There are some methods which are only in concrete LinkList Class
        Not in the List Interface
        addFirst()
        addLast()
        poll()  : brings the first element and deletes
        we need to downcast our reference object
         */
        ((LinkedList<Integer>) linkList).addFirst(1);
        ((LinkedList<Integer>) linkList).addLast(100);

        int eachNumber = 0;
//        System.out.println("linkList = " + linkList);
//        eachNumber = ((LinkedList<Integer>) linkList).poll();
//
//        System.out.println("eachNumber = " + eachNumber);
//
//        System.out.println("linkList = " + linkList);

        for (int i = 0; i < linkList.size(); ) {  // since the size gets shrinked to zero, condition is met, so for loop ends

            eachNumber = ((LinkedList<Integer>) linkList).poll();
            System.out.println("eachNumber = " + eachNumber);

        }



    }
}
