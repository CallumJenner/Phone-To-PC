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
		System.out.println("Welcome to PhoneToPC");
		Runtime rs = Runtime.getRuntime();
		
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
				System.out.print("Are you sure you want to logout Y/N: ");
				String logoutConf = mainScan.next().toUpperCase();
				if (logoutConf == "Y"){
					try{
						rs.exec("pkill x");
					}
					catch (IOException i){
						System.out.println("Could not log out");
					}
				}
				else{
					System.out.println("Logout Failed");
				}
				break;
			case "P":
				System.out.print("Are you sure you want to power off? Y/N: ");
				String powerConf = mainScan.next().toUpperCase();
				if (powerConf == "Y"){
					try{
						rs.exec("poweroff");
					}
					catch (IOException i){
						System.out.println("Could not power off");
					}
				}
				else{
					System.out.println("Poweroff Failed");
				}
				break;
			case "R":
				System.out.print("Are you sure you want to restart? Y/N: ");
				String restartConf = mainScan.next().toUpperCase();
				if (restartConf == "Y"){
					try{
						rs.exec("restart");
					}
					catch (IOException i){
						System.out.println("Could not restart");
					}
				}
				else{
					System.out.println("Restart failed");
				}
				break;
			case "V":
				System.out.print("Enter volume percentage: ");
				int volPercent = mainScan.nextInt();
				try{
					rs.exec("amixer set Master " + volPercent + "%");
				}
				catch (Exception e){
					System.out.println("Please enter a whole number between 0 and 100");
				}
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
