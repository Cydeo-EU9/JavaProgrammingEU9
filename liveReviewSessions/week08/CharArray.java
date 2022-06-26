package week08;

public class CharArray
{
    public static void main(String[] args) {

        char[] letters = {'j','a','v','a',' ','i','s',' ','f','u','n'};

        for (char letter : letters) {
            System.out.print(letter+" ");
        }
        System.out.println();
// sequence of chars : String
        String sentence = new String(letters);
        System.out.println("sentence = " + sentence);

        char [] newLetters = sentence.toCharArray();  // in automation or in examples we will use this toCharArray
        for (char newLetter : newLetters) {
            System.out.print(newLetter+" ");
        }

        /*
        find the frequency of chars in a string
         */

        System.out.println();
        String str = "aaabbcdddeffff";
        char[] arr = str.toCharArray();

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if(c == arr[j]){
                    count++;
                }
             }
            if(result.contains(""+c)){
                continue;  // if my result string has this char, go to beginning of loop
            }

            result+=c;
            result+=count;

        }
        System.out.println("result = " + result);


    }
}
