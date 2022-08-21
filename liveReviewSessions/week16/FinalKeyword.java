package week16;


import java.util.ArrayList;
import java.util.Arrays;

class Test{              // we deleted final keyword so we can inherit
    void method(){       // we deleted final keyword so we can override
        System.out.println("Hello");
    }

    void method(int x){
        System.out.println(x);
    }
}

public class FinalKeyword extends Test{

    final int y;
    final static int z;

    public FinalKeyword(){
        y=5;
    }
    static {
        z=10;
    }
    void method(){
        System.out.println("I am trying override thye parent method");
    }

    public static void main(String[] args) {

        final int x ;   // local variable
       // x=5;
       // System.out.println(x);

        final int[] nums = {1,2,3};
        System.out.println(nums[0]);
        nums[0]=5;
        System.out.println(nums[0]);

       // nums = new int[]{5,6,7};  not allowed

        final ArrayList<String> colors = new ArrayList<>();

        colors.add("Orange");
        colors.add("Red");

        colors.remove(0);

        // colors = new ArrayList<>();

        colors.addAll(Arrays.asList("Blue","Green","White"));

        final ArrayList<String> Users = new ArrayList<>();

        /*
        If something is created by Java Developers it is due to a need...
         */
    }
}
