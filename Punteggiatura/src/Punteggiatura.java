import java.util.Scanner;

public class Punteggiatura {
	
	private static Scanner in = new Scanner(System.in);
	private static String str1;
	private static int somma = 0;
	private static String punti = ",.;:!?";
	
	public static void main(String[] args) {
		
		System.out.println("Inserisci le stringhe compresi i caratteri di punteggiatura: ");
		
		do{
			str1 = in.nextLine();
			if(str1.length() > 0)
			for(int i = 0; i < str1.length(); i++)
				for(int j = 0; j < punti.length(); j++)
					if(str1.charAt(i) == punti.charAt(j))
						somma++;
			
		}while(str1.length() > 0);
		System.out.println(somma);
	}
}