package ariketak3.maltuna.eus;
import java.util.Scanner;

public class Ariketa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mySc = new Scanner(System.in);
		String nireEsaldia =mySc.next().toLowerCase();
		int kontagailua;
		int esalidarenLuzeera = nireEsaldia.length();
		
		for(int i = 0; i<esalidarenLuzeera;i++) {
			char nirehizkia = nireEsaldia.charAt(i);
			kontagailua = 0;
			for(int j=0; j<esalidarenLuzeera;j++) {
				if(nirehizkia == nireEsaldia.charAt(j)) {
					kontagailua++;
				}
			System.out.println (nirehizkia+" -Errepikapen kopurua: -"+kontagailua);
			}
		}
		mySc.close();
			

	}

}
