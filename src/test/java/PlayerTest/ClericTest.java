package PlayerTest;

import Items.HealingTool;
import Players.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    private Cleric cleric;
    private HealingTool healingTool1;
    private HealingTool healingTool2;

    @Before
    public void before(){
        healingTool1 = new HealingTool("bandaid", 5);
        healingTool2 = new HealingTool("potion", 10);
        cleric = new Cleric(50, healingTool1);

    }


    @Test
    public void healPlayer() {
        cleric.healPlayer(cleric);
        assertEquals(55, cleric.getHealthPoints());
    }


    @Test
    public void canChangeHealingTool(){
        cleric.changeHealingTool(healingTool2);
        assertEquals("potion", cleric.getHealingTool().getName());
    }
}
