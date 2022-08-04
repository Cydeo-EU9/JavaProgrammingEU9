package week13.inheritance;

public class BookStore {
    public static void main(String[] args) {

        Book book = new Book("1984", "George Orwell", "Distopia", 29.5);

        System.out.println("book = " + book);
        book.buy("D&R");
        book.lend("Oscar");
        //   book.readBook();  can NOT reach  like this to child method
        AudioBook audioBook = new AudioBook("Animal Farm", "Fiction", "George Orwell", 35.50, 180, "Benjamin May");
        System.out.println("audioBook = " + audioBook);
        audioBook.buy("Amazon"); // child CAN USE parent method
        audioBook.listen();


    }
}
