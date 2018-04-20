package Game.Items;

import Game.Enums.ItemLibrary;
import Game.Game;
import Game.Interfaces.IDamageable;
import Game.Interfaces.IEncounterable;
import Game.Players.Player;

import java.util.Random;

public class Item implements IEncounterable {

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
        int enumNumber = rand.nextInt(Game.randomNumber);
        ItemLibrary item = ItemLibrary.values()[enumNumber];
        return item;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImpact(int impact) {
        this.impact = impact;
    }
}
