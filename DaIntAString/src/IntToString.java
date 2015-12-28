import java.util.Scanner;

public class IntToString {
	
	private static int num;
	private static Scanner in = new Scanner(System.in);
	private static String a;
	private static String b = "";
	private static int c;
	
	
	public static void main(String[] args) {
		
		System.out.println("Inserisci un intero: ");
		num = in.nextInt();
		a = String.valueOf(num);
		System.out.println(a);
		
		for(int i = 0; i < a.length(); i++){
			c = Character.getNumericValue(a.charAt(i)) * Character.getNumericValue(a.charAt(i));
			b += String.valueOf(c);	
		}
		System.out.println(b);
	}

}
