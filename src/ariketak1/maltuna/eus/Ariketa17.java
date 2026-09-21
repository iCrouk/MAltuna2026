package ariketak1.maltuna.eus;
import java.util.*;

public class Ariketa17 {
	public static void main(String[] args) {
        // Teklatutik irakurtzeko Scanner-a sortu
        Scanner kudeatzailea = new Scanner(System.in);

        // Erabiltzaileari urtea eskatu
        System.out.print("Sartu urte bat: ");
        int urtea = kudeatzailea.nextInt();

        // Baldintza logikoa egiaztatu
        // (4rekin zatigarria ETA ez 100ekin zatigarria) EDO (400ekin zatigarria)
        if ((urtea % 4 == 0 && urtea % 100 != 0) || (urtea % 400 == 0)) {
            System.out.println(urtea + " urtea BISURTEA da.");
        } else {
            System.out.println(urtea + " urtea EZ da bisurtea.");
        }

        // Scanner-a itxi
        kudeatzailea.close();
    }
	
}
