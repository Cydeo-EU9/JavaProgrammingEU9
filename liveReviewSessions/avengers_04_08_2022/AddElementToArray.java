package avengers_04_08_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class AddElementToArray {
    /*
    Reason for this example: to understand How Arraylist use Arrays in background
    - To understand more about custom methods
    - Arrays practice

    Create a new method that adds element to an existing Array
    Method will accept a String Array, a String variable as parameter, Return Type should be a String Array
     */
    public static void main(String[] args) {

        String[] browserTypes = {"Chrome","Firefox","Safari"};
        String newBrowserOne = "Edge";
        String newBrpwserTwo = "Opera";
        System.out.println(Arrays.toString(browserTypes));

        browserTypes = addElement(browserTypes,newBrowserOne);
        // browserTypes is just a pointer (object reference), when I call addElement method, returning a new Array object, our object reference is now pointing to new object in memory
        // {"Chrome","Firefox","Safari"} this old object picked up by garbage collector


        // WHole thing is called REASSIGNING

        System.out.println(Arrays.toString(browserTypes));

        browserTypes = addElement(browserTypes,newBrpwserTwo);
        System.out.println(Arrays.toString(browserTypes));


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList("Chrome","Firefox","Safari"));
        arrayList.add(newBrowserOne);

    }

    public static String[] addElement(String[] arr, String element){
        // String[] arr this is Fixed size: I can not increase the size of original array
        String[] newArray = new String[arr.length+1];
//        int i = 0;
//        for( ; i < arr.length ; i++){
//            newArray[i] = arr[i];   // up to index 2 and leave loop
//        }
//        newArray[i] = element;

        for(int j = 0; j < newArray.length ; j++){
            if(j== newArray.length-1){
                newArray[j] = element;
                break;
            }
            newArray[j]=arr[j];
        }

        return newArray;
    }

}
