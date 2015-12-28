/*Data la matrice MAT = {{4,2,9,1},
 * 						 {3,1,21,17},
 * 						 {9,4,11,5}}
 * Visualizzare in forma matriciale la matrice data.*/
public class Es3_3a {
	
	private static int MAT[][] = {{4,2,9,1},
								  {3,1,21,17},
								  {9,4,11,5}};
	
	public static void main(String[] args) {
		
	for(int i = 0; i < MAT.length; i++){//Stampa la matrice.
		for(int j = 0; j < MAT[i].length; j++){
			System.out.print(MAT[i][j] + "\t");
		}System.out.println("\n");
	}

	}
}
