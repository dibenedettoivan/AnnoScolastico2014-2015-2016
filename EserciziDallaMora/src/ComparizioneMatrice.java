/*Data una matrice di interi e un numero intero determinare se questo numero compare nella
matrice e in caso affermativo stampare gli indici della posizione in cui compare e quante volte è
presente.*/

import java.util.Scanner;

public class ComparizioneMatrice {
	
	private static int m1[][] = {
			{10, 3, 5, 6, 2, 8, 9, 2, 10, 4},
			{2, 3, 6, 7, 10, 4, 9, 10, 8, 5},
			{5, 7, 10, 3, 2, 4, 10, 6, 8, 9},
			{10, 10, 10, 10, 7, 4, 8, 9, 10}};
	
	private static Scanner in = new Scanner(System.in);
	private static int n, cont;
	private static boolean xt = false;
	
	public static void main(String[] args) {
		
		System.out.print("Digita il numero da cercare nella matrice: ");
		n = in.nextInt();
		System.out.println();
		
		for(int i = 0; i < m1.length; i++){//Stampa la matrice.
			for(int j = 0; j < m1[i].length; j++){
				System.out.print(m1[i][j] + " ");
			}System.out.println();
		}System.out.println();
		
		for(int i = 0; i < m1.length; i++){//Fa la ricerca all'interno della matrice di n.
			for(int j = 0; j < m1[i].length; j++){
				if(n == m1[i][j]){
					cont++;//Aggiunge uno ogni volta che trova un numero.
					xt = true;
				}
			}
		}
		if(xt){
			System.out.println("Il numero è stato trovato nelle posizioni: ");//Stampa le posizioni.
			for(int i = 0; i < m1.length; i++){
				for(int j = 0; j < m1[i].length; j++){
					if(n == m1[i][j]){
						System.out.println("[" + i + ":" + (j+1) + "]");
					}
				}
			}
		}
		else{
			System.out.println("Il numero non è stato trovato!");
		}
		System.out.println("Il numero si trova " + cont + " volte nella matrice.");
	}

}
