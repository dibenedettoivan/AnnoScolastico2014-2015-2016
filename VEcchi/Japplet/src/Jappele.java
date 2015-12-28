// <applet code="JAppletAnimazione.class" height = 250 width = 300>
// </applet>

/* 
   Un applet che disegna un rettangolo (oggetto della classe Rectangle) di 
   colore rosso che si sposta sullo schermo. 
   I movimenti del rettangolo sono controllati da un bottone.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jappele extends JApplet {

    private JButton bottonePartiFerma;
    private Rectangle rettangolo;
    private PannelloDisegno disegno;
    private int a, b; 
    private boolean animazioneAttiva;
    // il temporizzatore per l'animazione
    Timer t;
    // il ricevitore di eventi per il temporizzatore.
    Ricevitore1 ricevitore1;


    public void init() {
	rettangolo = new Rectangle(10, 80, 40, 30);

	// decido di quanto traslare il rettangolo:
	a = 5; 
	b = 0;

	//costruisco un oggetto della classe interna Pannello
	// disegno che contiene il disegno del rettangolo rosso:
	disegno = new PannelloDisegno();

	// definisco e imposto il bottone:
	bottonePartiFerma = new JButton("parti");
	Ricevitore2 ricevitore2 = new Ricevitore2();
	bottonePartiFerma.addActionListener(ricevitore2);

	// inizializzo un ricevitore per il temporizzatore:
	ricevitore1 = new Ricevitore1();

	// imposto il layout:
	Container pannelloApplet = getContentPane();
	pannelloApplet.setLayout(new BorderLayout());
	JPanel pnBott = new JPanel();
	pnBott.add(bottonePartiFerma);
	pannelloApplet.add(pnBott, BorderLayout.SOUTH);
	pannelloApplet.add(disegno, BorderLayout.CENTER);

	// all'inizio non voglio che ci sia l'animazione:
	animazioneAttiva = false;
    }

    // classe interna che permette di definire il pannello 
    // con il disegno del rettangolo:
    class PannelloDisegno extends JPanel {
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    Graphics2D g2 = (Graphics2D)g;
	    rettangolo.translate(a, b);
	    g2.setColor(Color.red);
	    g2.fill(rettangolo);
	}

    }  // fine classe interna PannelloDisegno

    // classe interna che devinisce i ricevitori di eventi
    // da passare al temporizzatore:
    class Ricevitore1 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	    int x = (int)rettangolo.getX();
	    // se il rettangolo e' scappato troppo a destra, 
	    // lo faccio tornare in dietro, se e' arrivato 
	    // troppo a sinistra, lo faccio invertire la marcia:
	    if (x > 200 || x < 10)  
		a = -a;
	    disegno.repaint();
	}
    } // fine classe interna Ricevitore1

    // classe interna che permette di definire l'azione del 
    // bottone:
    class Ricevitore2 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
	    if (animazioneAttiva) 
		fermaAnimazione();
	    else 
		avviaAnimazione();
	    animazioneAttiva = !animazioneAttiva;
	}
    }  // fine classe interna Ricevitore2

    // per avviare l'animazione, creo un nuovo oggetto della 
    // classe Timer
    private void avviaAnimazione() {
	bottonePartiFerma.setText("ferma");
	t = new Timer(70, ricevitore1);
	t.start();
    }

    // per fermare l'animazione, se esiste l'oggetto t, lo 
    // fermo e lo distruggo:
    private void fermaAnimazione() {
	bottonePartiFerma.setText("parti");
	if (t != null)
	    t.stop();
	t = null;
    }

    // questo metodo e' chiamato dal sistema quando si 
    // abbandona o si copre la finestra dell'applet.
    public void stop() {
	fermaAnimazione();
    }
}

