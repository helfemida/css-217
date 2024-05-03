package assignment6.facade;

public class LibraryManagementSystem implements LibraryFacade {
    private BookInventorySystem bookInventorySystem;
    private UserManagementSystem userManager;

    public LibraryManagementSystem() {
        bookInventorySystem = new BookInventorySystem();
        userManager = new UserManagementSystem();
    }
    @Override
    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        bookInventorySystem.addBook(book);
    }

    @Override
    public void borrowBook(String title) {
        Book book = bookInventorySystem.findBookByTitle(title);
        userManager.borrowBook(book);
    }

    @Override
    public void returnBook(String title) {
        Book book = bookInventorySystem.findBookByTitle(title);
        userManager.returnBook(book);
    }

    @Override
    public void searchBook(String title) {
        System.out.println("Found \n " + bookInventorySystem.findBookByTitle(title));
    }
}
