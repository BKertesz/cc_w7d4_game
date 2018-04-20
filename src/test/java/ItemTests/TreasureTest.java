package ItemTests;

import Game.Items.HealingTool;
import Game.Items.Treasure;
import Game.Players.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Treasure treasure;
    HealingTool tool;
    Cleric cleric;

    @Before
    public void setUp() throws Exception {
        treasure = new Treasure("Small Chest",10);
        tool = new HealingTool("Potion",20);
        cleric = new Cleric(40,20,tool);
    }

    @Test
    public void canGiveSwag() {
        treasure.execute(cleric);
        assertEquals(10,cleric.getSwagBagAmount());
    }
}
