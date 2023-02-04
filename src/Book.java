public class Book {
    String author;
    int pageAmount;
    String publisher;

    public Book(String author, int pageAmount, String publisher) {
        this.author = author;
        this.pageAmount = pageAmount;
        this.publisher = publisher;
    }
    public Book(String author, int pageAmount) {
        this(author, pageAmount, null);
    }
}