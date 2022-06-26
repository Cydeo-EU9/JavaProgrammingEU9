package week08;

import java.util.Arrays;

public class ArraysUtilityExamples {
    public static void main(String[] args) {

        int [] nums = {5, 4, 10, 100, 50, 35};

        int [] nums2 = nums;
        /*
        The real object that holds space in memory is '{5, 4, 10, 100, 50, 35};' part
        nums or nums2 : they are just reference to the same object
         */


        System.out.println("nums2.equals(nums) = " + Arrays.equals(nums,nums2)); // true
        System.out.println( nums2 == nums) ; // true

        int [] nums3 = {5, 4, 10, 100, 50, 35};
        System.out.println("nums3.equals(nums) = " + Arrays.equals(nums,nums3)); // true
        System.out.println( nums3 == nums) ; // false  --- like at String: checks if the objects are same

        // we are sorting nums2
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums));

    }
}
