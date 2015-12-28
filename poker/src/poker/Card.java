package poker;

public class Card {

    private String _seed;
    private String _value;
    private String[] _values = {"A", "2", "3", "4", "5", "6", 
                                "7", "8", "9", "10", "J", "Q", "K"};

    Card(int num) {

        int val = num;

        if (val < 13) {
            this._seed = "CUORI";
        } else if (val < 26) {
            this._seed = "QUADRI";
            val = val - 13;
        } else if (val < 39) {
            this._seed = "FIORI";
            val = val - 26;
        } else {
            this._seed = "PICCHE";
            val = val - 39;
        }

        this._value = this._values[val];

    }

    /**
     * 
     * @return Valore + Seme della carta
     */
    public String getCardValue() {
        String ret = null;

        ret = this.getValue();
        ret += " " + this.getSeed();

        return ret;
    }

    public String getSeed() {
        return this._seed;
    }

    public String getValue() {
        return this._value;
    }

    public void setSeed(String value) {
        this._seed = value;
    }
}

