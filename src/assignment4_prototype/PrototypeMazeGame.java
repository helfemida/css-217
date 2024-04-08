package assignment4_prototype;

import assignment4_builder.mazegame.old_mazegame.Direction;
import assignment4_builder.mazegame.old_mazegame.Wall;

public class PrototypeMazeGame {
    public static void main(String[] args) {
        try {
            Maze prototypeMaze = createPrototypeMaze();

            Maze newMaze = prototypeMaze.clone();

            Room newRoom = new Room(3);
            newMaze.addRoom(newRoom);
            newRoom.setSide(Direction.NORTH, new DoorWall(newMaze.roomNo(1), newRoom));

            System.out.println("Base Maze: ");
            System.out.println(prototypeMaze);

            System.out.println("Copied Maze:");
            System.out.println(newMaze);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static Maze createPrototypeMaze() {
        Maze aMaze = new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        DoorWall d = new DoorWall(r1, r2 );

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.NORTH, d);
        r1.setSide(Direction.EAST,	new Wall());
        r1.setSide(Direction.SOUTH,	new Wall());
        r1.setSide(Direction.WEST,	new Wall());
        r2.setSide(Direction.NORTH,	new Wall());
        r2.setSide(Direction.EAST,	new Wall());
        r2.setSide(Direction.SOUTH,	d);
        r2.setSide(Direction.WEST,	new Wall());

        return aMaze;
    }
}
