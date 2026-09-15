package ariketak1.maltuna.eus;
import java.util.Scanner;


public class Ariketa3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//input
		int znb1,znb2,batu,ken,bider;
		double zati;
		
		System.out.println ("Idatzi lehen zenbakia, mesedez");
		znb1 = sc.nextInt();
		
		System.out.println ("Idatzi bigarren zenbakia, mesedez");
		znb2 = sc.nextInt();
		//Eragiketak egingo ditut
		batu =znb1+znb2;
		ken = znb1-znb2;
		bider = znb1*znb2;
		zati = znb1/znb2;
		
		sc.close();
		
		//output
		
		System.out.println("batu: "+batu);
		System.out.println("ken: "+ken);
		System.out.println("bider: "+bider);
		System.out.println("zati: "+zati);
	}

}
