import java.util.Scanner;


public class Moltiplicazione {

	private static Scanner console;

	public static void main(String[] args) {
		 double a = 0; 
		 double b = 0;
		 double cont = 1;
		 double acc = 0;
		 console = new Scanner(System.in);
		 System.out.print("Inserisci il valore da moltiplicare: ");
		 a = console.nextDouble();
		 System.out.print("Per quanto lo moltiplico?: ");
		 b = console.nextDouble();
		 while (cont<=b)
		 {
			 acc = acc + a;
			 cont ++;
		 }	
		 
		 System.out.println(acc);
		
	}
	
	
	
}