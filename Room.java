package dev.riddle.fixture;

public class Room extends Fixture {
	
	private Room[] exits = new Room[6];

	public Room(String name, String shortDescription, String longDescription) {
		super(name, longDescription, shortDescription);
		// TODO Auto-generated constructor stub
	}
	
	public Room() {}
	
	public Room getExit(String dir) { 
		int ind = 0;
		dir = dir.toUpperCase();
		switch (dir) {
		case "NORTH":
			ind = 0;
			break;
		case "SOUTH":
			ind = 1;
			break;
		case "WEST":
			ind = 2;
			break;
		case "EAST":
			ind = 3;
			break;			
		}
		
		if (ind >= this.exits.length || this.exits[ind] == null) {
			System.out.println("There is no room in that direction");

			// Return the current room is there is not a room in that direction
			return this;
		}

		return this.exits[ind];
	}	

	public Room[] getExits() {
		return this.exits;
	}

	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
	public void setExits(Room exit, int ind) {
		this.exits[ind] = exit;
	}	

}
