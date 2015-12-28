package eserest;

import java.util.Scanner;

public class array {
	
	private static Scanner in;
	private static int n;

		public static void main(String[] args) {
		
			in = new Scanner(System.in);
			System.out.print("Quanto grande vuoi l'array? ");
			setN(in.nextInt());
			int x[] = new int[180];
			System.out.println(x);
			
		

		
		
		}

		public static int getN() {
			return n;
		}

		public static void setN(int n) {
			array.n = n;
		}


}
