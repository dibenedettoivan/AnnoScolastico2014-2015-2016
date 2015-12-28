import java.util.Scanner;

class Example
{
  private static Scanner scan;

public static void main (String[] args)  
  {
    scan = new Scanner( System.in );
    int num;
    System.out.println("Enter an integer:");
    num = scan.nextInt();
    
    

    if ( num < 0 )
    {
      // true-branch
      System.out.println("The number " + num + " is negative");

    } 
    else
    { 
      if ( num > 0 )
      { 
        // nested true-branch
        System.out.println("The number " + num + " is positive"); 
      } 
      else
      {
        // nested false-branch
        System.out.println("The number " + num + " is zero");
      }

    }

    System.out.println("Good-bye for now");    // always executed
  }
}