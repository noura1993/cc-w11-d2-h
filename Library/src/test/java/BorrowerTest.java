import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book("Harry Potter", "J.K. Rowling", "Novel");
        library = new Library(2);

    }

    @Test
    public void canBorrowBook() {
        library.addBook(book);
        borrower.borrowBook(library);
        assertEquals(1, borrower.countBook());
    }

    @Test
    public void cannotBorrowBook() {
        borrower.borrowBook(library);
        assertEquals(0, borrower.countBook());
    }

}
