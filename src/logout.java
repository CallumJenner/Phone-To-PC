import java.util.*;
import java.io.IOException;

public class logout {
	public void logoutMain(){
	    Runtime rs = Runtime.getRuntime();
		Scanner logoutScan = new Scanner(System.in);
		
		System.out.print("Are you sure you want to logout Y/N: ");
		String logoutConf = logoutScan.next().toUpperCase();
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
	}
}
