package azterketa1.maltuna.eus;

import java.util.Scanner;

public class Ariketa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kopurua = 0;
		int bb = 0;
		int handiena = 0;
		int txikiena = 0;
		int irakurri;
		
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println ("Idatzi zenbaki bat, mesedez");
			irakurri = sc.nextInt();
			
			if (irakurri!=0) {
				if (kopurua == 0) {
					handiena = irakurri;
					txikiena = irakurri;
				}else {
					if (irakurri > handiena) {
					handiena = irakurri;
					}
			
					if(irakurri < txikiena){
					txikiena = irakurri;
					}
				}
			}
			if (irakurri != 0) {
				kopurua++;
			}
			bb = bb+irakurri;
		} while (irakurri!= 0);
		
		sc.close();
		System.out.println("Handiena: "+handiena);
		System.out.println("Txikiena: "+txikiena);
		System.out.println("kopurua: "+kopurua);
		if (kopurua == 0) {
			System.out.println("BB: 0");
		}else {
			System.out.println("BB: "+(double) bb/kopurua);
		}
	}
}
