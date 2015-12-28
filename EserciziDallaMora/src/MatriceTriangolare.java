/*Data una matrice quadrata di numeri interi, visualizzare solo gli elementi sopra alla diagonale
principale in modo che la stampa sia triangolare.*/


public class MatriceTriangolare {
	
	private static int matrice[][] = {
			{1, 2, 3, 5, 7, 8},
			{3, 4, 6, 8, 9, 4}, 
			{5, 3, 9, 5, 2, 7}, 
			{4, 5, 6, 3, 7, 8},
			{4, 5, 6, 8, 4, 7},
			{4, 6, 2, 9, 9, 5}
			};
	
	public static void main(String[] args) {
		
		for(int i = 0; i < matrice.length; i++){
			for(int j = 0; j < matrice[i].length; j++){
				if( j > i){
					System.out.print(matrice[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
			}System.out.println();
			System.out.println("\n");
		}
		
	}
}
