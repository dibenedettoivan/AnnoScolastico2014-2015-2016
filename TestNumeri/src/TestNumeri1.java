import java.util.*;

public class TestNumeri1 {
	
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {

		int numeroBase;
		System.out.print("Inserisci un numero: ");
		numeroBase = in.nextInt();

		String spazio = "    "; // definisco uno spazio per l'impaginazione

		int quadrato, cubo, quartaPot, quintaPot, sestaPot, settimaPot, ottavaPot, nonaPot, decimaPot;
		double sestaPotDouble;
		quadrato = numeroBase*numeroBase;
		cubo = quadrato*numeroBase;
		quartaPot = cubo*numeroBase;
		quintaPot = quartaPot*numeroBase;
		sestaPot = quintaPot*numeroBase;
		settimaPot = sestaPot*numeroBase;
		ottavaPot = settimaPot*numeroBase;
		nonaPot = ottavaPot*numeroBase;
		decimaPot = nonaPot*numeroBase;

		sestaPotDouble = Math.pow(numeroBase, 8);

		System.out.println();
		System.out.println(spazio + "numero base:       " + numeroBase);
		System.out.println(spazio + "quadrato:          " + quadrato);
		System.out.println(spazio + "cubo:              " + cubo);
		System.out.println(spazio + "quarta  potenza:   " + quartaPot);
		System.out.println(spazio + "quinta  potenza:   " + quintaPot);
		System.out.println(spazio + "sesta   potenza:   " + sestaPot);
		System.out.println(spazio + "settima potenza:   " + settimaPot);
		System.out.println(spazio + "ottava  potenza:   " + ottavaPot);
		System.out.println(spazio + "nona    potenza:   " + nonaPot);
		System.out.println(spazio + "decima  potenza:   " + decimaPot);

		System.out.println();

		System.out.println("Altro modo per calcolare la decima potenza: " 
				   + "usando Math.pow(): " + 
				   + decimaPot);
		System.out.println();

	    }  // fine main


	} // fine class TestNumeri1