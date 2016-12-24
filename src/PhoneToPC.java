import java.util.*;
import org.apache.commons.lang3.SystemUtils;

/*
 * This is a project I have started to control my PC from my Android phone,
 * I am not expecting much but this is just a project I am using to to properly
 * learn how to program, I will look at implementing the Google Assistant into
 * this when it is available. I use Linux so I will look at integrating it
 * there as well. This project is probably far too advanced for me at the moment
 * but I am looking forward to trying. I will look at creating an app in
 * Android Studio and a GUI for the PC application in the future.
 */

// Implement APIs of Spotify, Chrome etc if possible.

// Add notification mirroring

// Add GUI

// Rename classes

// Implement IFTTT???

public class PhoneToPC {
	public static void main(String[] args){
		
		Scanner mainScan = new Scanner(System.in);
		
		System.out.println("Welcome to PhoneToPC");
		
		if(SystemUtils.IS_OS_LINUX){
			while (true){		
				System.out.print("Command: ");
				String mainCommand = mainScan.next().toUpperCase();
				
				switch (mainCommand){
				case "C":
					closeApp closeObject = new closeApp();
					closeObject.closeLinux();
					break;
				case "L":
					logout logoutObject = new logout();
					logoutObject.logoutLinux();
					break;
				case "O":
					openApp openObject = new openApp();
					openObject.openLinux();
					break;
				case "P":
					poweroff poweroffObject = new poweroff();
					poweroffObject.poweroffLinux();
					break;
				case "R":
					restart restartObject = new restart();
					restartObject.restartLinux();
					break;
				case "V":
					volume volumeObject = new volume();
					volumeObject.volumeLinux();
					break;
				case "Q":
					System.out.println("Goodbye");
					System.exit(0);
				default:
					System.out.println("Please enter a valid command");
				}
			}
		}
		
		if(SystemUtils.IS_OS_WINDOWS_7){
            System.out.println("WARNING! This software is still in a very early stage and has not been tested, "
            		+ "proceed at your own risk");
            System.out.print("Do you want to continue? Y/N");
            String win7Cont = mainScan.next();
            if (win7Cont == "Y"){
            	while (true){		
    				System.out.print("Command: ");
    				String mainCommand = mainScan.next().toUpperCase();
    				
    				switch (mainCommand){
    				case "C":
    					closeApp closeObject = new closeApp();
    					closeObject.closeWin7();
    					break;
    				case "L":
    					logout logoutObject = new logout();
    					logoutObject.logoutWin7();
    					break;
    				case "O":
    					openApp openObject = new openApp();
    					openObject.openWin7();
    					break;
    				case "P":
    					poweroff poweroffObject = new poweroff();
    					poweroffObject.poweroffWin7();
    					break;
    				case "R":
    					restart restartObject = new restart();
    					restartObject.restartWin7();
    					break;
    				case "V":
    					volume volumeObject = new volume();
    					volumeObject.volumeWin7();
    					break;
    				case "Q":
    					System.out.println("Goodbye");
    					System.exit(0);
    				default:
    					System.out.println("Please enter a valid command");
    				}
            	}
            }
		}
		
		if(SystemUtils.IS_OS_WINDOWS_8){
            System.out.println("Windows 8 support coming soon");
		}
		
		if(SystemUtils.IS_OS_WINDOWS_10){
			System.out.println("Windows 10 support coming soon");

		}
		
		if (SystemUtils.IS_OS_MAC){
			System.out.println("MacOS support coming soon");
		}
 
	}
}
