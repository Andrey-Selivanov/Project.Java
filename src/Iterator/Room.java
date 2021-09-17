package Iterator;

public class Room {
    private int Type;
    public int getType(){
        return Type;
    }
    private int Square;
    public int getSquare(){
        return Square;
    }
    public Room(int type, int square){
        Type=type;
        Square=square;
    }
}
