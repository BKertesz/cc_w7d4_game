package Game.Items;

import Game.Enums.TreasureLibrary;
import Game.Game;
import Game.Players.Player;

import java.util.Random;

public class Treasure extends Item {

    public Treasure(String name, int impact) {
        super(name, impact);
    }

    public Treasure(){
        TreasureLibrary treasureSeed = getRandomTreasure();
        this.setName(treasureSeed.getName());
        this.setImpact(treasureSeed.getImpact());
    }

    public TreasureLibrary getRandomTreasure(){
        Random random = new Random();
        int enumNumber = random.nextInt(Game.randomNumber);
        TreasureLibrary treasure = TreasureLibrary.values()[enumNumber];
        return treasure;
    }

    public void execute(Player player){
        player.addSwag(getImpact());
    }
}
