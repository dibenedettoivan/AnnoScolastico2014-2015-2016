
public class CercaNumero {
	
	public static void main(String[] args) {
		
		int maxNum = 10000;
		int numeroCasuale;
		int bers = 10000;
		int tentativi = 0;
		
		while(true){
			numeroCasuale = (int)(Math.random() * maxNum + 1);
			tentativi++;
			if (numeroCasuale == bers) 
				break;
			
			
		}	System.out.println("Per trovare il numero " + bers + " sono stati fatti " + tentativi + " tentativi.");
	}

}
