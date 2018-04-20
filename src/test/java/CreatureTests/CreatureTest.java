package CreatureTests;

import Game.Creatures.Creature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    private Creature creature1;
    private Creature creature2;


    @Before
    public void before(){
        creature1 = new Creature("Ogre", 25, -10);
        creature2 = new Creature("Simon",40,10);
    }

    @Test
    public void hasName() {
        assertEquals("Simon", creature2.getName());
    }

    @Test
    public void canChangeHealth() {
        creature1.changeHealth(-15);
        assertEquals(10, creature1.getHealthPoint());
    }

    @Test
    public void isDead(){
        creature1.changeHealth(-25);
        assertEquals(true, creature1.isDead());
    }

    @Test
    public void canAttack(){
        creature1.attack(creature2);
        assertEquals(30, creature2.getHealthPoint());
    }

//    @Test
//    public void testNewCreatureGenerator() {
//        System.out.println(creature2.getName());
//    }
}
