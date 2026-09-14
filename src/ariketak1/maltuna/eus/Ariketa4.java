/**
 * 
 */
package ariketak1.maltuna.eus;
import java.util.*;

/**
 * Produktu baten salneurria eskatuko duzu (hamartarrak sartzeko aukera
izan behar duzu); azken prezioa kalkulatuko duzu, kontuan izanda,
produktuak %15eko deskontua daukala. (Oharra: %15eko deskontua,
konstante bati esleitu).
 */
public class Ariketa4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner nireSc = new Scanner(System.in);
		int balioa;
		final int deskontua = 15;
		
		System.out.println("Idatzi produktuaren salneurria");
		balioa =nireSc.nextInt();
		System.out.println("Deskontu gabeko salneurria:"+balioa+" deskontua:"+deskontua+" Salneurri berria:"+balioa * (1-deskontua));
		nireSc.close();
	}

}
