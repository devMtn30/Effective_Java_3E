package chap02.item1;

public class Book extends Product2{
    private final String author;

    protected Book(String author) {
        super("book", 0);
        this.author = author;
    }


}
