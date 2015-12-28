/*Si abbia un array di interi da 1 a N.
 * Supponiamo per semplicità da 1 a 10 ma con un elemento mancante.
 * Trovare il modo più efficiente per determinare quello mancante.
 * Ad esempio: 
 * [5, 6, 9, 4, 1, 2, 8, 3, 10] manca il 7
 * [2, 10, 4, 5, 6, 7, 8, 9, 3] manca l'1
 * [1, 3, 2, 6, 5, 7, 8, 10, 9] manca il  4*/

public class ChiManca {

	private static int arr1[] = {1, 3, 2, 6, 5, 7, 8, 10, 9};
	private static int arr2[] = new int[arr1.length + 2];
			           
	
	public static void main(String[] args) {
		
		for(int i = 0; i < arr1.length; i++){
			arr2[arr1[i]] = arr1[i];
		}
		for(int i = 1; i < arr1.length; i++){
			if(arr2[i] == 0){
				System.out.println("Il numero che manca è " + i + "!");
			}
		}
	}

} 