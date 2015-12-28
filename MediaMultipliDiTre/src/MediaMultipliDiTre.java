import java.util.Scanner;

public class MediaMultipliDiTre {
	
	private static Scanner in = new Scanner(System.in);
	private static int n = 0;
	private static int a;
	private static int cont = 0;
	private static int somma = 0;

	public static void main(String[] args) {

		System.out.println("Quanti numeri vuoi inserire? ");
		a = in.nextInt();
	
	for(int i = 0; i < a; i++){
		System.out.println("Digita un numero: ");
		n = in.nextInt();
		if(n % 3 == 0){
			somma += n;
			cont++;
			}
		}System.out.println("La media è (non calcolando i numeri che non sono divisibili per 3) è " + somma / cont + ".");
	}

}
