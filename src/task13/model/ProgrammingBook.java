package task13.model;

import task12.model.Book;

public class ProgrammingBook extends Book {

    private String language;
    private int level;

    public ProgrammingBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + getLanguage().hashCode() + getLevel() * 2;
    }

    @Override
    public String toString() {
        return super.toString() + "; Language: " + getLanguage() + "; Level: " + getLevel();
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }

        if(object == null || !object.getClass().equals(getClass())) {
            return false;
        }

        var book = (ProgrammingBook)object;
        return book.getAuthor().equals(getAuthor()) &&
                book.getPrice() == getPrice() &&
                book.getTitle().equals(getTitle()) &&
                book.getLanguage().equals(getLanguage()) &&
                book.getLevel() == getLevel();
    }
}
