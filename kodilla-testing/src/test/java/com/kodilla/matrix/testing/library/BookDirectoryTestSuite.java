package com.kodilla.matrix.testing.library;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@DisplayName("TDD: Book Directory Test Suite")
@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite
{

    private static int testCounter=0;
    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @BeforeAll
    public static void beforeAllTests()
    {
        System.out.println("This is the beginning of test.");
    }

    @AfterAll
    public static void afterAllTests()
    {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEachTest()
    {
        testCounter++;
        System.out.println("Preparing to execute test #: " + testCounter);
    }


    @AfterEach
    public void afterEachTest()
    {
        System.out.println("Test#: " + testCounter + " was executed.");
    }


    private List<Book> generateListOfNBooks(int booksQuantity)
    {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++)
        {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }


    @Nested
    @DisplayName("Kodilla Example")
    class KodillaExample
    {

        @Test
        void testListBooksWithConditionsReturnList ()
        {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

            //When
            List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

            //Then
            assertEquals(4, theListOfBooks.size());
        }

        @Test
        void testListBooksWithConditionMoreThen20 ()
        {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

            //When
            List<Book> theListOFBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOFBooks15 = bookLibrary.listBooksWithCondition("Any Title");
            List<Book> theListOFBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

            //Then
            assertEquals(0, theListOFBooks0.size());
            assertEquals(15, theListOFBooks15.size());
            assertEquals(0, theListOFBooks40.size());

        }

        @Test
        void testListBooksWithConditionFragmentShorterThan3 ()
        {
            //Given
            LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            //When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

            //Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }
    }
    @Nested
    @DisplayName("My Exercises")
    class MyExercises
    {
        @Test
        void testListBooksInHandsOfReturnList()
        {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            LibraryUser libraryUser1 = new LibraryUser("Jon","Smith","87101112354");
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(resultListOfBooks);

            //When
            List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(libraryUser1);

            //Then
            assertEquals(4, theListOfBooks.size());
        }

        @Test
        void testListBooksInHandsOfUserRent()
        {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUserZeroBooks = new LibraryUser("JonZero","SmithZero","00000000000");
            LibraryUser libraryUserOneBooks = new LibraryUser("JonOne","SmithOne","11111111111");
            LibraryUser libraryUserFiveBooks = new LibraryUser("JonFive","SmithFive","5555555555");
            List<Book> resultListOf0Books = new ArrayList<>();
            List<Book> resultListOf1Book = generateListOfNBooks(1);
            List<Book> resultListOf5Books = generateListOfNBooks(5);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUserZeroBooks)).thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUserOneBooks)).thenReturn(resultListOf1Book);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUserFiveBooks)).thenReturn(resultListOf5Books);

            //When
            List<Book> theListOFBooks0 = bookLibrary.listBooksInHandsOf(libraryUserZeroBooks);
            List<Book> theListOFBooks1 = bookLibrary.listBooksInHandsOf(libraryUserOneBooks);
            List<Book> theListOFBooks5 = bookLibrary.listBooksInHandsOf(libraryUserFiveBooks);

            //Then
            assertEquals(0, theListOFBooks0.size());
            assertEquals(1, theListOFBooks1.size());
            assertEquals(5, theListOFBooks5.size());

        }

    }

}
