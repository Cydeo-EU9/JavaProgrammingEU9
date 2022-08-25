package avengers_25_08_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ChildSpeak {

    public static void main(String[] args) {

            String word = "island";

            String[] wordArray = word.split("");

            String firstConsonant = firstConsonant(wordArray);
//  i s l a n d ---> with 6 chars ----> 7 chars --- > 5  --- > 4
   // I don't know how many characters my output word will be

        ArrayList<String> outputWordList = new ArrayList<>(Arrays.asList(wordArray));

        outputWordList = replaceAllwithFirstConsonant(outputWordList,firstConsonant);

        System.out.println("outputWordList = " + outputWordList);

//        System.out.println(Arrays.toString(wordArray));
//
//        for(int i=0; i<wordArray.length; i++){
//            if(isConsonant(wordArray[i]))
//            System.out.println(wordArray[i]+" consonant");
//            else if(isVowel(wordArray[i]))
//                System.out.println(wordArray[i]+" vowel");



        }




/*
In the task all Rules deal with being consonant or vowel. So I created two custom methods that I can call whenever I need an answer for this issue
- Clean Code
- Re-usability
- Working solution
- Understandable code
island  : issass
Rule 1: Turn all consonants into first consonant
    -> Find first consonant and replace the others with this one
        - > isVowel, isConsonant
        - > firstConsonant
        - > turn all into that one
{"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"} - consonant
{"a", "e", "i", "o", "u", "y"} - vowel

Rule 2: if the first character is a vowel, then put the first consonant at the beginning

island  : issass : sissass
 */

    // create two static method that takes a string as parameter and returns boolean, checks if it is vowel or consonant
    // isConsonant, isVowel

    public static boolean isConsonant(String s){
        String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};

        for(int i=0; i<consonants.length; i++){
            if(s.equals(consonants[i])) return true;
        }
        return false;
    }
    public static boolean isVowel(String s){
        String[] vowels = {"a", "e", "i", "o", "u", "y"};

        for(int i=0; i<vowels.length; i++){
            if(s.equals(vowels[i])) return true;
        }
        return false;
    }

    public static String firstConsonant(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(isConsonant(arr[i]))
                return arr[i];
        }
        return null;
    }

    // replaceAllwithFirstConsonant : parameter Arraylist, return type Arraylist

    public static ArrayList<String> replaceAllwithFirstConsonant(ArrayList<String> list,String first ){
        for (int i = 0; i < list.size(); i++) {
             if(isConsonant(list.get(i))){
                 list.set(i,first);
             }
     }
        return list;
    }

}
