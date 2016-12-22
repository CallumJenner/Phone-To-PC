import java.util.*;
import java.io.*;

public class restart {
	public void restartMain(){
		Runtime rs = Runtime.getRuntime();
		Scanner restartScan = new Scanner(System.in);
		
		System.out.print("Are you sure you want to restart? Y/N: ");
		String restartConf = restartScan.next().toUpperCase();
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
	}
}
