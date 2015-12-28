
public class Es2_2b {
	
	private static int NUMERI[] = {34,11,4,62,47,13};
	
	public static void main(String[] args) {
		
		for(int i = 0; i < NUMERI.length; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(NUMERI[i] + " ");
			}
			System.out.println();
		}
		
		
	}

}
