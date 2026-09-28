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
        String myText;
        int letters= 0;
        int digits = 0;
        int blanks = 0;
        char zuriUne = ' ';
        
       
        //Esaldia idazteko eskaera egin eta teklatukoa gorde
        System.out.println("Idatzi testu bat:");
        myText = sc.nextLine();
        
        /*Errepikapen bloke batekin Esaldia karakterretan zatitu eta  bakoitza ebaluaryko dugu.
         * Kontagailua ri 1 gehitu berdintza bat betetzen duen momentuan
         * */
        for (int i = 0; i < myText.length(); i++) {

            char eachCharacter = myText.charAt(i);

            if (Character.isLetter(eachCharacter)) {
                letters++;
            } else if (Character.isDigit(eachCharacter)) {
                digits++;
            } else if (eachCharacter == zuriUne) {
                blanks++;
            }
        }
        //Emaitzak pantailaratu
        System.out.println("---------------------------------");
        System.out.println("Letra kopurua: " + letters + " da");
        System.out.println("Digitu kopurua: " + digits+ " da");
        System.out.println("Zuriune kopurua: " + blanks+ " da");
        System.out.println("---------------------------------");
        
        //Scanner instantzia itxi
        sc.close();
	}

}
