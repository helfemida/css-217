package assignmment2_library;

import java.util.Scanner;

public class CLIService {
    static CLIManager manager = new CLIManager();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("""
                Choose the role:
                1. Patron
                2. Librarian""");
        int choice = in.nextInt();
        LibraryCatalog catalog = createSampleCatalog();

        while(choice == 1)
            manager.runCLI(new Patron());
        while(choice == 2)
            manager.runCLI(new Librarian(catalog));
    }

    static LibraryCatalog createSampleCatalog(){
        LibraryCatalog catalog = new LibraryCatalog();
        catalog.addItemToCatalog(
                new Book(0, "The Great Gatsby", "Scott Fitzgerald", LibraryItemStatus.AVAILABLE));
        catalog.addItemToCatalog(
                new Book(1, "The Great Gatsby", "Harper Lee", LibraryItemStatus.AVAILABLE));
        catalog.addItemToCatalog(
                new CD(2, "Greatest Hits", "John Smith", LibraryItemStatus.AVAILABLE));
        catalog.addItemToCatalog(
                new CD(3, "Music for Relaxation", "Jane Doe", LibraryItemStatus.AVAILABLE));

        manager.setCatalog(catalog);
        return catalog;
    }
}
