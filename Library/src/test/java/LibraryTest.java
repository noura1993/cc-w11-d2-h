import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library();
        book1 = new Book("Real Life", "Brandon Taylor", "Novel");
        book2 = new Book("The Glass Hotel", "Emily St.John", "Novel");
        book3 = new Book("Harry Potter", "J.K. Rowling", "Novel");
    }

    @Test
    public void countBooks() {
        assertEquals(0, library.bookCount());
    }


}
