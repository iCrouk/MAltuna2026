package ariketak3.maltuna.eus;
import java.util.*;

public class Ariketak3 {
/*
 * 
 * 3. Email baten egiaztapena: Aztertu ea testuak @ sinboloa eta
puntu bat dituen, contains() eta indexOf() erabiliz.
 *
 * 
 * Zuzena izateko = xxxxxx@xxxxx.xxx
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mySc = new Scanner(System.in);
		
		System.out.println("idtzi zure email osoa, mesedez");
		String myEmail = mySc.next().trim().toLowerCase();
		//Counters
		int atCounter = 0;
		int dotCount = 0;
		
		//positionCounter
		int atPosition = 0;
		int dotPosition = 0;
		boolean atCorrect = false;
		boolean dotCorrect = false;
		
		if (myEmail.contains("@") && myEmail.contains(".")){
		for (int i=0;i<myEmail.length();i++) {
			char myCharacter = myEmail.charAt(i);
			
			if (myCharacter == '@') {
				atCounter++;
			}
			
			if (myCharacter == '.') {
				dotCount++;
			}
		}
		}
		
		if (atCounter !=0) {
			if (atCounter == 1) {
				atPosition = myEmail.indexOf("@");
				
				if (atPosition > 0 && atPosition< myEmail.length()-1) {
					atCorrect = true;
				}
			}
		}
		
		if (dotCount !=0) {
			if (dotCount == 1) {
				dotPosition = myEmail.indexOf(".");
				
				if (dotPosition > 0 && dotPosition< myEmail.length()-1) {
					dotCorrect = true;
				}
			}
		}
		
		if (atCorrect && dotCorrect) {
			if ( dotPosition > atPosition) {
				System.out.println ("Emaila zuzena da");
			}else {
				System.out.println ("Emaila okerra da");
			}
		}
		mySc.close();
	}
}
