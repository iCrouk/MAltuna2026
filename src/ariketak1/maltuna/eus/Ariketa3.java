package ariketak1.maltuna.eus;
import java.util.Scanner;

<<<<<<< HEAD
import java.util.Scanner;

/**
 * 
 */

public class Ariketa3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner nireSc = new Scanner(System.in);
		
		int znb1,znb2;
		
		System.out.print("Idatzi lehen zenbakia, mesedez");
		znb1 =nireSc.nextInt();
		
		System.out.print("Idatzi bigarren zenbakia, mesedez");
		znb2 =nireSc.nextInt();
		
		System.out.println(znb1+" eta "+znb2+"-ren arteko batuketa: "+ znb1 + znb2+" da");
		System.out.println(znb1+" eta "+znb2+"-ren arteko kenketa: "+ znb1 +" da");
		System.out.println(znb1+" eta "+znb2+"-ren arteko biderketa: "+ znb1 * znb2+" da");
		System.out.println(znb1+" eta "+znb2+"-ren arteko zatiketa: "+ znb1 / znb2+" da");
		
		nireSc.close();

	}

}
