package task16.repositories;

import task16.model.Book;

import java.util.ArrayList;

public class BookRepository {
    public ArrayList<Book> getBooks(){
        var list = new ArrayList<Book>();
        list.add(new Book("In Search of Lost Time", "Marcel Proust", 30));
        list.add(new Book("Ulysses", "James Joyce", 40));
        list.add(new Book("Don Quixote", "Miguel de Cervantes", 20));
        list.add(new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", 90));
        list.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 85));
        return list;
    }
}
