import java.util.*;

public class restart {
	public void restartLinux(){
		Runtime rs = Runtime.getRuntime();
		Scanner restartScan = new Scanner(System.in);
		
		System.out.print("Are you sure you want to restart? Y/N: ");
		String restartConf = restartScan.next().toUpperCase();
		if (restartConf == "Y"){
			try{
				rs.exec("restart");
			}
			catch (Exception e){
				System.out.println("Could not restart");
			}
		}
		else{
			System.out.println("Restart failed");
		}
	}
	
	public void restartWin7(){
		
	}
	
	public void restartWin8(){
		
	}
	
	public void restartWin10(){
		
	}
	
	public void restartMacOS(){
		
	}
}
