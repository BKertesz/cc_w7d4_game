package Players;

import Items.HealingTool;

public class Cleric extends Player {

    private HealingTool healingTool;

    public Cleric(int healthPoints, HealingTool healingTool) {
        super(healthPoints);
        this.healingTool = healingTool;
    }

    public void healPlayer(Player player){
        healingTool.execute(player);
    }
}
