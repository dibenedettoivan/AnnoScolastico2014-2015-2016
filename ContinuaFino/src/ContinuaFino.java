import java.util.Scanner;

public class ContinuaFino {
	
		private static int eccezione = 0;
		private static int somma = 0;
		private static Scanner in = new Scanner(System.in);
		private static int n = 0;

		public static void main(String[] args) {
			

			while(true){ //Finchè è vero continua a ciclare.
				System.out.println("Digita il numero: ");
				n = in.nextInt();
				
				if((n % 3 == 0 && n > 0) || (n % 2 == 0 && n < 0) ){ //Se il numero diviso per 3 ha il resto di 0 e se è maggiore di 0. 
					//O se il numero diviso per 2 ha il resto 0 ed è minore di 0.
					somma += n; //Qui aggiunge alla somma il numero.
			
				}
				else{ //Se il numero non rispetta l'if viene scartato.
					eccezione += n; //Qui viene aggiunto il numero che fa eccezione.
					break; //Serve a bloccare il ciclo.
				}
			}
			System.out.println("La somma dei numeri inseriti è " + somma + ".");
			System.out.println("Il numero che non rispetta le condizioni è " + eccezione + ".");
	}

}
