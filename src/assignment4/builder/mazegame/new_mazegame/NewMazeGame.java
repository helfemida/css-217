package assignment4.builder.mazegame.new_mazegame;

import assignment4.builder.mazegame.old_mazegame.Direction;
import assignment4.builder.mazegame.old_mazegame.Maze;
import assignment4.builder.mazegame.old_mazegame.Room;


public class NewMazeGame {
    public static void main(String[] args) {
        System.out.println(createNewMaze());
    }

    public static Maze createNewMaze() {
        MazeBuilder builder = new MazeBuilder();

        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Room r3 = new Room(3);

        builder.addRoom(r1);
        builder.addRoom(r2);
        builder.addRoom(r3);
        builder.connectRooms(r1, r2, Direction.NORTH);
        builder.connectRooms(r2, r3, Direction.EAST);

        return builder.build();
    }
}
