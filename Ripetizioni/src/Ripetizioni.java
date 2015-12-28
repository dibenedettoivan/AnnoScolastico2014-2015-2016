import java.util.Scanner;

public class Ripetizioni {
	
	private static Scanner in;
	private static int a;
	private static String c;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++){
			System.out.println("Quanti caratteri vuoi inserire? ");
			a = in.nextInt();
			for(int j = 0; j < a; j++){
				c = in.nextLine();
				System.out.println(c);
			}
			
		}
		
		
		
	}

}
