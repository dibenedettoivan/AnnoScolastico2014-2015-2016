package provevarie;
import java.io.*;

public class Prove {
	
	public static void main(String[] args) {
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		int età1 = 0, età2 = 0, età3 = 0;
		int media;
		
		System.out.println("Persona 1 ***************");
		System.out.print( "età: ");
		
		try{
			String numeroLetto = tastiera.readLine();
			età1 = Integer.valueOf(numeroLetto).intValue();
		}
		catch(Exception e){
			System.out.println("\nNumero non corretto");
			return;
		}
		
		System.out.println("Persona 2 ***************");
		System.out.print("età: ");
		
		try{
			String numeroLetto = tastiera.readLine();
			età2 = Integer.valueOf(numeroLetto).intValue();
		}
		catch(Exception e){
			System.out.println("\nNumero non corretto");
		}
		
		System.out.println("Persona 3 ***************");
		System.out.print("età: ");
		
		try{
			String numeroLetto = tastiera.readLine();
			età3 = Integer.valueOf(numeroLetto).intValue();
		}
		catch(Exception e){
			System.out.println("\nNumero non corretto");
		}
		media = (età1 + età2 + età3) / 3;
		System.out.println("\nEtà media: " + media);
	}

}
