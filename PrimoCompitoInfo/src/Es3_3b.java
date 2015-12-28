/*Dall'Es3a scambia la terza riga con la prima.*/
public class Es3_3b {
	
	private static int MAT[][] = {{4,2,9,1},
			  					  {3,1,21,17},
			  					  {9,4,11,5}};
	private static int a[] = new int[MAT.length];
	
	public static void main(String[] args) {
		
		for(int i = 0; i < MAT.length; i++){//Lavoro sulla matrice
			for(int j = 0; j < MAT[i].length; j++){
				a[0] = MAT[2][j];
				MAT[2][j] = MAT[0][j];
				MAT[0][j] = a[0];
			}
		}
		for(int i = 0; i < MAT.length; i++){//Visualizza la matrice
			for(int j = 0; j < MAT[i].length; j++){
				System.out.print(MAT[i][j] + "\t");
			}System.out.println("\n");
		}
		
	}

}
