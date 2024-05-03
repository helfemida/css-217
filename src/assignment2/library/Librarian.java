package assignment2.library;

public class Librarian implements LibrarianActions{

    private LibraryCatalog catalog;

    public Librarian(LibraryCatalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public void addItemToCatalog(LibraryItem item) {
        catalog.addItemToCatalog(item);
    }

    @Override
    public void removeItemFromCatalog(LibraryItem item) {
        catalog.removeItemFromCatalog(item);
    }

    @Override
    public LibraryItem getItemByName(String name) {
        return catalog.getItemByName(name);
    }
}
