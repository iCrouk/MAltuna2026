package ariketak1.maltuna.eus;

public class Ariketa16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
        int n2 = 1;
        
        System.out.println("Fibonacci segidaren lehenengo 10 zenbakiak:");

        // For begizta bat erabiliko dugu 10 zenbaki lortu arte
        for (int i = 1; i <= 10; i++) {
            // Uneko zenbakia inprimatu (n1)
            System.out.print(n1 + " ");

            // Hurrengo zenbakia kalkulatu aurreko biak batuz
            int hurrengoa = n1 + n2;
            
            // Balioak berritu hurrengo itzulirako
            n1 = n2;
            n2 = hurrengoa;
        }
        System.out.println(); // Lerro amaiera garbia uzteko
	}

}
