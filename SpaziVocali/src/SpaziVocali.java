import java.util.Scanner;

public class SpaziVocali {
	
		private static Scanner in = new Scanner(System.in);
		private static char space = ' ';
		private static String vocali = "AEIOUaeiou";
		private static String str1;
		private static int somma = 0;
	
	public static void main(String[] args) {
		
		System.out.print("Digita la frase che preferisci: ");
		str1= in.nextLine();
		
		for(int i = 0; i < str1.length(); i++){
			if(str1.charAt(i) == space)
				for(int j = 0; j < vocali.length(); j++)
					if(vocali.charAt(j) == str1.charAt(i -1))
						somma++;
		}
		System.out.println();
		System.out.println(somma);
	}

}
