/*Date 2 matrici 3x2 sempre di int crearne una terza avente 
 * per valori le somme dei valori uguali tra le due matrici.*/
public class esercizio3 {
	
	private static int m1[][] = {
			{2, 8},
			{4, 4},
			{13, 7}
			};
	private static int m2[][] = {
			{2, 8},
			{4, 5},
			{13, 7}
			};
	private static int m3[][] = new int[3][2];
	
	public static void main(String[] args) {
		
		for(int i = 0; i < m1.length; i++){//Stampa la matrice.
			for(int j = 0; j < m1[i].length; j++){
				System.out.print(m1[i][j] + " ");
			}System.out.println();
		}System.out.println();
		
		for(int i = 0; i < m2.length; i++){//Stampa la matrice.
			for(int j = 0; j < m1[i].length; j++){
				System.out.print(m2[i][j] + " ");
			}System.out.println();
		}System.out.println();
		
		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m1[i].length; j++){
				if(m1[i][j] == m2[i][j]){
					m3[i][j] = m1[i][j] + m2[i][j];
				}
				
			}
		}
		for(int x  = 0; x < m3.length; x++){
			System.out.println();
			for(int y = 0; y < m3[x].length; y++){
				System.out.print(m3[x][y]+" ");
				
			}
		}System.out.println();
	}
	

}
