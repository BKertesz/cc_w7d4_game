package Game.Players;

import Game.Items.HealingTool;

public class Cleric extends Player {

    private HealingTool healingTool;

    public Cleric(int healthPoints,int staminaPoints, HealingTool healingTool) {
        super(healthPoints, staminaPoints);
        this.healingTool = healingTool;
    }

    public void healPlayer(Player player){
        healingTool.execute(player);
    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void changeHealingTool(HealingTool healingTool){
        this.healingTool = healingTool;
    }
}
