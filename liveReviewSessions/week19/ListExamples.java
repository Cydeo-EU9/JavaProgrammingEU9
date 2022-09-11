package week19;

import java.util.*;

public class ListExamples {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(); // polymorphic way
        ArrayList<String> arrayList = new ArrayList<>();// regular object

        stringList = new Stack<>(); // I can do this, we can change the object type

        // STACK = LIFO

        stringList.add("Yasar");
        stringList.add("Mikey");
        stringList.addAll(Arrays.asList("Yasar","Omer","Maya","Kamuran","Nermin","Jamal",null,null));

        System.out.println("stringList = " + stringList);
        System.out.println(stringList.get(3));

        // Reference type is List, object type is Stack, so in order to call Stack methods we need to downcast
        System.out.println(((Stack)stringList).peek());
        System.out.println("stringList = " + stringList);

        System.out.println(((Stack)stringList).pop());
        System.out.println("stringList = " + stringList);

       ((Stack<String>) stringList).push("Oscar");
        System.out.println("stringList = " + stringList);
        System.out.println(((Stack)stringList).pop());
        System.out.println("stringList = " + stringList);

        // Collections Utility Class, very useful methods
        // Collections.sort(stringList);
        System.out.println(((Stack)stringList).pop());
        Collections.sort(stringList);
        System.out.println("stringList = " + stringList);

    }
}
