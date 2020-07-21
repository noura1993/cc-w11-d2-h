import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library(2);
        book1 = new Book("Real Life", "Brandon Taylor", "Novel");
        book2 = new Book("The Glass Hotel", "Emily St.John", "Novel");
        book3 = new Book("Harry Potter", "J.K. Rowling", "Novel");
    }

    @Test
    public void countBooks() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBook() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertTrue(library.checkCapacity());
    }

    @Test
    public void cannotAddBook() {
        library.addBook(book1);
        library.addBook(book2);
        assertFalse(library.checkCapacity());
    }

    @Test
    public void loanBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.loanBook();
        assertEquals(1, library.bookCount());
    }


}
