package azterketa1.maltuna.eus;
import java.util.Scanner;

public class Ariketa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
			/* aldagaia definitu eta Eskanerreko instantzia sortu*/
				int asteakoEguna;
				Scanner sc = new Scanner(System.in);
				//Erabiltzaileari eguna jartzeko esan
				System.out.println("Idatzi zenbaki bat 1 eta 7 artean dagoena, mesedez");
				// balioa jaso eta gorde nire aldagaian
				asteakoEguna = sc.nextInt();
				/*
				 * Zenbakiak derrigor 1 eta 7 artekoa izan behar du beraz 
				 * edo 1 handiagoa berdina da edo 7 baino txikiagoa berdina da.
				 * Beste kasu guztietan balioak eskatzen jarraitu behar dugu
				 */
				while (asteakoEguna < 1  || asteakoEguna > 7) {
			
					System.out.println("Idatzi zenbaki bat 1 eta 7 aretan, mesedez");
					asteakoEguna = sc.nextInt();
				}
				// switch egitura sortu eta
				switch (asteakoEguna){
					case 1:
						System.out.println("Astelehena");
						break;
					case 2:
						System.out.println("Asteartea");
						break;
					case 3:
						System.out.println("Asteazkena");
						break;
					case 4:
						System.out.println("Osteguna");
						break;
					case 5:
						System.out.println("Ostirala");
						break;
					case 6:
						System.out.println("Larunbata");
						break;
					case 7:
						System.out.println("Igandea");
						break;	
				}
				//Scanner instantzia itxi.
				sc.close();
	}

}
