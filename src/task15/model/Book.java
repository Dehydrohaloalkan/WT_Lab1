package task15.model;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String isbn;
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object){
            return true;
        }
        if (object == null || getClass() != object.getClass()){
            return false;
        }
        var book = (Book) object;
        return price == book.getPrice() &&
                Objects.equals(title, book.getTitle()) &&
                Objects.equals(author, book.getAuthor());
    }

    @Override
    public int hashCode() {
        return getPrice() + getAuthor().hashCode() * 4 + getTitle().hashCode() * -5;
    }

    @Override
    public String toString() {
        return "title: " + title + "; author: " + author + "; price: " + price;
    }

    @Override
    public Object clone(){
        return new Book(title, author, price);
    }

    @Override
    public int compareTo(Book book) {
        return isbn.compareTo(book.getIsbn());
    }
}
