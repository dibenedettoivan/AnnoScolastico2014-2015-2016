import java.util.Scanner;

public class PositivoNegativo {
	
	private static Scanner in = new Scanner(System.in);
	private static int n = 0;
	private static int a = 0;
	private static boolean e = true;

	public static void main(String[] args) {
		
		while(true){
			System.out.println("Digita un numero: ");
			n = in.nextInt();
			if(n < 0 || n > 0){
				if(a != 0)
					if((n < 0 && a < 0) || (n > 0 && a > 0))
						e = false;
			a = n;
			}
			else
				break;
				
		}if(e)
			System.out.println("Ok");
		else
			System.out.println("No");
	}

}
