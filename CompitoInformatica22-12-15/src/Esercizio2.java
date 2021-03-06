/* Dato un vettore di interi compresi tra 0 e 100, costruire un secondo vettore in cui sono messi per primi tutti
 * i numeri inferiori a 50 in ordine decrescente e poi per secondi i restanti numeri in ordine crescente.
 * Uilizzare un unico nuovo vettore dove si riempie da sinistre a destra per la prima tipoloia di numeri
 * e da destra verso sinistra la seconda tipologia di numeri. Paramerizzare le variabili della soluzione. Non modificare l'array dato.
 * Scorri l'array il meno possibile. Commenta dove ritieni opportuno. Rientra tutte le linee di codice per non subire penalizzazioni.
 * Ad esempio: input: {4,28,53,80,2,77,1,61,98} output: {28,4,2,1,53,61,77,80,98}
 * Di Benedetto Ivan*/

public class Esercizio2 {
	
	private static int a[] = {4, 28, 53, 80, 2, 77, 1, 61, 98, 10};
	private static int a2[] = new int[a.length];
	private static int x, y, sx = 0, dx = a2.length - 1, md = (sx + dx) / 2;
	
	public static void main(String[] args) {

		for(int i = 0; i < a.length; i++){
			for(int j = i + 1; j < a.length; j++){
				if(a[i] > a[j]){
					x = a[i]; a[i] = a[j]; a[j] = x;
				}
			}
		}
		for(int i = 0; i < a.length; i++){
			if(a[i] < 50){
				a2[sx] = a[i];
				for(int a = 0; a < a2.length; a++){
					for(int b = a + 1; b < a2.length; b++){
						if(a2[a] > a2[b]){
							y = a2[a]; a2[a] = a2[b]; a2[b] = y;
						}
					}
				}
			}
		}for(int i = 0; i < a2.length; i++) System.out.print(a2[i] + " ");
	}
}
