package assignmment2_library;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog implements LibrarianActions {
    private List<LibraryItem> catalog = new ArrayList<>();

    @Override
    public void addItemToCatalog(LibraryItem item) {
        this.catalog.add(item);
    }

    @Override
    public void removeItemFromCatalog(LibraryItem item) {
        this.catalog.remove(item);
    }

    @Override
    public LibraryItem getItemByName(String name) {
        for (LibraryItem item: catalog) {
            if(item.getName().equalsIgnoreCase(name))
                return item;
        }
        return null;
    }

    public void showCatalog(){
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i));
        }
    }
}
