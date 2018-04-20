package Game.Enums;

public enum CreatureLibrary {

    SLIME("Slime",10,2),
    SKELETON("Skeleton",20,5),
    DRAGON("Dragon",40,10),
    SIMON("Simon",50,15);


    private String name;
    private int healthPoint;
    private int damage;


    CreatureLibrary (String name, int healthPoint, int damage){
        this.name = name;
        this.healthPoint = healthPoint;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getDamage() {
        return damage;
    }
}

