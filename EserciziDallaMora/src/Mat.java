/*Sbagliato*/

public class Mat {
	
	private static int MAT[][] = {{21, 32, 9, 16},
	{3, 1, 21, 17},
	{9, 4, 11, 10},};
	
	public static void main(String[] args) {
		
		for(int i = 0; i < MAT.length; i++){
			for(int j = 0; j < MAT[i].length; j++){
				MAT[0][j] = MAT[2][j];
				MAT[2][j] = MAT[0][j];
				System.out.print(MAT[i][j] + "\t");
			}System.out.println("\n");
			}
		
	}

}
