import java.util.Scanner;


public class Potenza {
	
	private static Scanner console;

	public static void main(String[] args){
		int a;
		int b;
		int ris = 1;
		console = new Scanner(System.in);
		System.out.println("Che numero vuoi elevare?: ");
		a = console.nextInt();
		System.out.println("Per quanto lo elevo?: ");
		b = console.nextInt();
		if (a <= 0){
			System.out.println("Inserisci un numero superiore a 0");
			
		}
		else {
			ris =1;
		while(b > 0){
			ris *= a;
			b --;
		}
		}
	
		System.out.println(ris);

	}
}