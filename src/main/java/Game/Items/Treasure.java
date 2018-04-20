package Game.Items;

import Game.Players.Player;

public class Treasure extends Item {

    public Treasure(String name, int impact) {
        super(name, impact);
    }

    public void execute(Player player){
        player.addSwag(getImpact());
    }
}
