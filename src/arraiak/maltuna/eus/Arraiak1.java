/**
 * 
 */
package arraiak.maltuna.eus;
//import java.util.*;
/**
 * 
 */
public class Arraiak1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nireArraia = new int[10];
		//int[] nireZenbakiak = {5,6,74,2,1,77};
		//String[] nireIzenak = {"Iker","Mikel","Naroa","Izaro"};
		//char [] nireKarakterak = {'a','b','c','d','e','f'};
	System.out.println(nireArraia);	//[I@42d3bd8b itzuliko du
	System.out.println(nireArraia[2]); //defektuz eta balio gabe 0 itzuliko du
	
	System.out.println(nireArraia[2]); 
	
	int[] nireZenbakiak = {5,6,74,2,1,77};
	//for normal batekin
	for (int i=0; i< nireZenbakiak.length;i++) {
		System.out.println(nireZenbakiak[i]);
		
	}
	// do-while egitura batekin
	int i=0;
	do {
		System.out.println(nireZenbakiak[i]);
	}
	while(i<nireZenbakiak.length);
	//foreach egitura batekin
	for (int n : nireZenbakiak) {
		System.out.println(n);
	}
	
	}

}
