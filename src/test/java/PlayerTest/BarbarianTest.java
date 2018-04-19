package PlayerTest;

import Game.Items.Weapon;
import Game.Players.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian1;
    private Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Hammer", -10);
        barbarian1 = new Barbarian(30, weapon);
    }

    @Test
    public void canFight(){
        barbarian1.fight(barbarian1);
        assertEquals(20, barbarian1.getHealthPoints());
    }

    @Test
    public void canChangeWeapon(){
        Weapon weapon2 = new Weapon("Sword", -5);
        barbarian1.changeWeapon(weapon2);
        assertEquals("Sword", barbarian1.getWeapon().getName());
    }

    @Test
    public void swagBagStartAtZero() {
        assertEquals(0,barbarian1.getSwagBagAmount());
    }

    @Test
    public void canAddToSwagBag() {
        barbarian1.addSwag(100);
        assertEquals(100,barbarian1.getSwagBagAmount());
    }
}
