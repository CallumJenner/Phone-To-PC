import java.util.*;
import java.io.*;

public class volume {
	public void volumeMain(){
		Runtime rs = Runtime.getRuntime();
		Scanner volumeScan = new Scanner(System.in);
		
		System.out.print("Enter volume percentage: ");
		int volPercent = volumeScan.nextInt();
		try{
			rs.exec("amixer set Master " + volPercent + "%");
		}
		catch (Exception e){
			System.out.println("Please enter a whole number between 0 and 100");
		}
	}
}
