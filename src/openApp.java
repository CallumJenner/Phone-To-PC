import java.util.*;
import java.io.*;

public class openApp {
	public void openMain(){
	    Runtime rs = Runtime.getRuntime();
	    Scanner openScan = new Scanner(System.in);
	    
	    boolean isExecuted = false;
	    while (isExecuted != true){
	    	System.out.print("Open: ");
		    String openProg = openScan.next();
			try {
				rs.exec(openProg);
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
}
