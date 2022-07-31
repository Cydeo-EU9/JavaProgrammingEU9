package week13;

  // WE HAD TO IMPORT THIS CLASS

import week13.inheritance.Book;

public class PaperBook extends Book {


    public void read(){
        System.out.println("Reading paper book");
        System.out.println("title = " + title);  // since these fields are protected I can reach even if they are NOT in the same package
       // System.out.println("price = " + price); // Cannot be accessed from outside package
    }
}
