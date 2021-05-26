package dev.riddle.game;

import dev.riddle.fixture.*;

public class Player {
	// current room get/set that will allow the player to access
	// the current room being explored if needed
	private Room currentRoom;
	
	public Room getCurrentRoom() {
		return this.currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom=currentRoom;
	}

}
