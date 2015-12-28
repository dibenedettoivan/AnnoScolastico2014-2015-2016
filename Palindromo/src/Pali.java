import java.util.Scanner;

public class Pali {
	
	private static Scanner in;

	public static void main(String[] args) {
		
		String w;
		in = new Scanner(System.in);
		
		System.out.print("Inserire parola: ");
		w = in.nextLine();
		
		w= w.replace(" ", "");
		
		int j= w.length()-1;
		int i=0;
		
		while (w.charAt(i)==w.charAt(j)) {
			
			if (w.charAt(i)!=w.charAt(j)){ System.out.println("Non è un palindromo"); break;}
			else {
			i++; 
			j--;}
			System.out.println("Palindromo");
		}
		
		
	}

}