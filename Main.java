package dev.riddle.game;

import java.util.*;

import dev.riddle.fixture.*;

public class Main {
	
	private static RoomManager rm = new RoomManager(6);
	
	private static boolean playing= true;	
	
	public static void main(String[] args) {
		
		rm.init();
		
		Player p = new Player();
		
		// println game instruction etc
		
		p.setCurrentRoom(rm.getEntryRoom());
		
		System.out.println("Welcome to the HomeTour house exploration game!"
				+ "\n You will be able to move through the home freely "
				+ "\n and visit rooms and take in all of the attributes"
				+ "\n of this home."
				+ "\nThe layout is in a NSEW platform"
				+ "to move you will type "
				+ "\n NORTH"
				+ "\n SOUTH"
				+ "\n EAST"
				+ "\n WEST");
		
		p.setCurrentRoom(rm.getEntryRoom());
		
		while(playing) {
			currentRoom(p);
			String[] input = playerInput();
			parse(input, p);
		}
		
		if(!playing) {
			System.out.println("Thank you for playing!");
		}
		
	}
	
	private static void currentRoom(Player p) {
		System.out.println("***CURRENTLY EXPLORING***");
		System.out.println("NAME: " + p.getCurrentRoom().getName());
		System.out.println("Short Description: " + p.getCurrentRoom().getShortDescription());
		System.out.println("Long Description: " + p.getCurrentRoom().getLongDescription());
		
	}
	
	private static String[] playerInput() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		
		String[] inputArray = inputString.split(" ");
		return inputArray;
		
	}
	
	private static void parse(String [] command, Player p) {
		String action = command[0].toUpperCase().intern();
		String direction = null;
		
		if (command.length > 1) {
			direction = command[1].toUpperCase().intern();
		}

		if (action == "GO" | action == "MOVE") {
			System.out.println("You try to move: " + direction);
			Room move = p.getCurrentRoom().getExit(direction);
			p.setCurrentRoom(move);
		} else if (action == "QUIT") {
			playing = false;
		}
	}

}
