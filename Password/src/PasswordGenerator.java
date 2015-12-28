import java.util.*;

class PasswordGenerator
{
  private static Scanner scan;

public static void main ( String[] args )
  {
    scan = new Scanner( System.in );
    Random rand = new Random();    
    int digits = 0;
    
    while ( digits < 5 )
    {
      System.out.println("Your password must have at least 5 characters.");
      System.out.print("How many characters do you want in your password? ");
      digits = scan.nextInt();
    }

    String choices = "abcdefghijklmnopqrstuvwxyz" ;
    choices += choices.toUpperCase() ;
    choices += "1234567890" ;

    String password = "";
    int j = 0;
    while ( j<digits )
    {
      password = password + choices.charAt( rand.nextInt( choices.length() ) );
      j = j + 1;
    }
    
    System.out.println("Here is your password: " + password );
  }
}
