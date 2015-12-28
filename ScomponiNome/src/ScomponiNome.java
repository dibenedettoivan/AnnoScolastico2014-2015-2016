import java.util.Scanner;

public class ScomponiNome {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		String str;
		System.out.println("Inserisci una parola: ");
		str	= in.nextLine();
		for(int i = 0; i < str.length(); i++ ){
			System.out.println(str.charAt(i));
		}
	}
}