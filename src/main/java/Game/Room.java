package Game;

import Game.Creatures.Creature;
import Game.Interfaces.IEncounterable;
import Game.Players.Player;

import java.util.ArrayList;
import java.util.Random;

public class Room {

    private Player player;
    private RoomType roomType;
    private IEncounterable encounter;

    public Room(Player player, RoomType roomType) {
        this.player = player;
        this.roomType = roomType;

    }

    public Player getPlayer() {
        return player;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public IEncounterable getEncounter() {
        return encounter;
    }

    private Room movePlayer(){
        Room newRoom = new Room(player, createRandomRoomType());
        return newRoom;

    }

    private RoomType createRandomRoomType(){
        Random random = new Random();
        int value = random.nextInt(2);
        if(value == 0){
            return RoomType.TREASURE;
        }
        else if(value == 1){
            return RoomType.CREATURE;}
        else{
            return RoomType.ITEM;
        }
    }

    public Room isFinished(){
        Room newRoom;
        if(player.isDead()){
            System.out.println("Game Over!");
        }
        else if(roomType== RoomType.CREATURE){
            if(((Creature) encounter).isDead()){
               return movePlayer();
            }
        }
        return newRoom = new Room(player,createRandomRoomType());
    }

    public void setup(){
        switch (roomType){
            case ITEM:
//                Gives a random item to the room
                break;

            case CREATURE:
//                Gives a random creature back
                break;

            case TREASURE:
//                Gives back a random treasure

        }
    }



}
