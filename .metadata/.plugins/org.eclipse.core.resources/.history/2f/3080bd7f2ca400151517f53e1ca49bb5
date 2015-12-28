
public class Banca {
	
	//Attributi
	private final int DEFAULT_MAX_TOT_CLIENTI = 50;
	private Cliente[] clienti;
	
	//Costruttore
	public Banca(){
		clienti = new Cliente[DEFAULT_MAX_TOT_CLIENTI];
	}
	
	public Banca(int maxTotCLienti){
		if(maxTotCLienti < 1) clienti = new Cliente[DEFAULT_MAX_TOT_CLIENTI];
		clienti = new Cliente[maxTotCLienti];
	}
	
	//Metodi
	public boolean registra(Cliente cliente){
		for(int i = 0; i < clienti.length; i++)
			if(clienti[i] == null){
				clienti[i] = cliente;
				return true;
			}
		return false;
	}
	
	void cancella(Cliente cliente){
		for(int i = 0; i < clienti.length; i++)
			if(clienti[i] == cliente)
				clienti[i] = null;
		
	}
	
	public Cliente trova(int numCliente){
		for(int i = 0; i < clienti.length; i++)
			if(clienti[i].getNumCliente() == numCliente){
				return clienti[i];
			}
		return null;
		
	}
	
	public Cliente trova(String nome){
		for(int i = 0; i < clienti.length; i++)
			if(clienti[i].getName().equals(nome)){
				return clienti[i];
			}
		return null;
		
	}
	
	public boolean trasferisci(int numClienteSrg, int numClienteDst, double quanto){
		if(trova(numClienteSrg) != null && trova(numClienteDst) != null){
			
		}
		return false;
		
	}

}
