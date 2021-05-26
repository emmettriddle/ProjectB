package dev.riddle.game;

import dev.riddle.fixture.Room;

public class RoomManager extends Room {
	
	private Room entryRoom;
	
	private Room[] rooms;
	
	public RoomManager(int numRooms) {
		super();
		rooms = new Room[numRooms];
	}
	// method that holds each room and its description, and sets its index into the
	// object array for access while playing the game
	public void init() {
		
		Room start= new Room("Foyer","Standard Entryway","The entryway of this beautiful home"
				+ " that is relatively standard for the time.\n Covered in many custom decorative pieces."
				+ " It is clear that this was the focal point of the home.\n Having many lavish and over the top"
				+ " design properties. Such as Sterling Silver chandelier,\n custom Marble flooring and decorative"
				+ " wall art. These fixtures do need some TLC \n but could definitely be restored back to their once"
				+ " stunning nature."
				+ "\n\nExits:"
				+ "\nNorth: Living Room"
				+ "\nEast: Garage\n");
		this.rooms[0]=start;
		
		Room garage = new Room("Garage", "2 car Garage", "The garage is home to no vehicles"
				+" instead it stores an extra fridge\n for adult styled beverages to the North, "
				+"and along the East wall are tools and lawn equipment."
				+ "\n\nExits:"
				+ "\nWest: Foyer\n");
		this.rooms[1]=garage;
		
		Room living = new Room("Living Room", "Where the family relaxes", "The living room is where the family"
				+ " gathers, to interact or stare\n mindlessly into the abyss that is streamed entertainment content"
				+ " to the east there is a fireplace with\n a large entertainment projecting device mounted above and the"
				+ " Kitchen is through the western exit of the living room."
				+ "\n\nExits:"
				+ "\nWest: Kitchen"
				+ "\nSouth: Foyer"
				+ "\nEast: Master Bedroom\n");
		this.rooms[2]=living;
		
		Room kitchen = new Room("Kitchen", "Food storage and preparation", "The kitchen is where all of the families"
				+" meals are prepared and enjoyed together.\n The appliances are relatively new and are spanning the"
				+" Southern and Western walls with an Island in\n the middle that allows for further preparation as well"
				+" \n\nExits:"
				+ "\nEast: Living Room");
		this.rooms[3]=kitchen;
		
		Room bed = new Room("Bedroom", "Where sleep happens?", "The bedroom is where the recouperation from the days"
				+" shenanigans, it hosts a bed and clothe\n storage stytems and to the south is the bathroom."
				+ "\n\nExits:"
				+ "\nWest: Living Room"
				+ "\nSouth: Bathroom");
		this.rooms[4]=bed;
		
		Room bath = new Room("Bathroom","The most important room","This room is where all of the preparing for the day"
				+ "and week happends. Bathing and grooming are\n made easy in the spacious area. You have a vanity and an "
				+ "oversized tub on the east wall and a\n spacious comfortable toilet room for your privacy on the western wall."
				+ "\n\nExits:"
				+ "\nNorth: Master Bedroom");
		this.rooms[5]=bath;
		
		this.entryRoom=start;
		// array that contains which room is an exit
		// for each room the player can be in
		Room[] startExits= {garage, living};
		Room[] garageExits= {start};
		Room[] livingExits= {start, kitchen, bed};
		Room[] kitchenExits= {living};
		Room[] bedExits= {living, bath};
		Room[] bathExits= {bed};
		// set each rooms exit with the direction
		// that corresponds to the switch statement 
		// in the Room class
		start.setExits(garage, 3);
		start.setExits(living, 0);
		garage.setExits(start, 2);
		living.setExits(start, 1);
		living.setExits(kitchen, 2);
		living.setExits(bed, 3);
		kitchen.setExits(living, 3);
		bed.setExits(living, 2);
		bed.setExits(bath, 1);
		bath.setExits(bed, 0);
		
		
	}
	// constructors and getters/setters
	public RoomManager(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		// TODO Auto-generated constructor stub
	}

	public RoomManager() {
		// TODO Auto-generated constructor stub
	}

	public Room getEntryRoom() {
		return this.entryRoom;
	}

	public void setEntryRoom(Room entryRoom) {
		this.entryRoom = entryRoom;
	}

	public Room[] getRooms() {
		return this.rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
	
	

}
