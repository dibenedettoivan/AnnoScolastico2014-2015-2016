import java.util.Scanner;

public class ConversioneTemperature {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		double t = 1;
		double F = 0;
			while(t != 0){
			System.out.println("Digita la temperatura in gradi Celsius: ");
			t = in.nextDouble();
			F = (9 * (t) / 5) + 32;
			System.out.println("La temperatura in Celsius è " + t);
			System.out.println("La temperatura in Fahrenheit " + F);
			break;
		}
	}
}
