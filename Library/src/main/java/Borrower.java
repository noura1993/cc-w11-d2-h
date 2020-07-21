import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<Book>();
    }

    public int countBook() {
        return this.books.size();
    }

    public void borrowBook(Library library) {
        Book book = library.loanBook();
        if(book != null) {
            this.books.add(book);
        }
    }
}
