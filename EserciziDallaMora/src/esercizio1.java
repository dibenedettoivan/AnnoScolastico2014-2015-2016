/*Primo esercizio
 * Data una matrice, 3x5 di interi, crearne una seconda 3x5 sempre interi, 
 * con valori tali nelle righe pari avrà valori tripli e nelle dispari tutti i 
 * valori uguali ad 1.*/


public class esercizio1 {

	private static int m1[][] =    {{3, 4, 5, 6, 7},
									{3, 7, 2, 23, 9},
									{2, 9, 8, 1, 10}};
	private static int m2[][] = new int[3][5] ;
	
	public static void main(String[] args) {
		
		System.out.print("Ecco la matrice: " + "\n" + "\n");
	for(int i = 0; i < m1.length; i++){
		for(int j = 0; j < m1[i].length; j++){
			System.out.print(m1[i][j] + "\t");
		}System.out.println("\n");
	}System.out.println("\n");
		
		for(int x = 0; x < 3; x++){
			for(int y = 0; y < 5; y++){
				if(x % 2 == 0){
					m2[x][y] = m1[x][y] * 3;
				}
				else{
					m2[x][y] = 1;
				}System.out.print(m2[x][y] + "\t");
			}System.out.println("\n");
		}
	}
}
