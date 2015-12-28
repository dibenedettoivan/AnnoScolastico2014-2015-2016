
public class TreConsecutivi {
	private static int[] valori = { 4, 5, 2, 2, 2, 6, 3, 6, 5, 4 };
	private static boolean trovato = false;
	public static void main(String[] args) {
		
		for(int i = 0; i <= 7; i++){
			if(valori[i] == valori[i + 1] && valori[i + 1] == valori[i + 2])
				trovato = true;
		}
		if(trovato) System.out.println("Tre valori consecutivi uguali.");
		else System.out.println("NO");
	}

}
