package com.kodilla.matrix.patterns2.adapter.bookclasifier;

import com.kodilla.matrix.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.matrix.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.matrix.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.matrix.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {
        Map<BookSignature, BookB> books = new HashMap<>();
        for(BookA book : bookSet) {
            books.put(new BookSignature(book.getSignature()), new BookB(book.getAuthor(),book.getTitle(),book.getPublicationYear()));

        }
        for (Map.Entry<BookSignature, BookB> b: books.entrySet()){
            System.out.println(b.getKey() + " = " + b.getValue());
        }
        return medianPublicationYear(books);
    }
}
