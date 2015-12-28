import java.util.Scanner;

public class SecondoArray {
	
	private static int[] array;
	private static Scanner in = new Scanner(System.in);
	private static int cont = 0;
	private static int j = 0;
	
	public static void main(String[] args) {
		
		array = new int[10];
		
		System.out.println(" Inserisci i valori da immettere nell'array: ");
		
		for(int i = 0; i < array.length; i++){
			array[i] = in.nextInt();
			if(array[i] >= 0)
				cont++;
		}
		int[] array2 = new int[cont];
		for(int i = 0; i < array.length; i++){
			if(array[i] >= 0) {
				array2[j] = array[i];
				j++;
			}
				
		}
		for(int i : array)
		System.out.print("Ecco l'array appena creato " + i + " ");
		System.out.println();
		for(int i = cont - 1; i >= 0; i--)
		System.out.print("Ecco l'array 2 con i valori in posizione inversa " + array2[i] + " ");
	}
}

