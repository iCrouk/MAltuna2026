package ariketak3.maltuna.eus;
import java.util.Scanner;

public class Ariketak2 {
	/*
	 * 
	 * 2. Bokalak: Eskatu hitz bat eta zenbatu bokalak, maiuskulak eta
minuskulak kontuan hartuta.
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mySc = new Scanner(System.in);
		
		System.out.println("Idatzi hitz bat, mesedez");
		String myWord = mySc.next().trim().toLowerCase();
		int numVocals = 0;
		
		mySc.close();
		
		for (int i=0; i<myWord.length();i++) {
			char eachCharacter = myWord.charAt(i);
			
			if (eachCharacter == 'a' || eachCharacter =='e' || eachCharacter =='i' || eachCharacter =='o' || eachCharacter =='u') {
				numVocals++;
			}
		}
		
		System.out.println(myWord+" hitzaren bokal kopurua "+numVocals+" da.");
	}

}
