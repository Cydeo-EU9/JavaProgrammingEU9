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


        List<String> strList = new ArrayList<>();

        strList.addAll(Arrays.asList("abc","cbd","java","js","typescript","html","abc","java",null,null,null));

        // sort this list and take out duplicates and null values : winner less amount of code lines
  // less than 5
       Set<String> set = new HashSet<>();
       set.addAll(strList);
       set.remove(null);
       Set<String> sortedSet = new TreeSet<>();
       sortedSet.addAll(set);
        System.out.println("sortedSet = " + sortedSet);






    }
}
