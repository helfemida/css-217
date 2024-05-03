package assignment2.library;

import java.util.Scanner;

public class CLIManager {
    Scanner in = new Scanner(System.in);
    private LibrarianActions librarian;
    private PatronActions patron;
    private LibraryCatalog catalog;

    public void setCatalog(LibraryCatalog catalog) {
        this.catalog = catalog;
    }

    public void runCLI(LibrarianActions librarian) {

        this.librarian = librarian;

        System.out.println("""
                1. Add item
                2. Delete item
                """);

        int userChoice = in.nextInt();

        switch (userChoice) {
            case 1: {
                System.out.println("Type: ");
                String type = in.next();
                System.out.println("Name: ");
                String name = in.next();
                System.out.println("Author/Director/Company: ");
                String company = in.next();
                if(type.equalsIgnoreCase("book"))
                    librarian.addItemToCatalog(
                            new Book(0, name, company, LibraryItemStatus.AVAILABLE));
                else if(type.equalsIgnoreCase("cd"))
                    librarian.addItemToCatalog(
                            new CD(0, name, company, LibraryItemStatus.AVAILABLE));
                else if(type.equalsIgnoreCase("magazine"))
                    librarian.addItemToCatalog(
                            new Magazine(0, name, company, LibraryItemStatus.AVAILABLE));
                break;
            }
            case 2:{
                System.out.println("Enter the name: ");
                librarian.removeItemFromCatalog(librarian.getItemByName(in.nextLine()));
                break;
            }
        }
    }

    public void runCLI(PatronActions patron) {

        this.patron = patron;
        System.out.println("""
                1. View Catalog
                2. Check-out item
                3. Check-in item
                """);

        int userChoice = in.nextInt();

        switch (userChoice){
            case 1:
                patron.viewCatalog(catalog);
                break;
            case 2:
                System.out.println("Name: ");
                catalog.getItemByName(in.nextLine());
                patron.checkOutItem(catalog.getItemByName(in.nextLine()));
                break;
            case 3:
                System.out.println("Name: ");
                catalog.getItemByName(in.nextLine());
                patron.returnItem(catalog.getItemByName(in.nextLine()));
                break;
        }

    }

}
