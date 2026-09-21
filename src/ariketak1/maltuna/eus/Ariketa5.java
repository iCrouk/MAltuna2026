package ariketak1.maltuna.eus;
import java.util.*;


/**
 * Bi zenbaki oso eskatuko dituzu. Bakoitza aldagai batean gordeko duzu.
Zenbaki handiena bistaratuko duzu.
 */

public class Ariketa5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nireSc = new Scanner(System.in);
		int znb1,znb2;
		
		znb1= nireSc.nextInt();
		znb2= nireSc.nextInt();
		
		int handiena;
		
		if (znb1>znb2) {
			handiena = znb1;
		}else {
			handiena =znb2;
		}
	
		System.out.println("Bi zenbakien artean:"+handiena+" da handiena");
		nireSc.close();
	}
}
