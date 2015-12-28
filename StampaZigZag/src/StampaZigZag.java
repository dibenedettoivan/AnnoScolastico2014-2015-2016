
public class StampaZigZag {
	
	private static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
	private static int i = 0;
	private static int j = 9;
	
	public static void main(String[] args) {
		
		do{
			
			System.out.print(array[i] + " ");
			i++;
			System.out.print(array[j] + "");
			j--;
			
		}while(i <= 4 && j >= 5);
	}

}
