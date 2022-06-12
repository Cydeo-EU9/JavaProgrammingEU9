package week05;

public class StringReview03 {
    public static void main(String[] args) {
        /*
        substring(index,index) :  method ask from me what int-indexNumber,  return to me : a new String in string pool
       replace() method : it takes chars (old and new chars)  ---> a new String
                        : it also takes Strings (old and new) ---> a new String
      */

        String message = "we still HAVE a long Way to go, So be patient!";
        // make first character uppercase rest is lowercase

        message = message.substring(0,1).toUpperCase() + message.substring(1).toLowerCase();

        System.out.println("message = " + message);

        // How we can do partial uppercase
        String word = "java";

        word = word.replace('j','J');

        System.out.println("word = " + word);

        String browsers = "Automation with Chrome Driver";
        // change chrome to firefox
       browsers =  browsers.replace("Chrome","Firefox");
        System.out.println("browsers = " + browsers);

    }
}
