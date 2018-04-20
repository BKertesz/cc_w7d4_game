import Game.Creatures.Creature;
import Game.Items.Weapon;
import Game.Players.Barbarian;
import Game.Room;
import Game.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Barbarian barbarian;
    Weapon weapon;
//    Creature simon;

    Room room;

    @Before
    public void setUp() throws Exception {
        weapon = new Weapon("Sword",-10);
        barbarian = new Barbarian(50,20,weapon);
//        simon = new Creature("Simon",50,-10);
        room = new Room(barbarian,RoomType.TREASURE);
    }

    @Test
    public void canGetSwag() {
        room = room.isFinished();
        assertEquals(50,barbarian.getSwagBagAmount());
    }
}
