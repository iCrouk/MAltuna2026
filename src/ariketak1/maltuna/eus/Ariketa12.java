package ariketak1.maltuna.eus;
import java.util.*;

public class Ariketa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teklatutik idazteko Scanner objektua sortu
        Scanner kudeatzailea = new Scanner(System.in);
        
        // Konstanteak definitu
        final double ORDU_PREZIOA = 50.0;

        // Datuak teklatutik eskatu
        System.out.print("Sartu langilearen izen-abizenak: ");
        String izenAbizenak = kudeatzailea.nextLine();

        System.out.print("Sartu hilabetean eginiko lan orduak: ");
        double orduak = kudeatzailea.nextDouble();

        // 1. Soldata osoa kalkulatu
        double soldataOsoa = orduak * ORDU_PREZIOA;

        // 2. Segurtasun Sozialaren kuota kalkulatu (Baldintza erabiliz)
        double ssKuota;
        if (soldataOsoa > 2400) {
            ssKuota = 84.0;
        } else {
            ssKuota = soldataOsoa * 0.035; // %3,5a
        }

        // 3. Soldata erreala kalkulatu
        double soldataErreala = soldataOsoa - ssKuota;

        // Emaitzak pantailatik bistaratu
        System.out.println("\n--- SOLDATAREN XEHETASUNAK ---");
        System.out.println("Langilearen izena: " + izenAbizenak);
        System.out.printf("Langilearen Soldata Osoa: %.2f€\n", soldataOsoa);
        System.out.printf("Langilearen Segurtasun Sozialaren kuota: %.2f€\n", ssKuota);
        System.out.printf("Langilearen Soldata Erreala: %.2f€\n", soldataErreala);
        
        // Scanner-a itxi
        kudeatzailea.close();
	}

}
