package Game.Creatures;

import Game.Enums.CreatureLibrary;
import Game.Interfaces.IDamageable;
import Game.Interfaces.IEncounterable;
import Game.Players.Player;

import java.util.Random;

public class Creature implements IDamageable,IEncounterable {

    private String name;
    private int healthPoint;
    private int damage;

    public Creature (String name, int healthPoint, int damage){
        this.name = name;
        this.healthPoint = healthPoint;
        this.damage = damage;
    }

    public Creature (){
        CreatureLibrary creatureSeed =  getRandomCreature();
        this.name = creatureSeed.getName();
        this.healthPoint = creatureSeed.getHealthPoint();
        this.damage = creatureSeed.getDamage();

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

    public static CreatureLibrary getRandomCreature(){
        Random rand = new Random();
        int enumNumber = rand.nextInt(2);
        CreatureLibrary creatureType = CreatureLibrary.values()[enumNumber];
        return creatureType;
    }
}
