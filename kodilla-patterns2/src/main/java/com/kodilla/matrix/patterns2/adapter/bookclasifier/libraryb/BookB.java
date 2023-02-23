package com.kodilla.matrix.patterns2.adapter.bookclasifier.libraryb;

public class BookB {
    private final String author;
    private final String title;
    private final int yearOfPublication;

    public BookB(final String author, final String title, final int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return  "AUTHOR: " + author +
                ", TITLE: '" + title + '\'' +
                ", YEAR OF PUBLICATION: (" + yearOfPublication + ")";
    }
}
