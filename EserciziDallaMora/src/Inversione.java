/*Dato un array di interi, invertirlo e poi stamparlo*/


public class Inversione {
	
	private static int array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static int array2[] = new int[array1.length];
	
	public static void main(String[] args) {
		
		for(int i = 0; i < array1.length; i++)
			array2[array2.length - 1 - i] = array1[i];
		
		for(int i = 0; i < array1.length; i++)
			System.out.print(array1[i] + " ");
		System.out.println("\n"  + "\n");
		
		for(int i = 0; i < array1.length; i++)
			System.out.print(array2[i] + " ");
		
		
	}
}


