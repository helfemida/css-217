package assignmment2_library;

public interface PatronActions {
    void viewCatalog(LibraryCatalog catalog);
    void checkOutItem(LibraryItem item);
    void returnItem(LibraryItem item);
}