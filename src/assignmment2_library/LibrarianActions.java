package assignmment2_library;


public interface LibrarianActions {
    void addItemToCatalog(LibraryItem item);

    void removeItemFromCatalog(LibraryItem item);
    LibraryItem getItemByName(String name);

}
