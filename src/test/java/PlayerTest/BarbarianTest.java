package PlayerTest;

import Items.Weapon;
import Players.Barbarian;
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
}
