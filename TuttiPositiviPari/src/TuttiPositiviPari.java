import java.util.Scanner;

public class TuttiPositiviPari {
	
	private static Scanner in;
	private static boolean pari = true;
		
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		System.out.println("Quanti numeri vuoi inserire: ");
		int a = in.nextInt();
		
		for(int i = 0; i < a; i++){
			System.out.println("Digita il numero: ");
			int dig = in.nextInt();
			
			
			if(dig % 2 == 1 || dig < 0){
				pari = false;			
				
			}
			
			
		}
		
		if(pari)
			System.out.println("Tutti positivi e pari.");
		else
			System.out.println("NO!!!!!");
	}	
}

