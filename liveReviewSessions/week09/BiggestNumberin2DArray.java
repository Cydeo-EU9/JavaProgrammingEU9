package week09;

import java.util.Arrays;

public class BiggestNumberin2DArray {
    public static void main(String[] args) {

        int [] arr1D_1 = {3,34,21,56,-10,100};
        int [] arr1D_2 = {3,13,41,46,-110,90,115};
        int [] arr1D_3 = {35,135,415,4602,-1110,190,1015};

        int [][] arr2D_1 = {
                arr1D_1,
                arr1D_2,
                arr1D_3
        };
    /*    int [][] arr2D_2 = {
                arr1D_1,
                arr1D_2,
                arr1D_3
        };

        int[][][] arr3D = {arr2D_1,arr2D_2};*/

        /*
        find max numbers of each 1D arrays and store them inside another 1D array
         */

        int [] biggestNumbers = new int[arr2D_1.length]; // 3

        for(int i=0; i<arr2D_1.length ; i++){
           // System.out.println("arr2D_1 = " + Arrays.toString(arr2D_1[i])); ---> I am printing 1D arrays
            int max = arr2D_1[i][0]; // assume that each 1D arrays first element is MAX number
            for(int each : arr2D_1[i]){
                if(each > max){
                    max = each;
                }
            }
            biggestNumbers[i]=max;
        }

        System.out.println(Arrays.toString(biggestNumbers));
    }
}
