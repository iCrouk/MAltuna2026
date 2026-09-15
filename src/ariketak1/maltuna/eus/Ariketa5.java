package ariketak1.maltuna.eus;
import java.util.*;

public class Ariketa5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//INPUT
		int znb1;
		int znb2;
		int handiena;
		//EGITEKOAK
		Scanner sc = new Scanner(System.in);
		//lehen zenbakia eskatu eta gorde
		System.out.println("Idatzi lehen zenbakia, mesedez");
		znb1 = sc.nextInt();
		//bigarren zenbakia eskatu eta gorde
		System.out.println("Idatzi bigarren zenbakia, mesedez");
		znb2 = sc.nextInt();
		
		if( znb1 < znb2) {
			handiena = znb2;
		} else {
			handiena = znb1;
		}
		//OUTPUT
		System.out.println ("handiena: "+handiena+" da");
		sc.close();
	}

}
