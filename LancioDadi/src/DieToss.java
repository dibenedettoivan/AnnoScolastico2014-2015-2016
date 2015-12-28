import java.util.Random;
import java.util.Scanner;

public class DieToss
{

  private static Scanner scan;
  private static String line;

public static void main ( String[] args )
  {
    scan = new Scanner( System.in );
    Random rand = new Random( );
    
    while ( true )
    {
      System.out.print("Il dado da " + ( 10.0 * rand.nextGaussian()));
      line = scan.nextLine();
    }
  } 
}
