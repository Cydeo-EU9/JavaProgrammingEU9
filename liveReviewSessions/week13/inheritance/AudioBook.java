package week13.inheritance;

public class AudioBook extends Book {

    int lengthOfRecording;
    String narrator;

    public AudioBook(String title, String type, String author, double price, int lengthOfRecording, String narrator) {
        super(title, type, author, price);
        this.lengthOfRecording = lengthOfRecording;
        this.narrator = narrator;
    }

    public void listen(){
        System.out.println("title = " + title);
        System.out.println("price = " + price);
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "lengthOfRecording=" + lengthOfRecording +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
