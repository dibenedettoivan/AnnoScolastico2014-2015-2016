/*Ordinare un array unidimensionale di interi.*/
public class Es1_1a {
	
	private static int a[] = {2,3,5,8,4,1,9,6,10,7,11,18,13,12,15,14,17,20,19,16};
	private static int x;

	public static void main(String[] args) {
		
		System.out.println("Ecco l'array: ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");}
		System.out.println("\n");
		
		for(int i = 0; i < a.length; i++){
			for(int j = i + 1; j < a.length; j++){
				if(a[i] > a[j]){
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
		System.out.println("Ecco l'array in ordine crescente: ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");}
		
		for(int i = 0; i < a.length; i++){
			for(int j = i + 1; j < a.length; j++){
				if(a[i] < a[j]){
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
		}
		System.out.println("\n");
		System.out.println("Ecco l'array in ordine decrescente: ");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}


}
