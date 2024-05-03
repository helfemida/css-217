package assignment2.library;

public class CD implements LibraryItem {
    private Integer registrationNumber;
    private String name;
    private String director;
    private LibraryItemStatus status = LibraryItemStatus.AVAILABLE;

    public CD(Integer registrationNumber, String name, String director, LibraryItemStatus status) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.director = director;
        this.status = status;
    }

    @Override
    public void checkOut() {
        status = LibraryItemStatus.CHECKED_OUT;
    }

    @Override
    public void checkIn() {
        status = LibraryItemStatus.AVAILABLE;
    }

    @Override
    public String getName() {
        return name;
    }
}
