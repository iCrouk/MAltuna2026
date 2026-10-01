package azterketa2.maltuna.eus;
import java.util.Scanner;

public class Ariketa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mySc = new Scanner(System.in);
		int urtea = mySc.nextInt();
		boolean bis = false;
		mySc.close();
		if (urtea % 400 == 0) { 
			bis = true;
			}else if (urtea %4 == 0 && urtea %100 !=0) {
				bis = true;
				}
		System.out.println (bis);
		
		urtea = urtea/100;
		
		int emaitza = 1;
		
		for (int j=1; j<=urtea;j++){
			emaitza*=j;
		}
		System.out.println (emaitza);
		
		
	}

}
