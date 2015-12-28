
public class SommaPariDispari {
	
	private static int[] array = {3, 2, 3, 4, 5, 6, 7, 8, 13, 11}; 
	private static int sommapari = 0;
	private static int sommadispari = 0;
	
	public static void main(String[] args) {
		
		for(int i = 0; i < array.length; i++){			
			if(i % 2 == 1)
				sommapari += array[i];
			else
				sommadispari += array[i];
			}
		if(sommapari == sommadispari)
			System.out.println("La somma degli indici pari e dispari hanno lo stesso risultato: " + "pari: " + sommapari + "\t" + "dispari: " + sommadispari);
		else
			System.out.println("La somma degli indici pari e dispari è diversa: " + sommapari + "\t" + sommadispari);
		
}
}