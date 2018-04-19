package Players;

import Items.Spell;

public abstract class Magician {

    private Spell spell;

    public Magician(Spell spell) {
        this.spell = spell;
    }

    public void castSpell(Player player){
        spell.execute(player);
    }

    public void changeSpell(Spell spell){
        this.spell = spell;
    }
}
