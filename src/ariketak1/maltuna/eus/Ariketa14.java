package ariketak1.maltuna.eus;
import java.util.*;
public class Ariketa14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kudeatzailea = new Scanner(System.in);

        // Zenbatzaileak hasieratu
        int zenbakiKopurua = 0;
        int bikoitiKopurua = 0;
        int zenbakia;

        do {
            System.out.print("Sartu zenbaki bat: ");
            zenbakia = kudeatzailea.nextInt();

            // 0 ez bada, kalkuluak egin eta mezua erakutsi
            if (zenbakia != 0) {
                zenbakiKopurua++; // Zenbaki bat gehiago

                // Bikoitia den egiaztatu (%2 eragilea erabiliz)
                if (zenbakia % 2 == 0) {
                    bikoitiKopurua++;
                }

                System.out.println("Sartu zenbaki berri bat, mesedez.");
            }

        } while (zenbakia != 0); // 0 denean begiztatik aterako da

        // Ejekuzioa amaitzean emaitzak bistaratu
        System.out.println("\nEjekuzioa amaitu da.");
        System.out.println("Sartutako zenbaki kopurua: " + zenbakiKopurua);
        System.out.println("Sartutako zenbakien artean bikoiti kopurua: " + bikoitiKopurua);

        // Scanner-a itxi
        kudeatzailea.close();
	}

}
