import java.util.Scanner;


public class ControlloStringhe {

	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		System.out.println("Inserisci una frase: ");
		String str = in.nextLine();
		System.out.println("Digita quello che vuoi che cerco all'interno della frase: ");
		String str1 = in.nextLine();
		int cont = 0;
		
		while(str.contains(str1)){
			cont++;
			str = str.replaceFirst(str1, "");
		}System.out.println("La stringa "+ str1 + " che hai cercato si trova all'interno della frase per " + cont + " volta/e.");
			
	}
}