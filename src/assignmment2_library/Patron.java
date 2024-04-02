package assignmment2_library;

public class Patron implements PatronActions{
    @Override
    public void viewCatalog(LibraryCatalog catalog) {
        catalog.showCatalog();
    }

    @Override
    public void checkOutItem(LibraryItem item) {
        item.checkOut();
    }

    @Override
    public void returnItem(LibraryItem item) {
        item.checkIn();
    }
}
