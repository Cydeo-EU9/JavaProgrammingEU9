package week05;

public class DynamicSubstring {
    public static void main(String[] args) {


        String searchResult = "result count:34521";

        System.out.println(searchResult.length()); // last index then 18-1= 17
        // just taking numbers with substring
        String numbers = searchResult.substring(13); // when you give beginning index takes the rest of the string
        System.out.println("numbers = " + numbers);

        /*
        instead of static way: indexOf() method --> takes a string/char from you as parameter, returns the index
         */

        int columnIndex = searchResult.indexOf(':');
        System.out.println("columnIndex = " + columnIndex);

       String numbersNew = searchResult.substring(columnIndex+1);

        System.out.println(numbersNew.equals(numbers));

        String searchResultNew = " username:oscar  search result count: 12345 more column : more information ";

    /*
    we will use overloaded method of indexOf()
     */
        int firstColumnIndex = searchResultNew.indexOf(':');
        System.out.println("firstColumnIndex = " + firstColumnIndex);
        int secondColumnIndex = searchResultNew.indexOf(':',firstColumnIndex+1); // search starts from index 10
        System.out.println("secondColumnIndex = " + secondColumnIndex);

        // Where the number starts = secondColumnIndex  + 2
        // where the number finishes = secondColumnIndex  + 7

        String numbers3 = searchResultNew.substring(secondColumnIndex+2,secondColumnIndex+7);
        System.out.println("numbers3 = " + numbers3);





    }
}
