package com.kodilla.matrix.patterns2.adapter.bookclassifier;

import com.kodilla.matrix.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.matrix.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void testMedian() {
        //Given
        Set<BookA> books = new HashSet<>();
        books.add(new BookA("Ken Kesey", "One Flew Over the Cuckoo’s Nest", 1962, "Bk1" ));
        books.add(new BookA("Charles Dickens", "Hard Times", 2018, "Bk2" ));
        books.add(new BookA("Garth Ennis and Steve Dillon", "Preacher", 2019, "Bk3" ));
        books.add(new BookA("Roddy Doyle", "Two Pints", 2011, "Bk4" ));
        books.add(new BookA("Fyodor Dostoyevsky", "Crime and Punishment", 2020, "Bk5" ));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(books);

        //Then
        System.out.println(median);
            assertEquals(median, 2018);
    }
}
