import org.junit.Before;
import org.junit.Test;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("Real Life", "Brandon Taylor", "Novel");
    }


}
