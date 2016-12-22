import java.util.*;
import java.io.*;


/*
 * This is a project I am starting to control my PC from my Android phone
 * I am not expecting much but this is just a project I am trying to properly
 * learn how to program, I will look at implementing the Google Assistant into
 * this when it is available. I use Linux so I will look at integrating it
 * there as well. This project is probably far too advanced for me at the moment
 * but I am looking forward to trying. I will look at creating an app in
 * Android Studio and a GUI for the PC application in the future.
 */

// Add OS detection e.g is it on Windows, Mac or Linux and adjust accordingly

// Implement APIs of Spotify, Chrome etc.

// Add notification mirroring

// Convert all switch statements to their own classes

public class PhoneToPC {
	public static void main(String[] args){
		Scanner mainScan = new Scanner(System.in);
		Runtime rs = Runtime.getRuntime();
		
		System.out.println("Welcome to PhoneToPC");
		
		while (true){		
			System.out.print("Command: ");
			String mainCommand = mainScan.next().toUpperCase();
			
			/*
			 * Commands:
			 * Open app
			 * Close app
			 * Logout
			 * Power Off
			 * Restart
			 * Volume
			 */
			
			// Sort these to alphabetical
			
			switch (mainCommand){
			case "O":
				openApp openObject = new openApp();
				openObject.openMain();
				break;
			case "C":
				closeApp closeObject = new closeApp();
				closeObject.closeMain();
				break;
			case "L":
				logout logoutObject = new logout();
				logoutObject.logoutMain();
				break;
			case "P":
				poweroff poweroffObject = new poweroff();
				poweroffObject.poweroffMain();
				break;
			case "R":
				restart restartObject = new restart();
				restartObject.restartMain();
				break;
			case "V":
				volume volumeObject = new volume();
				volumeObject.volumeMain();
				break;
			case "Q":
				mainScan.close();
				System.out.println("Goodbye");
				System.exit(0);
			default:
				System.out.println("Please enter a valid command");
			}
		}
	}
}
