package week19;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        String str = "uuuuuoooooeeeejjjjkkkkkaaaalllllaiurms";

        List<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(str.split("")));

        System.out.println("list = " + list);

        Set<String> setHash = new HashSet<>();  // takes out duplicates but no order
        setHash.addAll(list);
        System.out.println("setHash = " + setHash);

        Set<String> setLinked = new LinkedHashSet<>();
        setLinked.addAll(list);
        System.out.println("setLinked = " + setLinked);

        Set<String> setTree = new TreeSet<>();
        setTree.addAll(list);
        System.out.println("setTree = " + setTree);

    }
}
