import java.util.*;
import java.io.*;

public class openApp {
	public void openLinux(){ // Change to openLinux
	    Runtime rs = Runtime.getRuntime();
	    Scanner openScan = new Scanner(System.in);
	    
	    boolean isExecuted = false;
	    while (isExecuted != true){
	    	System.out.print("Open: ");
		    String openProg = openScan.next();
			try {
				rs.exec(openProg);
				System.out.println("Opening " + openProg);
				isExecuted = true;
			}
			catch (IOException e){
				System.out.println("Invalid program"); 
				isExecuted = false;
			}
			catch (Exception i){
				System.out.println("Exception");
				isExecuted = false;
			}
	    }
	}
	
	public void openWin7(){		// See if can make all win in one
		
	}
	
	public void openWin8(){
		
	}
	
	public void openWin10(){
		
	}
	
	public void openMacOS(){
		
	}
}
