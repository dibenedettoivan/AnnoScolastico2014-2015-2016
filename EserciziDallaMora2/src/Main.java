import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digita un numero: ");
		double x = in.nextDouble();
		System.out.print("Digita il secondo numero: ");
		double y = in.nextDouble(); 
		System.out.println();
		
		SecondClass cl = new SecondClass();
		
		cl.setRis(x, y);
		
		cl.addizione();
		System.out.println("Il risultato dell'addizione è: " + cl.getRis());
		System.out.println();
		
		cl.sottrazione();
		System.out.println("Il risulato della sottrazione è: " + cl.getRis());
		System.out.println();
		
		cl.moltiplicazione();
		System.out.println("Il risultato della moltiplicazione è: " + cl.getRis());
		System.out.println();
		
		cl.divisione();
		System.out.println("Il risultato della divisione è: " + cl.getRis());
		System.out.println();
		
		cl.potenza();
		System.out.println("Il risultato della potenza è: " + cl.getRis());
		System.out.println();
		
		
		/*cl.binario();
		System.out.println("B" + cl.getRis());*/

	
	}

}
