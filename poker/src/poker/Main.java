package poker;


public class Main {

    public static void main(String[] args) {
        
        // Creo il mazzo.
        Deck mazzo = new Deck();
        
        // Mischio il mazzo.
        mazzo.mix();
        
        // Mostro le carte.
        mazzo.show();
                
    }
}