package task16.services;

import task16.model.Book;

import java.util.ArrayList;

public class BookViewer {
    public static String printBooks(ArrayList<Book> books){
        var sb = new StringBuilder();
        for (var book:books){
            sb.append(book.toString()).append('\n');
        }
        return sb.toString();
    }
}
