package ariketak1.maltuna.eus;
import java.util.*;
public class Ariketa13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kudeatzailea = new Scanner(System.in);

        // Konstanteak definitu
        final double IRABAZI_PORTZENTAIA = 0.0825; // %8.25

        // Eskatutako koaderno kopurua teklatutik eskatu
        System.out.print("Sartu eskatutako koaderno kopurua: ");
        int kopurua = kudeatzailea.nextInt();

        // Koadernoko unitate-prezioa kalkulatu baldintzen arabera
        double unitatePrezioa;

        if (kopurua <= 9) {
            unitatePrezioa = 10.0;
        } else if (kopurua <= 29) { // 10etik 29ra
            unitatePrezioa = 8.0;
        } else if (kopurua <= 59) { // 30etik 59ra
            unitatePrezioa = 7.0;
        } else {                    // 60 unitate edo gehiago
            unitatePrezioa = 6.0;
        }

        // Salmentaren prezio osoa eta irabazia kalkulatu
        double salmentaPrezioa = kopurua * unitatePrezioa;
        double irabazia = salmentaPrezioa * IRABAZI_PORTZENTAIA;

        // Emaitzak bistaratu
        System.out.println("\n--- SALMENTAREN XEHETASUNAK ---");
        System.out.println("Eskatutako koaderno kopurua: " + kopurua);
        System.out.printf("Salmentaren prezioa: %.2f€\n", salmentaPrezioa);
        System.out.printf("Saltzailearen irabazia: %.2f€\n", irabazia);

        // Scanner-a itxi
        kudeatzailea.close();
	}

}
