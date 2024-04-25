package assignment6_facade;

import java.util.ArrayList;
import java.util.List;

public class BookInventorySystem {
    private List<Book> books;

    public BookInventorySystem() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
