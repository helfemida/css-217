package assignment4.builder.mazegame.old_mazegame;

import java.util.HashMap;
import java.util.Map;

public class Maze {
    private Map<Integer, Room> rooms = new HashMap<Integer, Room>();

    public void addRoom(Room r) {
        rooms.put(r.getRoomNo(), r);
    }

    public Room roomNo(int r) {
        return rooms.get(r);
    }

    @Override
    public String toString() {
        StringBuilder mazeString = new StringBuilder();

        for (Room room : rooms.values()) {
            int roomNo = room.getRoomNo();
            mazeString.append("Room ").append(roomNo).append(":\n");
            for (Direction direction : Direction.values()) {
                Wall wall = room.getSide(direction);
                if (wall instanceof DoorWall) {
                    mazeString.append("  ").append(direction).append(": Door to Room ").append(((DoorWall) wall).getOtherRoom(roomNo)).append("\n");
                } else {
                    mazeString.append("  ").append(direction).append(": Wall\n");
                }
            }

            mazeString.append("\n");
        }

        return mazeString.toString();
    }
}









