


public class SalaCinema {
	
	private String film = "";
	private int postiOccupati;
	private int numeroFile;
	final private int maxPerFila;
	private double incasso;
	private static int postiLiberi;
	
	public SalaCinema(String film, int numFile){
		film ="The Avengers";
		numFile = numeroFile;
		postiOccupati = 0;	
		setIncasso(0);
		maxPerFila = 24;
		
	}
	public int getPostiLiberi( int numFile, int maxPerFila){
		return numFile * maxPerFila - postiOccupati;
		
		
	}
	public void venditaBiglietti(int postiDaOccupare, String tipo){
		postiDaOccupare = postiLiberi - postiOccupati;
		
		
	}
	public String getFilm() {
		return film;
	}
	public void setFilm(String film) {
		this.film = film;
	}
	public int getMaxPerFila() {
		return maxPerFila;
	}
	public double getIncasso() {
		return incasso;
	}
	public void setIncasso(double incasso) {
		this.incasso = incasso;
	}
	
	

}