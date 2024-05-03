package assignment2.library;

public class Magazine implements LibraryItem {
    private Integer registrationNumber;
    private String name;
    private String company;
    private LibraryItemStatus status;

    public Magazine(Integer registrationNumber, String name, String company, LibraryItemStatus status) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.company = company;
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
