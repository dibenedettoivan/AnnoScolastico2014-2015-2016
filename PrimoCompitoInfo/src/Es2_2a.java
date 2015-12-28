/*Modificare il vettore NUMERI[34,11,4,62,47,13] in modo che i valori dispari siano 
 * posti a 1 e i dispari siano posti a 0.*/
public class Es2_2a {
	
private static int NUMERI[] = {25,11,4,62,47,15};
	
	public static void main(String[] args) {
		
		for(int i = 0; i < NUMERI.length; i++){
			if(NUMERI[i] % 2 == 0){
				NUMERI[i] = 0;
			}
			else{
				NUMERI[i] = 1;
			}
		}
		for(int i = 0; i < NUMERI.length; i++){
			System.out.print(NUMERI[i] + " ");
		}
	
	}

}
