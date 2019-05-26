package core;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    @Test
    public void testContrainsBook_withEmptyLibrary() {
        Book gatsby = new Book("978-0-24-196567-2", "The Great Gatsby", 1925);
        Library lib = new Library();

        boolean result = lib.containsBook(gatsby);
        Assert.assertFalse(result);
    }

    @Test
    public void testContainsBook_withNonemptyLibrary() {
        Book gatsby = new Book("978-0-24-196567-2", "The Great Gatsby", 1925);
        List<Book> libBooks = new ArrayList<>();
        libBooks.add(gatsby);
        Library lib = new Library(libBooks);

        boolean result = lib.containsBook(gatsby);
        Assert.assertTrue(result);
    }

    @Test
    public void testContainsBook_withNonemptyLibraryAndAlmostSameBook() {
        Book gatsby = new Book("978-0-24-196567-2", "The Great Gatsby", 1925);
        Book anotherGatsby = new Book("978-0-24-196567-8", "The Great Gatsby II", 1989);
        List<Book> libBooks = new ArrayList<>();
        libBooks.add(gatsby);
        Library lib = new Library(libBooks);

        boolean result = lib.containsBook(anotherGatsby);
        Assert.assertFalse(result);
    }

    @Test
    public void testContainsBook_givenNullPointer() {
        Book gatsby = new Book("978-0-24-196567-2", "The Great Gatsby", 1925);
        List<Book> libBooks = new ArrayList<>();
        libBooks.add(gatsby);
        Library lib = new Library(libBooks);

        boolean result = lib.containsBook(null);
        Assert.assertFalse(result);
    }
}
