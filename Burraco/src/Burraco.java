import java.awt.*;



public class Burraco {
	
	private static String space = "    ";
	private static int numeroCarte = 104;
	private static String nomeCarta;
	private static int pozzetto1 = 11, pozzetto2 = 11;
	private static int[] monteScarti;
	private static int chiusura = 100, burracoPuro = 200, burracoSporco = 100, puntiCarte, chiusuraDefinitiva, pozzettoNonPreso = - 100;
	private static int due = 20, tre = 5, quattro = 5, cinque = 5, sei = 5, sette = 5, otto = 10, nove = 9,
			dieci = 10, jack = 10, donna = 10, re = 10, asso = 15;
	private static Frame f;
	private static Panel p;
	private static Label vuota, nome, punteggio;
			
	
	public static void main(String[] args) {
		
		
		f  = new Frame("Tavolo  da gioco");
		f.setSize(500, 500);
		f.setLocation(100, 0);
		p = new Panel();
		p.setBackground(Color.RED);
		f.add(p);
		vuota = new Label();
		nome = new Label();
		vuota.setText("- PARTITA -");
		puntiCarte = asso + quattro + jack + donna + sei + sette;
		chiusuraDefinitiva = chiusura + burracoPuro + puntiCarte;
		punteggio = new Label("Il tuo punteggio " + puntiCarte, Label.LEFT);
		p.add(vuota);
		p.add(nome);
		p.add(punteggio);
		f.setVisible(true);
		
		System.out.println("Punteggio" + space + chiusuraDefinitiva);
		
	}

}
