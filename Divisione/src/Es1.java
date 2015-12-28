import java.util.Scanner;

public class Es1 {
	
	private static Scanner console;

	public static void main(String[] args) {
		 int a = 0; 
		 int b = 0;
		 int cont = 0;
		 console = new Scanner(System.in);
		 System.out.print("Immetti il numero che vuoi dividere: ");
		 a = console.nextInt();
		 System.out.print("Per quanto lo divido?: ");
		 b = console.nextInt();
		 while (a > 0)
		 {
			 a -= b;
			 cont += 1;
		 }	
		 
		 if(a < 0) cont--;
		 
		 System.out.println(cont);
	}

}