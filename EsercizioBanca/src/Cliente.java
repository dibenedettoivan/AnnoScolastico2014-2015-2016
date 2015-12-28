
public class Cliente {
	
	//Attributi
	private String nome;
	private int numCliente, pin;
	private Conto conto;
	
	//Costruttore
	public Cliente(String nome, int numCliente, int pin, Conto conto){
		this.nome = nome;
		this.numCliente = numCliente;
		this.pin = pin;
		this.conto = conto;		
	}
	
	//Metodi
	public boolean verifica(int numCliente, int pin){
		if(this.numCliente == numCliente && this.pin == pin){
			return true;
		}
		return false;
		
	}
	
	public int ritornaNumCliente(){
		return numCliente;	
	}

	public int getNumCliente() {
		return numCliente;
	}

	public Object getName() {
		return nome;
	}
	public Conto getConto(int i){
		return conto;
	}

}
