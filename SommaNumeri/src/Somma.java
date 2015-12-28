import java.util.Scanner;

public class Somma {
	
	private static Scanner input;

	public static void main(String[] args){
		
		input = new Scanner(System.in);
		
		System.out.println("Quanti numeri vuoi che sommi? ");
		int a = input.nextInt();
		int b = 0;
		int c = 0;
	
		while(b < a){
			System.out.println("Digita il numero: ");
			int dig = input.nextInt();
			c += dig;
			b ++;
		}
		System.out.println("La somma dei tuoi numeri è: " + c);
		
		
		
	}

}