package assignment6_facade;

public class LibrarySystemApplication {
    public static void main(String[] args) {
        LibraryFacade libraryFacade = new LibraryManagementSystem();

        libraryFacade.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        libraryFacade.addBook("To Kill a Mockingbird", "Harper Lee");

        libraryFacade.borrowBook("The Great Gatsby");
        libraryFacade.borrowBook("To Kill a Mockingbird");
        libraryFacade.returnBook("The Great Gatsby");
        libraryFacade.borrowBook("The Great Gatsby");

        System.out.println("Searching for: The Great Gatsby" );
        libraryFacade.searchBook("The Great Gatsby");
    }
}
