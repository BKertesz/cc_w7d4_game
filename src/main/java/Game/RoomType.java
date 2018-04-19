package Game;

public enum RoomType {

    TREASURE(1),
    CREATURE(2);

    int type;

    RoomType(int type){
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
