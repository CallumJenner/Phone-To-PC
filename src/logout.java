import java.util.*;

public class logout {
	public void logoutLinux(){
	    Runtime rs = Runtime.getRuntime();
		Scanner logoutScan = new Scanner(System.in);
		
		System.out.print("Are you sure you want to logout Y/N: ");
		String logoutConf = logoutScan.next().toUpperCase();
		if (logoutConf == "Y"){
			try{
				rs.exec("pkill x");
			}
			catch (Exception e){
				System.out.println("Could not log out");
			}
		}
		else{
			System.out.println("Logout Failed");
		}
	}
	public void logoutWin7(){
		
	}
	public void logoutWin8(){
		
	}
	public void logoutWin10(){
		
	}
	public void logoutMacOS(){
		
	}
}
