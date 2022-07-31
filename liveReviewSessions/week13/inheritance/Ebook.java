package week13.inheritance;

public class Ebook extends Book{
    int sizeAtMemory;
    int pages;

    public Ebook(){
        super();
    }

    public void readBook(){
        System.out.println("Reading the book from my Tablet");
        System.out.println("title = " + title);  // since there is inheritance relationship I cab reach this field
        System.out.println("author = " + author);
        System.out.println("type = " + type);
        System.out.println("price = " + price);
        System.out.println("sizeAtMemory = " + sizeAtMemory);
        System.out.println("pages = " + pages);
    }


}
