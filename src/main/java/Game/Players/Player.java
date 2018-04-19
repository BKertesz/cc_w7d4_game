package Game.Players;

import Game.Interfaces.IDamageable;

public abstract class Player implements IDamageable {

    private int healthPoints;
    private int swagBag;

    public Player(int healthPoints) {
        this.healthPoints = healthPoints;
        this.swagBag = 0;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public boolean isDead(){
        if(healthPoints<=0){
            return true;
        }
        else{
            return false;
        }
    }

    public void changeHealth(int amount){
        healthPoints += amount;
    }

    public void addSwag(int amount){
        this.swagBag += amount;
    }

    public int getSwagBagAmount() {
        return swagBag;
    }
}
