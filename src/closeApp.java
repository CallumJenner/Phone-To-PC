import java.util.*;
import java.io.*;

public class closeApp {
	public void closeMain(){
		Runtime rs = Runtime.getRuntime();
		Scanner closeScan = new Scanner(System.in);
		boolean isExecuted = false;
		while (isExecuted != true){
			System.out.print("Close: ");
			String closeProg = closeScan.next();
			try{
				rs.exec("pkill " + closeProg);
				isExecuted = true;
			}
			catch (IOException e){
				System.out.println("Invalid Program");
				isExecuted = false;
			}
		}
	}
}
