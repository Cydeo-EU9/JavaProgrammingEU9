package avengers_25_08_2022;

import java.util.Arrays;

public class ChildSpeak {

    public static void main(String[] args) {

            String word = "island";

            String[] wordArray = word.split("");

        System.out.println(Arrays.toString(wordArray));

        for(int i=0; i<wordArray.length; i++){
            System.out.println(wordArray[i]+" "+isConsonant(wordArray[i]));
        }


    }

/*
In the task all Rules deal with being consonant or vowel. So I created two custom methods that I can call whenever I need an answer for this issue

island  : issass
Rule 1: Turn all consonants into first consonant
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

}
