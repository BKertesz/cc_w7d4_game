package Game.Players;

import Game.Items.Weapon;

public abstract class Warrior extends Player {

    private Weapon weapon;

    public Warrior(int healthPoints,int staminaPoints, Weapon weapon) {
        super(healthPoints, staminaPoints);
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
