import java.util.Scanner;


public class RadiceIntera {

	private static Scanner console;

	public static void main(String[] args){
		int a;
		int k = 1;
		console = new Scanner(System.in);
		System.out.println("Di quale numero vuoi la radice: ");
		a = console.nextInt();
		while (k * k <= a){
			k += 1;
		}
		System.out.println("La radice di " + a + " è " + (k -1) + ".");
	}
}