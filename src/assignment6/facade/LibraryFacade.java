package assignment6.facade;

public interface LibraryFacade {
    void addBook(String title, String author);
    void borrowBook(String title);
    void returnBook(String title);
    void searchBook(String title);
}
