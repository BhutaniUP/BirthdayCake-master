package cs301.birthdaycake;

public class CakeModel {
    boolean candlesLit = true;
    int candles = 2;
    boolean cakeHasFrosting = true;
    boolean cakeHasCandles = true;

    public void blowOutCandles() {
        if(candlesLit == false) {
            candlesLit = true;
        }
        else {
            candlesLit = false;
        }
    }
}
