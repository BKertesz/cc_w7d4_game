package PlayerTest;

import Items.Spell;
import Players.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    private Warlock warlock;
    private Spell spell;

    @Before
    public void before(){
        spell = new Spell("Fireball", -15);
        warlock = new Warlock(30, spell);
    }

    @Test
    public void canCastSpell(){
        warlock.castSpell(warlock);
        assertEquals(15, warlock.getHealthPoints());
    }

    @Test
    public void canChangeSpell(){
        Spell spell2 = new Spell("Simon", -100);
        warlock.changeSpell(spell2);
        assertEquals("Simon", warlock.getSpell().getName());
    }


}
