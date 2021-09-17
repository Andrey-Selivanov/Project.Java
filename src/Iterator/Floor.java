package Iterator;

import java.util.*;

public class Floor {
    private int Number;
    public int getNumber() {
        return Number;
    }
    private int Count;
    public int getCount() {
        return Count;
    }
    public Room[] rooms1;
    public Collection rooms;

    public Floor(int number) {
        Number = number;
        int count = rnd(4, 20);
        Count = count;
        switch (number) {
            case 1: {
                rooms1 = new Room[count];
                for (int i = 0; i < count; i++) {
                    rooms1[i] = new Room(rnd(1, 3), rnd(25, 80));
                }
            }
            break;
            case 2:
            case 4: {
                rooms = new ArrayList();
                for (int i = 0; i < count; i++) {
                    rooms.add(new Room(rnd(1, 3), rnd(25, 80)));
                }
            }
            break;
            case 3:
            case 5: {
                rooms = new LinkedList();
                for (int i = 0; i < count; i++) {
                    rooms.add(new Room(rnd(1, 3), rnd(25, 80)));
                }
            }
            break;
            default:
                break;
        }
    }

    public int count_square1(){
        int square=0;
        Iterator<Room> iter = Arrays.stream(rooms1).iterator();
        while(iter.hasNext()){
            square+=iter.next().getSquare();
        }
        return square;
    }

    public int count_square1(int type){
        int square=0;
        Iterator<Room> iter = Arrays.stream(rooms1).iterator();
        while(iter.hasNext()){
            Room thisRoom= iter.next();
            if(thisRoom.getType()==type) square+=thisRoom.getSquare();
        }
        return square;
    }

    public int count_square(){
        int square=0;
        Iterator<Room> iter = rooms.iterator();
        while(iter.hasNext()){
            square+=iter.next().getSquare();
        }
        return square;
    }

    public int count_square(int type){
        int square=0;
        Iterator<Room> iter = rooms.iterator();
        while(iter.hasNext()){
            Room thisRoom= iter.next();
            if(thisRoom.getType()==type) square+=thisRoom.getSquare();
        }
        return square;
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
