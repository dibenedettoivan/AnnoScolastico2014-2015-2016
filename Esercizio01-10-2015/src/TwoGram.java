import java.util.Scanner;


public class TwoGram {
	
	private static Scanner in = new Scanner(System.in);
	private static int num1, num2;
	private static String str1, str2, space = " ";
	private static String tab2[][]= new String[3][5];
	private static String tab1[][] = {
										{"the", "cat", "in", "the", "hat", "1999", "20"},
										{"the", "cat", "is", "on", "youtube", "1999", "13"},
										{"how", "are", "you", "doing", "today", "2000", "5000"}
										};
	
	public static void main(String[] args) {
		
		System.out.println("Digita una parola: ");
		str1 = in.nextLine();
		System.out.println("Digita la seconda parola: ");
		str2 = in.nextLine();
		
		for(int i = 0; i < tab1.length; i++){
			for(int j = 0; j < tab1[i].length; j++){
				if(str1.equals(tab1[i][j]) && str2.equals(tab1[i][j])){
					System.out.println("1");
			}	
		}
		if(tab1[0][5].equals(tab1[1][5])){
			System.out.println();
			System.out.println("L'anno corrisponde!");
			num1 = Integer.parseInt(tab1[0][6]);
			num2 = Integer.parseInt(tab1[1][6]);
			num1 += num2;
			}		
		else{
			System.out.println("L'anno non corrisponde mi dispiace...");
		}System.out.println();
	}
}
}