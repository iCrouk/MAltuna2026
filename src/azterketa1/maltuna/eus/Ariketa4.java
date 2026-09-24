package azterketa1.maltuna.eus;

public class Ariketa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int batuketa= 0;
		int biderketa = 1;
		
		for (int i = 1;i<1000;i++) {
			if (i%7 == 0) {
				if (i%2 == 0) {
					batuketa += i;
					biderketa *= i;
				}
			}
		}
		System.out.println("Batuketaren emaitza: "+batuketa);
		System.out.println("Biderketaren emaitza: "+biderketa);
	}

}
