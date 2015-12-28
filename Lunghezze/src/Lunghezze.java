import java.util.Scanner;

public class Lunghezze {
	
	private static Scanner in = new Scanner(System.in);
	private static String str1;
	private static int somma = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Inserisci tutte le stringhe che vuoi e termina con una stringa vuota: ");
		
		do{ //Il "do" prima esegue il codice.
			str1 = in.nextLine();
			if(str1.length() > 0)
			if((int)(str1.charAt(0)) >= 65 && (int)(str1.charAt(0)) <= 90)
			somma += str1.length();
			
		}while(str1.length() > 0); //Il "while" esegue il controllo dopo il "do".
		System.out.println(somma);
	}
	
}
