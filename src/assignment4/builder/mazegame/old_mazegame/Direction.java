package assignment4.builder.mazegame.old_mazegame;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;
    public Direction opposite(){
        if(this == NORTH) return SOUTH;
        if(this == EAST) return WEST;
        if(this == SOUTH) return NORTH;
        if(this == WEST) return EAST;
        return null;
    }
}