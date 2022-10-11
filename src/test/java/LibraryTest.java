import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    private Borrower borrower;

    private Library library;

    @Before
    public void before(){
        book1 = new Book("The Passenger", "Cormac McCarthy", "Fiction");
        book2 = new Book("Beautiful Star", "Yukio Mishima", "Fiction");
        book3 = new Book("Dark Entries", "Robert Aickman", "Horror");
        book4 = new Book("Cloud Corporation", "Timothy Donnolly", "Poetry");
        book5 = new Book("Far Sky 11", "Charles Valdez", "Science-Fiction");

        library = new Library(8);

        borrower = new Borrower("David");
    }

    @Test
    public void canCountNumberOfBooksInLibrary(){
        assertEquals(0, library.countNumberOfBooksInLibrary());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBookToLibrary(book1);
        assertEquals(1, library.countNumberOfBooksInLibrary());
    }

    @Test
    public void canRejectMoreBooksThanLibraryCapacity(){
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book1);
        assertEquals(8, library.countNumberOfBooksInLibrary());
    }

    @Test
    public void canLendBook(){
        library.addBookToLibrary(book1);
        library.lendBook(book1, borrower);
        assertEquals(1, borrower.countBooksInBorrowersCollection());
    }


}
