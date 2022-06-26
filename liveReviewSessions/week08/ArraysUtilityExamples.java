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

        int [] nums3 = {5, 4, 10, 100, 50, 35}; // nums3 has different object but with same values
        System.out.println("nums3.equals(nums) = " + Arrays.equals(nums,nums3)); // true
        System.out.println( nums3 == nums) ; // false  --- like at String: checks if the objects are same

        // we are sorting nums2
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums));

        nums[0] = 1000;
        System.out.println("nums2[0] = " + nums2[0]);

        // I want to create a copy of nums3, however I want it to be a different object
        int[] nums4 = Arrays.copyOf(nums3,nums3.length);
        System.out.println(Arrays.toString(nums4));
        Arrays.sort(nums3);
        System.out.println("--after sorting nums3---");
        System.out.println("Arrays.toString(nums4 = " + Arrays.toString(nums4));
        System.out.println("Arrays.toString(nums3 = " + Arrays.toString(nums3));

    }
}
