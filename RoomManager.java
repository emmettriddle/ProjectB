package dev.riddle.game;

import dev.riddle.fixture.Room;

public class RoomManager extends Room {
	
	private Room entryRoom;
	
	private Room[] rooms;
	
	public RoomManager(int numRooms) {
		super();
		rooms = new Room[numRooms];
	}
	
	public void init() {
		
		Room start= new Room("Foyer","Grand entryway","The entryway of a beautiful home"
				+ " that is relatively standard for the time.\n Covered in many custom decorative pieces."
				+ " It is clear that this was the focal point of the home.\n Having many lavish and over the top"
				+ " design properties. Such as Sterling Silver chandelier,\n custom Marble flooring and decorative"
				+ " wall art. These fixtures do need some TLC \n but could definitely be restored back to their once"
				+ " stunning nature.");
		this.rooms[0]=start;
		
		Room garage = new Room("Garage", "2 car Garage", "The garage is home to no vehicles"
				+" instead it stores an extra fridge\n for adult styled beverages to the North, "
				+"and along the East wall are tools and lawn equipment.");
		this.rooms[1]=garage;
		
		Room living = new Room("Living Room", "Where the family relaxes", "The living room is where the family"
				+ " gathers, to interact or stare\n mindlessly into the abyss that is streamed entertainment content"
				+ " to the east there is a fireplace with\n a large entertainment projecting device mounted above and the"
				+ " Kitchen is through the western exit of the living room.");
		this.rooms[2]=living;
		
		Room kitchen = new Room("Kitchen", "Food storage and preparation", "The kitchen is where all of the families"
				+" meals are prepared and enjoyed together.\n The appliances are relatively new and are spanning the"
				+" Southern and Western walls with an Island in\n the middle that allows for further preparation as well"
				+" ");
		this.rooms[3]=kitchen;
		
		Room bed = new Room("Bedroom", "Where sleep happens?", "The bedroom is where the recouperation from the days"
				+" shenanigans, it hosts a bed and clothe\n storage stytems and to the south is the bathroom.");
		this.rooms[4]=bed;
		
		Room bath = new Room("Bathroom","The most important room","This room is where all of the preparing for the day"
				+ "and week happends. Bathing and grooming are\n made easy in the spacious area. You have a vanity and an "
				+ "oversized tub on the east wall and a\n spacious comfortable toilet room for your privacy on the western wall.");
		this.rooms[5]=bath;
		
		this.entryRoom=start;
		
		Room[] startExits= {entryRoom, garage, living};
		Room[] garageExits= {start};
		Room[] livingExits= {start, kitchen, bed};
		Room[] kitchenExits= {living};
		Room[] bedExits= {living, bath};
		Room[] bathExits= {bed};
		
		start.setExits(entryRoom, 0);
		start.setExits(garage, 1);
		start.setExits(living, 2);
		garage.setExits(start, 0);
		living.setExits(start, 0);
		living.setExits(kitchen, 3);
		living.setExits(bed, 4);
		bed.setExits(living, 2);
		bed.setExits(bath, 5);
		bath.setExits(bed, 4);
		
		
	}

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
