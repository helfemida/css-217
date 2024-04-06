package assignment4_builder.mazegame.new_mazegame;

import assignment4_builder.mazegame.old_mazegame.Direction;
import assignment4_builder.mazegame.old_mazegame.Maze;
import assignment4_builder.mazegame.old_mazegame.Room;
import assignment4_prototype.ClonableMaze;


public class NewMazeGame {

    public Maze createNewMaze() {
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
