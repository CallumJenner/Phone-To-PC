import java.util.*;

public class poweroff {
	public void poweroffLinux(){
		Runtime rs = Runtime.getRuntime();
		Scanner poweroffScan = new Scanner(System.in);
		
		System.out.print("Are you sure you want to power off? Y/N: ");
		String powerConf = poweroffScan.next().toUpperCase();
		if (powerConf == "Y"){
			try{
				rs.exec("poweroff");
			}
			catch (Exception e){
				System.out.println("Could not power off");
			}
		}
		else{
			System.out.println("Poweroff Failed");
		}
	}
	
	public void poweroffWin7(){
		Runtime rs = Runtime.getRuntime();
		Scanner poweroffScan = new Scanner(System.in);
		
		System.out.print("Are you sure you want to power off? Y/N: ");
		String powerConf = poweroffScan.next().toUpperCase();
		if (powerConf == "Y"){
			try{
				rs.exec("shutdown -s");
			}
			catch (Exception e){
				System.out.println("Could not power off");
			}
		}
		else{
			System.out.println("Poweroff Failed");
		}
	}
	
	public void poweroffWin8(){
		
	}
	
	public void poweroffWin10(){
		
	}
	
	public void poweroffMacOS(){
		
	}
}
