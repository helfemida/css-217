package assignment2.library;


public interface LibrarianActions {
    void addItemToCatalog(LibraryItem item);

    void removeItemFromCatalog(LibraryItem item);
    LibraryItem getItemByName(String name);

}
