import java.util.Scanner;

public class Esercizio2 {
	
	private static Scanner in;
	private static int[] arrays;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		System.out.println("Digita il numero che vuoi convertire: ");
		int n = in.nextInt();
		int ris;
		setArrays(new int [n]);
		
		while(n > 0){
			ris = n % 16;
			if(ris == 14 ){
				System.out.println("A");
				break;
			}
			else{
				System.out.print(ris);
				break;
			}
			
		}
		
	}

	public static int[] getArrays() {
		return arrays;
	}

	public static void setArrays(int[] arrays) {
		Esercizio2.arrays = arrays;
	}  
	
}