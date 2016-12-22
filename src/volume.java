import java.util.*;

public class volume {
	public void volumeLinux(){
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
	public void volumeWin7(){
		
	}
	public void volumeWin8(){
		
	}
	public void volumeWin10(){
		
	}
	public void volumeMacOS(){
		
	}
}
