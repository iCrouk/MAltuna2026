package ariketak1.maltuna.eus;
import java.util.*;

public class Ariketa10 {
	/*Teklatuz hiru zenbaki oso eskatzen dituen algoritmo bat diseinatu;
lehenengoa negatiboa bada, hiruren biderkaketa inprimatu behar du eta,
hala ez bada, hiruren batura inprimatuko du.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int znb1,znb2,znb3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Idatzi lehen zenbakia,mesedez");
		znb1 = sc.nextInt();
		System.out.println("Idatzi lehen zenbakia,mesedez");
		znb2 = sc.nextInt();
		System.out.println("Idatzi lehen zenbakia,mesedez");
		znb3 = sc.nextInt();
		
		if (znb1 < 0) {
			System.out.println(znb1*znb2*znb3);
		}else {
			System.out.println(znb1+znb2+znb3);
		}
		
		sc.close();
	}

}
