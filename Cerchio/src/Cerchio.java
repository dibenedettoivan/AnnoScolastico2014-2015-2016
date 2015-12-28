import java.util.Scanner;

public class Cerchio {
	
	private static Scanner in = new Scanner(System.in);
	private static double x; 
	private static double area;
	
	public static void main(String[] args) {
		
		System.out.print("Digita il raggio del cerchio: ");
		x = in.nextDouble();
		area = Math.PI * x * x;
		area = Math.rint(area * 100);
		area /= 100;
		System.out.println(area);
		
	}

}
