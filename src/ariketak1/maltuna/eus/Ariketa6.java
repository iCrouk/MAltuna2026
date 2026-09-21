package ariketak1.maltuna.eus;
import java.util.*;

public class Ariketa6 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Idatzi zenaki oso bat");
		int znb = sc.nextInt();
		
		if (znb%2 == 0) {
			System.out.println("Zenbakia bikoitia da");
		}else {
			System.out.println("Zenbakia bakoitia da");
		}
		sc.close();
	}

}
