package dev.riddle.game;

import dev.riddle.fixture.*;

public class Player {
	
	private Room currentRoom;
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom=currentRoom;
	}

}
