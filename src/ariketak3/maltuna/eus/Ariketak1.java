package ariketak3.maltuna.eus;
import java.util.*;

/*
 * 1. Karaktereen analisia: Eskatu testu bat eta erakutsi zenbat letra, digitu eta zuriune dituen.
 * */
public class Ariketak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner instatzia berria
		Scanner sc = new Scanner(System.in);
		
		//Nire Aldagaiak deklatau eta hasieratu
        String testua;
        int letKop = 0;
        int digKop = 0;
        int zuriKop = 0;
        char zuriUne = ' ';
        
       
        //Esaldia idazteko eskaera egin eta teklatukoa gorde
        System.out.println("Idatzi testu bat:");
        testua = sc.nextLine();
        
        /*Errepikapen bloke batekin Esaldia karakterretan zatitu eta  bakoitza ebaluaryko dugu.
         * Kontagailua ri 1 gehitu berdintza bat betetzen duen momentuan
         * */
        for (int i = 0; i < testua.length(); i++) {

            char karakterea = testua.charAt(i);

            if (Character.isLetter(karakterea)) {
                letKop++;
            } else if (Character.isDigit(karakterea)) {
                digKop++;
            } else if (karakterea == zuriUne) {
                zuriKop++;
            }
        }
        //Emaitzak pantailaratu
        System.out.println("---------------------------------");
        System.out.println("Letra kopurua: " + letKop + " da");
        System.out.println("Digitu kopurua: " + digKop+ " da");
        System.out.println("Zuriune kopurua: " + zuriKop+ " da");
        System.out.println("---------------------------------");
        
        //Scanner instantzia itxi
        sc.close();
	}

}
