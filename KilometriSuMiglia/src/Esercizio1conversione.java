import java.util.Scanner;
/**
 *
 * @author ivan
 */
public class Esercizio1conversione {

    private static Scanner in;

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int v = 0;
        int kmh = 1;
        
        while(kmh != 0){
        	System.out.println("Inserisci la velocità in km/h: ");
            kmh = in.nextInt(); 
            v = (1000 * kmh) / 3600;           
            System.out.println("La velocità in metri al secondo è: " + v);
            break;
        }
    }
    
}