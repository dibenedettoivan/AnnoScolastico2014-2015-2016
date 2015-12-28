import java.util.Scanner;

public class Contrario {
	
	private static Scanner in = new Scanner(System.in);
	private static String a;
	private static String b = "";
	
	public static void main(String[] args) {
		
		System.out.println("Digita una stringa: ");
		a = in.nextLine();
		
		for(int i = a.length()-1; i >= 0; i--){
			
			b += a.charAt(i);
			
		}
		System.out.println(b);
		
	}

}
