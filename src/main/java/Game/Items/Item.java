package Game.Items;

import Game.Enums.ItemLibrary;
import Game.Interfaces.IDamageable;
import Game.Players.Player;

import java.util.Random;

public abstract class Item{

    private String name;
    private int impact;
    private String type;

    public Item(String name, int impact) {
        this.name = name;
        this.impact = impact;
    }

    public Item(){
        ItemLibrary itemSeed = getRandomItem();
        this.name = itemSeed.getName();
        this.impact = itemSeed.getImpact();
        this.type = itemSeed.getType();

    }

    public void execute(IDamageable target){
        target.changeHealth(impact);
    }

    public String getName() {
        return name;
    }

    public int getImpact() {
        return impact;
    }

    public ItemLibrary getRandomItem(){
        Random rand = new Random();
        int enumNumber = rand.nextInt(2);
        ItemLibrary item = ItemLibrary.values()[enumNumber];
        return item;
    }
}
