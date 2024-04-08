package assignment4_prototype;

import assignment4_builder.mazegame.old_mazegame.Direction;
import assignment4_builder.mazegame.old_mazegame.Wall;

import java.util.HashMap;
import java.util.Map;

public class Room implements Cloneable {
    private Map<Direction, Wall> sides = new HashMap<Direction, Wall>();
    private int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    public Wall getSide(Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, Wall wall) {
        sides.put(direction, wall);
    }

    public Integer getRoomNo() {
        return roomNo;
    }

    @Override
    public Room clone() throws CloneNotSupportedException {
        Room clonedRoom = new Room(this.roomNo);
        for(Direction d: sides.keySet()){
            clonedRoom.setSide(d, sides.get(d));
        }
        return clonedRoom;
    }
}