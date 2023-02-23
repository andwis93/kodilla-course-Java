package com.kodilla.matrix.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.stream.IntStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    public Library prepareBook() {
        Library library = new Library(" Library main");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Title for novel book: " + n,
                        "Author for novel book: " + n
                        , LocalDate.now().minusDays(n))));
        return library;
    }
    public Library shallowCopyLibrary(Library library) {
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library shallow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        return cloneLibrary;
    }

    public Library deepCopyLibrary(Library library) {
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library deep copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        return deepCloneLibrary;
    }

    @Test
    void testGetBooks() {
        //Given
        Library library = prepareBook();
        Library cloneLibrary = shallowCopyLibrary(library);
        Library deepCloneLibrary = deepCopyLibrary(library);

        //When
        Book bookToRemove = new Book("Title for novel book: 4",
                "Author for novel book: 4"
                , LocalDate.of(2022, 10, 9));
        library.getBooks().remove(bookToRemove);

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        assertEquals(4, library.getBooks().size());
        assertEquals(4, cloneLibrary.getBooks().size());
        assertEquals(5, deepCloneLibrary.getBooks().size());
        assertEquals(cloneLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepCloneLibrary.getBooks(), library.getBooks());
    }
}
