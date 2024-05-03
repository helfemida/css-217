package assignment4.builder.mazegame.old_mazegame;

public class DoorWall extends Wall{
    private Room r1;
    private Room r2;

    public DoorWall(Room r1, Room r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public int getOtherRoom(int roomNo) {
        return roomNo == r1.getRoomNo() ? r2.getRoomNo() : r1.getRoomNo();
    }
}
