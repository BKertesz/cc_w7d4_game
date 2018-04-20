package Game;

import Game.Creatures.Creature;
import Game.Players.Player;

import java.util.ArrayList;
import java.util.Random;

public class Room {

    private Player player;
    private RoomType roomType;
    private Creature creature;

    public Room(Player player, RoomType roomType) {
        this.player = player;
        this.roomType = roomType;
        if(this.roomType== RoomType.CREATURE){
            creature = new Creature("Simon",50,-100);
        }
    }

    private Room movePlayer(){
        Room newRoom = new Room(player, createRandomRoomType());
        return newRoom;

    }

    private RoomType createRandomRoomType(){
        Random random = new Random();
        int value = random.nextInt(1);
        if(value == 0){
            return RoomType.TREASURE;
        }
        else
            return RoomType.CREATURE;
    }

    public Room isFinished(){
        Room newRoom;
        if(player.isDead()){
            System.out.println("Game Over!");
        }
        else if(roomType == RoomType.TREASURE){
            player.addSwag(50);
            return movePlayer();
        }
        else if(roomType== RoomType.CREATURE){
            if(creature.isDead()){
               return movePlayer();
            }
        }
        return newRoom = new Room(player,RoomType.TREASURE);
    }
}
