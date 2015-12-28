import java.lang.Math;

public class SecondClass {

	private double ris, x, y; 
	
	public double getRis(){
		return ris;
	}
	public void setRis(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	
	public void addizione() {
		if(x > 0 && y > 0){
			ris = x + y;
		}
	}
	public void divisione(){
		ris = x / y;
	}
	public void potenza(){
		ris = Math.pow(x, y) ; 
	}
	public void sottrazione(){
		ris = x - y;
	}
	public void moltiplicazione(){
		ris = x * y;
	}
	/*public void binario(){
		int[] ris = new int[10];
		int i = 9;
		while((int)x >= 0){
			x /=2;
			ris[i] = (int) (x % 2);
			i--;
		}
		for(int j = 0; i < ris.length; j++){
			System.out.print(ris[j]);
		}
	}*/

}
