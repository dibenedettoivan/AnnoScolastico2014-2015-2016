import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digita il nome");
		nome = in.nextLine();
		System.out.println("Digita il cognome");
		cognome = in.nextLine();
		System.out.println("Digita la classe");
		classe = in.nextInt();
		
		Persona p = new Persona();
		Studente s = new Studente();
		
		p.setRis(nome, cognome);
		
		System.out.println(p);
		System.out.println(s);
		
	}

}
