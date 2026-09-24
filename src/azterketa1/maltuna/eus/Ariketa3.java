package azterketa1.maltuna.eus;
import java.util.*;

public class Ariketa3 {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Idatzi diru kantitate bat, mesedez");
		
		int dirua = sc.nextInt();
		
		if (dirua%10 == 0) {
			int berrogeitahamar =0;
			int hogei = 0;
			int hamar = 0;
			while (dirua > 0) {	
				if (dirua - 50 >= 0) {
					berrogeitahamar++;
					dirua = dirua - 50;
				}else if(dirua - 20 >= 0){
					hogei++;
					dirua = dirua - 20;
				}else if(dirua -10 >= 0) {
					hamar++;
					dirua = dirua - 10;
				}
			}//endWhile
			
			System.out.println("Eskatutako kantitaeak: 50€-ko "+berrogeitahamar+" bilete ditu, 20€-ko "+hogei+" bilete ditu eta 10€-ko "+hamar+" bilete ditu.");
			
		}else {
			
			System.out.println("Kantitatea ez da 10en multiploa eta kutxazain honek ezin du atera");
		}
		sc.close();	
	}
}
