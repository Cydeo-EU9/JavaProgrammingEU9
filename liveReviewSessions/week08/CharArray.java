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
    }
}
