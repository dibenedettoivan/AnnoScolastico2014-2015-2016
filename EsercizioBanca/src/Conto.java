
public class Conto {
	
	//Attributi
	private double saldo;
	
	
	//Costruttore
	public Conto(){
		saldo = 0;
	}
	
	public Conto(double saldoIniziale){
		saldo = saldoIniziale;
	}
	
	
	//Meodi
	public void deposito(double quanto){
		saldo += quanto;
	}
	
	public boolean prelievo(double  quanto){
		if(saldo >= quanto){
			saldo -= quanto;
			return true;
		}
		return false;
	}
	
	public double ritornaSaldo(){
		return saldo;
		
	}
	
	public boolean trasferisci(Conto altro, double quanto){
		if(prelievo(quanto)){
			altro.deposito(quanto);
			return true;
		}
		return false;
		
	}

}