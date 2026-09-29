package azterketa2.maltuna.eus;

public class Ariketa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int batu = 0;
		int bider = 1;
		
		do {
			if (i%3 == 0) {
				batu+=i;
				bider*=i;
			}
		}while (i<=500);
		
		System.out.println("batuketaren emaitza: "+batu);
		System.out.println("biderketaren emaitza: "+bider);
	}

}
