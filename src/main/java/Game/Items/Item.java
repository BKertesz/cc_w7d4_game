package Game.Items;

import Game.Interfaces.IDamageable;
import Game.Players.Player;

public abstract class Item{

    private String name;
    private int impact;

    public Item(String name, int impact) {
        this.name = name;
        this.impact = impact;
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
}
