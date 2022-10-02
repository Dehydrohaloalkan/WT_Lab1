package task16;

import task16.model.Book;
import task16.repositories.BookRepository;
import task16.services.BookViewer;

import java.util.Comparator;

public class task16 {
    public static void main(String[] args) {
        var bookRepository = new BookRepository();

        var books = bookRepository.getBooks();
        Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
        books.sort(titleComparator);
        System.out.println("Sorted by title:");
        System.out.println(BookViewer.printBooks(books));

        books = bookRepository.getBooks();
        Comparator<Book> titleAuthorComparator = Comparator.comparing(Book::getTitle);
        titleAuthorComparator = titleAuthorComparator.thenComparing(Book::getAuthor);
        books.sort(titleAuthorComparator);
        System.out.println("\nSorted by title, then by author name:");
        System.out.println(BookViewer.printBooks(books));

        books = bookRepository.getBooks();
        Comparator<Book> authorTitleComparator = Comparator.comparing(Book::getAuthor);
        authorTitleComparator = authorTitleComparator.thenComparing(Book::getTitle);
        books.sort(authorTitleComparator);
        System.out.println("\nSorted by author name, then by title:");
        System.out.println(BookViewer.printBooks(books));

        books = bookRepository.getBooks();
        Comparator<Book> fullComparator = Comparator.comparing(Book::getAuthor);
        fullComparator = fullComparator.thenComparing(Book::getTitle);
        fullComparator = fullComparator.thenComparingInt(Book::getPrice);
        books.sort(fullComparator);
        System.out.println("\nSorted by author, then by title, then by price:");
        System.out.println(BookViewer.printBooks(books));
    }
}
