package assignment2.library;

public interface PatronActions {
    void viewCatalog(LibraryCatalog catalog);
    void checkOutItem(LibraryItem item);
    void returnItem(LibraryItem item);
}