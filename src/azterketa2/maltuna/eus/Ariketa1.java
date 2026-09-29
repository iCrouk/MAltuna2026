package azterketa2.maltuna.eus;

import java.util.Scanner;

public class Ariketa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hilabetea;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Idatzi zenbaki bat 1 eta 12 artean dagoena, mesedez");
		
		hilabetea = sc.nextInt();
		
		while (hilabetea < 1 || hilabetea > 12) {
			System.out.println("Idatzi zenbaki bat 1 eta 12 aretan, mesedez");
			hilabetea = sc.nextInt();
		}
		sc.close();
		switch (hilabetea){
			case 1:System.out.println("Urtarrila");break;
			case 2:System.out.println("Otsaila");break;
			case 3:System.out.println("Martxoa");break;
			case 4:System.out.println("Apirila");break;
			case 5:System.out.println("Maiatza");break;
			case 6:System.out.println("Ekaina");break;
			case 7:System.out.println("Uztaila");break;
			case 8:System.out.println("Abuztua");break;
			case 9:System.out.println("Iraila");break;
			case 10:System.out.println("Urria");break;
			case 11:System.out.println("Azaroa");break;
			case 12:System.out.println("Abendua");break;	
		}
	}
}
