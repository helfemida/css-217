package assignment2.library;

public class Book implements LibraryItem {
    private Integer registrationNumber;
    private String name;
    private String author;
    private LibraryItemStatus bookStatus = LibraryItemStatus.AVAILABLE;

    @Override
    public void checkOut() {
        bookStatus = LibraryItemStatus.CHECKED_OUT;
    }

    public Book(Integer registrationNumber, String name, String author, LibraryItemStatus bookStatus) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.author = author;
        this.bookStatus = bookStatus;
    }

    @Override
    public void checkIn() {
        bookStatus = LibraryItemStatus.AVAILABLE;
    }

    @Override
    public String getName() {
        return name;
    }

}
