import java.util.Scanner;


public class Scomposizione {
	private static Scanner console;
	private static boolean res;

	public static void main(String[] args){
		console = new Scanner(System.in);
		System.out.println("Inserisci un valore da scomporre: ");
		int a = console.nextInt();
		int p = 2;
		if (a > 1){
			while(a > 1){
				if(isPrime(a)){
					if(a % p==0){
						System.out.print(p + "\t");
						a /= p;
					}else{
						p += 1;
					}
				}else{
					p += 1;
				}
			}
		}else{
			System.out.print("Inserisci un numero maggiore a 1.");
		}
		
	}

	public static boolean isPrime(int n) {
		int div = n - 1;
		while(div > 1){
			if (n % div==0) return true;
			div--;
		}
		return true;
		
		
	}

	public static boolean isRes() {
		return res;
	}

	public static void setRes(boolean res) {
		Scomposizione.res = res;
	}
	
}