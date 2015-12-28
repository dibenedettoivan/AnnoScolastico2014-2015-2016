/*Dato un array di interi, trova tutte le coppie di elementi dell'array tali che la loro somma
 * sia uguale ad un dato numero.
 * Per esempio se l'array è ,{4, 5, 7, 11, 9, 13, 8, 12} e il nostro input è 20, 
 * allora devi trovare tutte le coppie la cui somma  sia 20.
 * Per questo esempio (9, 11), (7, 13) e (8, 12).*/

import java.util.Scanner;

public class ricerca {
	
	private static Scanner in = new Scanner(System.in);
	private static int array[] = {4, 5, 7, 11, 9, 13, 8, 12};
	private static int n, ris;
	
	public static void main(String[] args) {
		
		System.out.println("Inserisci il numero da cui vuoi la verifica: ");
		n = in.nextInt();
		
		for(int i = 0; i < array.length; i++){
			for(int j = i + 1; j < array.length; j++){
				ris = array[i] + array[j];
				if(ris == n){
					System.out.println("[" + array[i] + " + " + array[j]+ "]");
				}
			}
		}
	}

}
