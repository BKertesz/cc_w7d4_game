package Game.Players;

import Game.Items.Spell;

public abstract class Magician extends Player{

    private Spell spell;

    public Magician(int healthPoint,int staminaPoints, Spell spell) {
        super(healthPoint,staminaPoints);
        this.spell = spell;
    }

    public void castSpell(Player player){
        spell.execute(player);
    }

    public void changeSpell(Spell spell){
        this.spell = spell;
    }

    public Spell getSpell() {
        return spell;
    }
}
