package ariketak1.maltuna.eus;
import java.util.*;

public class Ariketa18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kudeatzailea = new Scanner(System.in);

        // Erabiltzaileari zenbakia eskatu
        System.out.print("Sartu zenbaki bat: ");
        int jatorrizkoZenbakia = kudeatzailea.nextInt();

        // Aldagaiak prestatu kalkulurako
        int zenbakia = jatorrizkoZenbakia;
        int alrebes = 0;

        // Zenbakia alrebes jartzeko begizta
        while (zenbakia > 0) {
            int azkenZifra = zenbakia % 10;       // Azken zifra lortu
            alrebes = (alrebes * 10) + azkenZifra; // Zifra alrebesera gehitu
            zenbakia = zenbakia / 10;            // Azken zifra kendu
        }

        // Egiaztapena egin
        if (jatorrizkoZenbakia == alrebes) {
            System.out.println(jatorrizkoZenbakia + " zenbakia PALINDROMOA da.");
        } else {
            System.out.println(jatorrizkoZenbakia + " zenbakia EZ da palindromoa.");
        }

        // Scanner-a itxi
        kudeatzailea.close();
	}

}
