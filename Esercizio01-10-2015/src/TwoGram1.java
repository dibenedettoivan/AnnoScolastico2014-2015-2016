import java.util.Scanner;
/*tirar fuori 2gram con le due parole
 * cercare in tutte le righe non di seguito
 * controllo l anno
 * se stesse parole hanno stesso anno
 * sommo 6 colonna num visual
 * se diversi creo nuova riga da mem
 * stampo termini ricerca  l anno e visualizzazioni se stesso anno raggruppati*/

public class TwoGram1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String tab1[][] = {
				{"the", "cat", "in", "the", "hat", "1999", "20"},
				{"the", "cat", "is", "on", "youtube", "2000", "13"},
				{"how", "are", "you", "doing", "today", "2000", "5000"}
				};
		String a, b;
		Scanner in = new Scanner(System.in);
		int k=0;
		int u=0;
		
		System.out.println("Digita una parola: "); //inserisco le parole da ricercare
		a = in.nextLine();
		System.out.println("Digita la seconda parola: ");
		b = in.nextLine();
		
		for(int i = 0; i <tab1.length; i++){ //limito ciclo alle prime due posizioni
			for(int j = 0; j < 4; j++){
				if(a.equals(tab1[i][j]) && b.equals(tab1[i][j+1])) { //cerco la corrispondenza nella matrice delle parole cercate
					k++;
					u=i;
				
	
					} 
				}
			}
		System.out.println("corrispondenza verificata " + k + " volte");
		System.out.println();
		
			
		if(tab1[u-1][5]== tab1[u][5]) { //cerco la corrispondenza nella matrice delle parole cercate
		System.out.println("l'anno e'il medesimo");
		int e= Integer.parseInt(tab1[u][6]);
		e += Integer.parseInt(tab1[u-1][6]);
		System.out.println("somma sesta colonna: " + e);
		
		}else {
			System.out.println("l'anno e'diverso");
		}
		
		for(int i = 0; i < tab1.length; i++){
			System.out.println();
			for(int j = 0; j < tab1[i].length; j++){
				System.out.print(tab1[i][j] +" ");
			}
		}
			
	}

}
