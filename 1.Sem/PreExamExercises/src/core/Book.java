package core;
/*
    2) OPGAVE: Bog
    Skriv en klasse kaldet Bog, der indeholder ISBN-nummer, titel og udgivelsesår.
    Skriv flg. metoder:
        •	Konstruktør metode
        •	Get og set metoder
        •	toString metode
        •	Skriv en equals metode baseret på ISBN
 */

public class Book {
    private String ISBN, title;
    private int releaseYear;
    public Book(String ISBN, String title, int releaseYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Book) {
            if(ISBN != null && ((Book) other).getISBN() != null) {
                return ISBN.equals(((Book) other).getISBN());
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book: " +
                "ISBN: '" + ISBN + '\'' +
                ", Title: '" + title + '\'' +
                ", Udgivelsesår: " + releaseYear;
    }
}
