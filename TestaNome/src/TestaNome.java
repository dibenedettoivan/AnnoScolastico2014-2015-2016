import java.util.Scanner;

public class TestaNome {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		String str;
		System.out.println("Inserisci il tuo nome: ");
		str	= in.nextLine();
		while(str.length() != 0){
			if(str.startsWith("Amy") || str.startsWith("Buffy") || str.startsWith("Cathy")){
			System.out.println("Ms. " + str);	
			}
			else if(str.startsWith("Elroy") || str.startsWith("Fred") || str.startsWith("Graham")){
				System.out.println("Mr. " + str);	
			}
			else{
				System.out.println(str);
			}
			System.out.println("Inserisci il tuo nome: ");
			str	= in.nextLine();
			break;
		}
	}
	
}