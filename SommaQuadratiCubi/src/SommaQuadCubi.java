import java.util.Scanner;

public class SommaQuadCubi {
	
	private static Scanner in;

	public static void main(String[] args){
		
		System.out.println("Di quale numero vuoi la somma di quarati e cubi? ");
		in = new Scanner(System.in);
		int f = in.nextInt();
		int d = 0;
		int g = 0;
		
		for(int i = 1; i <= f; i++) {
			d += (i * i);
			g += (i * i * i);
		}
		
		System.out.println("La somma dei quadrati è: " + d);
		System.out.println("La somma dei cubi è:     " + g);
		
	}

}