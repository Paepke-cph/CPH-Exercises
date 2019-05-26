package core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public Library() { }

    public Library(List<Book> books) {
        this.books = books;
    }

    public boolean containsBook(Book book) {
        for (Book entry : books) {
            if(entry.equals(book)) {
                return true;
            }
        }
        return false;
    }
}
