/*Ricercare il valore 12 nel VET[3,6,7,10,12,15,23] con un metodo adeguato.*/

import java.util.Scanner;

public class Ricerca {
	
	
	private static Scanner in = new Scanner(System.in);
	private static int VET[] = {3,6,7,10,12,15,23,24};
	private static int cont = 0, a, x, con;
	
	public static void main(String[] args) {
	
		
		System.out.print("Digita il numero 12: ");
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
