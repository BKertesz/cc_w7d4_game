package Game.Players;

import Game.Items.HealingTool;

public class Cleric extends Player {

    private HealingTool healingTool;

    public Cleric(int healthPoints, HealingTool healingTool) {
        super(healthPoints);
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
