package Game.Creatures;

import Game.Interfaces.IDamageable;
import Game.Interfaces.IEncounterable;
import Game.Players.Player;

public class Creature implements IDamageable,IEncounterable {

    private String name;
    private int healthPoint;
    private int damage;

    public Creature (String name, int healthPoint, int damage){
        this.name = name;
        this.healthPoint = healthPoint;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void changeHealth(int amount){
        this.healthPoint += amount;
    }


    public boolean isDead() {
        if (healthPoint <= 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void attack(IDamageable target){
        target.changeHealth(damage);
    }

    public void encounter(Player player){
        attack(player);
    }

    public void run(){
        attack(this);
    }
}
