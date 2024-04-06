package assignment4_builder.mazegame.new_mazegame;

import assignment4_builder.mazegame.old_mazegame.Direction;
import assignment4_builder.mazegame.old_mazegame.DoorWall;
import assignment4_builder.mazegame.old_mazegame.Maze;
import assignment4_builder.mazegame.old_mazegame.Room;

public class MazeBuilder {
    private Maze maze;

    public MazeBuilder() {
        this.maze = new Maze();
    }

    public void addRoom(Room room) {
        maze.addRoom(room);
    }

    public void connectRooms(Room room1, Room room2, Direction direction) {
        DoorWall door = new DoorWall(room1, room2);
        room1.setSide(direction, door);
        room2.setSide(direction.opposite(), door);
    }

    public Maze build() {
        return this.maze;
    }
}
