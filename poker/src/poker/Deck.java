package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    public List<Card> cards = new ArrayList<Card>();

    public Deck() {

        while (this.cards.size() < 52) {

            Card c = new Card(this.cards.size());
            this.cards.add(c);

        }

    }
    
    /**
     * Mostra il mazzo carta per carta
     */

    public void show() {

        for (Card carta : this.cards) {
            System.out.println(carta.getCardValue());
        }

    }

    /**
     *  Mescola il mazzo.
     */
    public void mix() {
        long seed = System.nanoTime();
        Collections.shuffle(this.cards, new Random(seed));
    }

}