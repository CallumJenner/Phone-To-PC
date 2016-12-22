import java.util.*;
import java.io.IOException;

public class poweroff {
	public void poweroffMain(){
		Runtime rs = Runtime.getRuntime();
		Scanner mainScan = new Scanner(System.in);
		
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
	}
}
