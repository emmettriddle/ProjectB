package dev.riddle.game;

import java.util.*;

import dev.riddle.fixture.*;

public class Main {
	// room manager object
	private static RoomManager rm = new RoomManager(6);
	// boolean for loop to determine if
	// if the player wants to keep playing
	private static boolean playing= true;	
	
	public static void main(String[] args) {
		// initiates the game
		rm.init();
		// player object
		Player p = new Player();
		
		// print the games instructions on how to explore
		
		p.setCurrentRoom(rm.getEntryRoom());
		
		System.out.println("Welcome to the HomeTour house exploration game!"
				+ "\n You will be able to move through the home freely "
				+ "\n and visit rooms and take in all of the attributes"
				+ "\n of this home."
				+ "\nThe layout is in a NSEW platform"
				+ " to move you will type GO "
				+ "\nalong with a direction of your choice."
				+ "\n NORTH"
				+ "\n SOUTH"
				+ "\n EAST"
				+ "\n WEST");
		
		p.setCurrentRoom(rm.getEntryRoom());
		// loop that allows player to continue until exit command is entered
		while(playing) {
			currentRoom(p);
			String[] input = playerInput();
			traverse(input, p);
		}
		
		if(!playing) {
			System.out.println("Thank you for playing!");
		}
		
	}
	// method that displays the current room being explored along with its descriptions
	private static void currentRoom(Player p) {
		System.out.println("***CURRENTLY EXPLORING***");
		System.out.println("NAME: " + p.getCurrentRoom().getName());
		System.out.println("Short Description: " + p.getCurrentRoom().getShortDescription());
		System.out.println("Long Description: " + p.getCurrentRoom().getLongDescription());
		//System.out.println("Current Exits: " + exits();
		
	}
	// method to read user input and separate it into an array for comparison later
	private static String[] playerInput() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		
		String[] inputArray = inputString.split(" ");
		return inputArray;
		
	}
	// method that takes user input, converts to all caps and allows
	// player to go a direction or quite the game
	private static void traverse(String [] command, Player p) {
		String travel = command[0].toUpperCase().intern();
		String dir = null;
		
		if (command.length > 1) {
			dir = command[1].toUpperCase().intern();
		}

		if (travel == "GO") {
			System.out.println("You traveled: " + dir);
			Room move = p.getCurrentRoom().getExit(dir);
			p.setCurrentRoom(move);
		} else if (travel == "QUIT") {
			playing = false;
		}
	}
	// method to display the exits based on the room the player is currently in
	//private static void exits(Player p, RoomManager rm) {
		
		//if () {
			
		//}
	//}

}
