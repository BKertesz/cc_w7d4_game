package Players;

import Items.Weapon;
import Items.Item;

public abstract class Warrior extends Player {

    private Weapon weapon;

    public Warrior(int healthPoints, Weapon weapon) {
        super(healthPoints);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void fight(Player player){
        weapon.execute(player);
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
