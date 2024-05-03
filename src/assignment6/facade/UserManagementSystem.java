package assignment6.facade;

public class UserManagementSystem {
    public boolean borrowBook(Book book) {
        if(!book.isAvailable()) {
            System.out.println("This book is now available");
            return false;
        }
        book.setAvailable(true);
        System.out.println("You have borrowed the book: " + book.getTitle() + " - " + book.getAuthor());
        return true;
    }

    public boolean returnBook(Book book) {
        book.setAvailable(true);
        System.out.println("You have successfully returned the book: " + book.getTitle() + " - " + book.getAuthor());
        return true;
    }

    public boolean isAvailable(Book book) {
        return book.isAvailable();
    }

    public Book search(String bookName, BookInventorySystem system) {
        return system.findBookByTitle(bookName);
    }
}
