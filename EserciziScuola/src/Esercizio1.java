
import java.util.Scanner;

public class Esercizio1 {
    
    private static Scanner in;

	public static void main(String[] args) {
        
        int num, ite = 0;
        in = new Scanner(System.in);        
        System.out.print("Inserisci un numero: ");
        num= in.nextInt();
        System.out.print(num + " ");
        
        while ( num > 1 ){            
            if ( num %2==0 ){                
                num /= 2;
                ite++; 
                System.out.print(num + " ");
            }
            
            else {
                
                num = (num * 3) + 1;
                ite++;
                System.out.print(num + " ");
            }
        }
        System.out.print("\n");
        System.out.println("Il numero di iterazioni è: " + ite);
    }
}