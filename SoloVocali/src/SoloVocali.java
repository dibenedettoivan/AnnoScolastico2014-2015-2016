import java.util.Scanner; 

public class SoloVocali {
	
		private static Scanner in = new Scanner(System.in); //Importazione dello Scanner e chiamata dell'"in".
		private static String vocali = "AEIOUaeiou"; //Variabile contenente le vocali su cui viene eseguito il test.
		private static String str1; //Riferimento all'oggetto str1 che verrà richiamato nell'inserimento della stringa da parte dell'utente.
		private static String str2 = ""; //Stringa vuota che poi verrà riempita prendendo le vocali della variabile "vocali".
	
	public static void main(String[] args) {
		
		System.out.print("Inserisci una stringa a tuo piacere: "); //Richiesta all'utente la stringa da analizzare.
		str1 = in.nextLine(); //Acquisizione della stringa da parte dell'utente.
		
		for(int i = 0; i < str1.length(); i++){ //Questo for serve per ciclare nella stringa immessa dall'utente.
			for(int j = 0; j < vocali.length(); j++){ //Questo serve per ciclare la stringa delle "vocali".
				if(str1.charAt(i) == vocali.charAt(j)){ //In questo if vado a confrontare i caratteri tra "str1" e "vocali".
					str2 += str1.charAt(i); //Qui il carattere che è stato riconsciuto nelle "vocali" viene inserito nella variabile "str2".
				}
			}
		}System.out.println();
		 System.out.print(str2); //QUi verrà stampato il risultato della scansione delle stringhe e appariranno solo le vocali prese dalla
								   //stringa inserita in "str1".
	}

}

