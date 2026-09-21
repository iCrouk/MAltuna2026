package ariketak1.maltuna.eus;
import java.util.*;

public class Ariketa15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kudeatzailea = new Scanner(System.in);
        int zenbakia;

        // 1. Zenbakia eskatu eta balidatu (2 eta 10 artean egon arte)
        do {
            System.out.print("Sartu 2 eta 10 arteko zenbaki bat: ");
            zenbakia = kudeatzailea.nextInt();

            if (zenbakia < 2 || zenbakia > 10) {
                System.out.println("Errorea: Zenbakiak 2 eta 10 artekoa izan behar du.");
            }
        } while (zenbakia < 2 || zenbakia > 10);

        // 2. Faktoriala kalkulatu (adibidez: 5! = 1 * 2 * 3 * 4 * 5)
        long faktoriala = 1; // Faktorialak handiak izan daitezkeenez, 'long' motakoa erabiltzen da
        for (int i = 1; i <= zenbakia; i++) {
            faktoriala = faktoriala * i;
        }

        // 3. Emaitza bistaratu
        System.out.println("Sartutako zenbakia: " + zenbakia);
        System.out.println(zenbakia + "-(r)en faktoriala: " + faktoriala);

        // Scanner-a itxi
        kudeatzailea.close();
	}

}
