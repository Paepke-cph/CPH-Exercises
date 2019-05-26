package core;

import org.junit.Test;
import org.junit.Assert;

public class BookTest {

    @Test
    public void testGetISBN() {
        String ISBN = "978-0-24-196567-2";
        Book gatsby = new Book(ISBN, "The Great Gatsby", 1925);

        Assert.assertEquals(ISBN,gatsby.getISBN());
    }

    @Test
    public void testSetISBN() {
        String ISBN = "978-0-24-196567-2";
        Book gatsby = new Book(ISBN, "The Great Gatsby", 1925);
        String newISBN = "978-0-24-196567-9";

        gatsby.setISBN(newISBN);

        Assert.assertEquals(newISBN,gatsby.getISBN());
    }

    @Test
    public void testGetTitle() {
        String title = "The Great Gatsby";
        Book gatsby = new Book("978-0-24-196567-2",title,1925);

        Assert.assertEquals(title,gatsby.getTitle());
    }

    @Test
    public void testSetTitle() {
        String title = "The Great Gatsby";
        Book gatsby = new Book("978-0-24-196567-2",title,1925);
        String newTitle = "Improved Great Gatsby";

        gatsby.setTitle(newTitle);

        Assert.assertEquals(newTitle,gatsby.getTitle());
    }

    @Test
    public void testGetReleaseYear() {
        int releaseYear = 1925;
        Book gatsby = new Book("978-0-24-196567-2","The Great Gatsby",releaseYear);

        Assert.assertEquals(releaseYear,gatsby.getReleaseYear());
    }

    @Test
    public void testSetReleaseYear() {
        int releaseYear = 1925;
        Book gatsby = new Book("978-0-24-196567-2","The Great Gatsby",releaseYear);
        int newReleaseYear = 1944;

        gatsby.setReleaseYear(newReleaseYear);

        Assert.assertEquals(newReleaseYear,gatsby.getReleaseYear());
    }

    @Test
    public void testToString() {
        String ISBN = "978-0-24-196567-2";
        String title = "The Great Gatsby";
        int releaseYear = 1925;
        Book gatsby = new Book(ISBN,title,releaseYear);
        String exp = "Book: " +
                "ISBN: '" + ISBN + '\'' +
                ", Title: '" + title + '\'' +
                ", Udgivelsesår: " + releaseYear;
        String res = gatsby.toString();
        Assert.assertEquals(exp,res);
    }

    @Test
    public void testEquals_withEqualBooks() {
        String ISBN = "978-0-24-196567-2";
        String title = "The Great Gatsby";
        int releaseYear = 1925;
        Book gatsby = new Book(ISBN,title,releaseYear);
        Book gatsby2 = new Book(ISBN,title,releaseYear);

        Assert.assertTrue(gatsby.equals(gatsby2));
    }

    @Test
    public void testEquals_withDifferentYearAndTitle() {
        String ISBN = "978-0-24-196567-2";
        String title = "The Great Gatsby";
        int releaseYear = 1925;
        Book gatsby = new Book(ISBN,title,releaseYear);
        Book gatsby2 = new Book(ISBN,"The Great Gatsby II",1977);

        Assert.assertTrue(gatsby.equals(gatsby2));
    }

    @Test
    public void testEquals_withDifferentISBN() {
        String ISBN = "978-0-24-196567-2";
        String title = "The Great Gatsby2";
        int releaseYear = 1985;
        Book gatsby = new Book(ISBN,title,releaseYear);
        Book gatsby2 = new Book("978-0-24-192322-9",title,releaseYear);

        Assert.assertFalse(gatsby.equals(gatsby2));
    }

}
