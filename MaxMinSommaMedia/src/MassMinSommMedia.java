import java.util.Scanner;


public class MassMinSommMedia {
	
	private static Scanner console;

	public static void main(String[] args){
		int a;
		int esci = 1;
		int massimo = 0;
		int minimo = 0;
		int somma = 0;
		int media = 0;
		int cont = 1;
		console = new Scanner(System.in);
		System.out.println("Inserisci un valore, digita 0 per terminare : ");
		while(esci > 0){
			a = console.nextInt();
			if (a > 0){
				if (a > massimo){
					massimo = a;
					
				}
			
			if (cont == 1){
				minimo = a;
			}
			if (a < minimo){
				minimo = a;
				
			}
			somma += a;
			media= somma / cont;
			cont +=1;
			}
			else{
				esci = 0;
			}
		}
		System.out.println("Massimo valore inserito " + massimo);
		System.out.println("Minimo valore inserito " + minimo);
		System.out.println("Somma dei valori inseriti " + somma);
		System.out.println("Media dei valori inseriti " + media);
		
	}

}