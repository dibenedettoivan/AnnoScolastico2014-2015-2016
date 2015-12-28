/* Data una matrice di dimensioni decise dall' utente, determinare:
a) Se è quadrata
b) Nel caso lo sia dire se è simmetrica, altrimenti azzerare solo i valori minori di 15 e visualizzare la diagonale principale.*/

import java.util.Scanner;

public class simmetria {
	
	private static Scanner in = new Scanner(System.in);
	private static int m1[][];
	private static int x, y;
	
	
	public static void main(String[] args) {
		
		System.out.print("Inserisci i numeri di righe della matrice:  ");
		x = in.nextInt();
		System.out.print("Digita il numero di colonne della matrice:  ");
		y = in.nextInt();
		System.out.println("Digita i numeri che vuoi nella matrice: ");
		
		int m1[][] = new int [x][y];
		
		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m1[i].length; j++){
				m1[i][j] = in.nextInt();
			}
		}System.out.println();
		
		for(int i = 0; i < m1.length; i++){//Stampa la matrice.
			for(int j = 0; j < m1[i].length; j++){
				System.out.print(m1[i][j] + " ");
			}System.out.println();
		}System.out.println();
		
		if(x != y){
			System.out.print("La matrice non è quadrata.");
			System.out.println("\n");
						
			for(int i = 0; i < m1.length; i++){//Stampa la matrice.
				for(int j = 0; j < m1[i].length; j++){
					if(m1[i][j] < 15){
					m1[i][j] = 0;}
					System.out.print(m1[i][j] + " ");
				}System.out.println();
			}System.out.println();
		}
		else{
			System.out.println("La matrice è quadrata quindi ecco la tua diagonale.");
			System.out.println("\n");
		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m1[i].length; j++){
				if(i == j){
					System.out.print(m1[i][j] + "\t");
				}
				else{
					System.out.print("\t");
				}
			}System.out.println();
			System.out.println("\n");
		}
		}
	}


	public static int[][] getM1() {
		return m1;
	}


	public static void setM1(int m1[][]) {
		simmetria.m1 = m1;
	}
	

}
