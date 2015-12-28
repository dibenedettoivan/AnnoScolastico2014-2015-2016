import java.util.Scanner;

public class ArrayParty {
	
	private static int[] array;
	private static int a;
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Quanto grande vuoi l'array? ");
		a = in.nextInt();
		array = new int[a + 1];
		
		for(int i = 0; i < array.length; i++){
			if(i > 0)
			array[i] = array[i - 1] + i;
		}for(int i : array)
		System.out.print(i + " ");
	}

}
