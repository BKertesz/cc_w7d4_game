package Game.Enums;

public enum ItemLibrary {

    FIREBALL("Fireball",-15,"Spell"),
    POTION("Potion",10,"Healing Tool"),
    HAMMER("Hammer",-8,"Weapon"),
    SWORD("Sword",-5,"Weapon");

    private String name;
    private int impact;
    private String type;


    ItemLibrary(String name, int impact, String type){
        this.name = name;
        this.impact = impact;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getImpact() {
        return impact;
    }

    public String getType() {
        return type;
    }
}
