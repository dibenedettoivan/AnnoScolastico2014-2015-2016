/*Ricercare il valore 15 nel vettore VET[2,5,7,10,14,15,17] con un metodo adeguato.
 * Compreso ES 1.d; invertire il vettore VET senza utilizzare altri vettori di appoggio.*/
import java.util.Scanner;

public class Es1_1b {

	private static Scanner in = new Scanner(System.in);
	private static int VET[] = {2,5,7,10,14,15,17};
	private static int cont = 0, a, x, con;
	
	public static void main(String[] args) {
	
		
		System.out.print("Digita il numero 15: ");
		a =  in.nextInt();
		
		for(int i = 0; i < VET.length; i++){
			if(a == VET[i]){
				con++;
				System.out.print("Trovato in totale " + con + ". " + "Posizione numero " +  "[" + i + "].");
			}
		}System.out.println("\n");
		
		
		for(int i = VET.length - 1; i >= VET.length / 2; i--){
			x = VET[cont];
			VET[cont] = VET[i];
			VET[i] = x;
			cont++;
		}
		for(int i = 0; i < VET.length; i++){
			System.out.print(VET[i] + " ");
		}
	}
}
