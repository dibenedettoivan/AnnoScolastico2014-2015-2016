/*Creare un metodo per calcolare il fattoriale di un intero positivo senza usare la ricorsione*/

import java.util.Scanner;

public class Fattoriale{
	
	private static Scanner in = new Scanner(System.in);
	private static int n;
	private static int fattoriale(int n){
		int k  = 1;
		for(int i = 1; i <= n; i++){
			k *= i;
			
		}return k;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Digita il numero n!: ");
		n = in.nextInt();
		
		System.out.println(fattoriale(n));
		
	}
	
	
}
