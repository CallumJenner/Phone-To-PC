import java.util.*;

public class volume {
	public void volumeLinux(){
		Runtime rs = Runtime.getRuntime();
		Scanner volumeScan = new Scanner(System.in);
		boolean volValid = false;
		while (volValid != true){
			System.out.print("Enter volume percentage: ");
			int volPercent = volumeScan.nextInt();
			try{
				rs.exec("amixer set Master " + volPercent + "%");
				if (volPercent > 100){
					System.out.println("Volume adjusted to 100%");
					volValid = true;
				}
				else if (volPercent < 0){
					System.out.println("Number must be higher than 0");
				}
				else{
					System.out.println("Volume adjusted to " + volPercent + "%");
					volValid = true;
				}
			}
			catch (Exception e){
				System.out.println("Please enter a whole number between 0 and 100");
			}
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
