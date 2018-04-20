package Game.Enums;

public enum TreasureLibrary {

    SMALLCHEST("Small Chest",10),
    MEDIUMCHEST("Medium Chest",20),
    LARGECHEST("Large Chest",50),
    MEGACHEST("Mega Chest",100);

    private String name;
    private int impact;

    TreasureLibrary(String name,int impact){
        this.name = name;
        this.impact = impact;
    }

    public String getName() {
        return name;
    }

    public int getImpact() {
        return impact;
    }
}
