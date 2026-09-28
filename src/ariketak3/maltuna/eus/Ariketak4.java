package ariketak3.maltuna.eus;
import java.util.*;

public class Ariketak4 {
	
	/*
	 * 
	 * 4. Palindromoa: Egiaztatu String bat berdin irakurtzen den ezkerretik eskuinera eta eskuinetik ezkerrera.
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mySc = new Scanner(System.in);

        System.out.println("Idatzi hitz bat, mesedez:");
        String testua = mySc.nextLine().trim().toLowerCase();

        boolean palindromoa = true;

        for (int i = 0; i < testua.length() / 2; i++) {

            char leftToRight = testua.charAt(i);
            char rightToLeft = testua.charAt(testua.length() - 1 - i);

            if (leftToRight != rightToLeft) {
                palindromoa = false;
            }
        }

        if (palindromoa) {
            System.out.println("Testua palindromoa da.");
        } else {
            System.out.println("Testua ez da palindromoa.");
        }

        mySc.close();

	}

}
