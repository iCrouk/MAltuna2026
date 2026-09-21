package ariketak1.maltuna.eus;

public class Ariketa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
        int b = 2;
        int c = 8;

        int menor, medio, mayor;

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                medio = b;
                mayor = c;
            } else {
                medio = c;
                mayor = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                medio = a;
                mayor = c;
            } else {
                medio = c;
                mayor = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                medio = a;
                mayor = b;
            } else {
                medio = b;
                mayor = a;
            }
        }

        System.out.println("Ordenatuta: " + menor + ", " + medio + ", " + mayor);
        System.out.println("Ordenatuta: " + mayor + ", " + medio + ", " +menor);
    }
}
