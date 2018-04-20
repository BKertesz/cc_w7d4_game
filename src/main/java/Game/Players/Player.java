package Game.Players;

import Game.Interfaces.IDamageable;

public abstract class Player implements IDamageable {

    private int healthPoints;
    private int swagBag;
    private int staminaPoints;

    public Player(int healthPoints,int staminaPoints) {
        this.healthPoints = healthPoints;
        this.staminaPoints = staminaPoints;
        this.swagBag = 0;
    }

    public int getHealthPoints() {
        return healthPoints;
    }


    public int getStaminaPoints() {
        return staminaPoints;
    }

    public boolean isDead(){
        if(healthPoints<=0 || staminaPoints <= 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void changeHealth(int amount){
        healthPoints += amount;
    }

    public void changeStamina(int amount) { staminaPoints += amount;}

    public void addSwag(int amount){
        this.swagBag += amount;
    }

    public int getSwagBagAmount() {
        return swagBag;
    }
}
