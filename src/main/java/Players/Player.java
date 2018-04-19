package Players;

public abstract class Player {

    private int healthPoints;

    public Player(int healthPoints) {
        this.healthPoints = healthPoints;
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
}
