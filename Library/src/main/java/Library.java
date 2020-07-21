import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(this.checkCapacity()) {
            this.books.add(book);
        }
    }

    public boolean checkCapacity() {
        return this.capacity > this.bookCount();
    }

    public Book loanBook() {
        if(this.bookCount() > 0) {
            return this.books.remove(0);
        }
        return null;
    }
}
