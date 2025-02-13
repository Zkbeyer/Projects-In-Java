import static java.lang.Math.round;

public class Coin {
    //
    String sideUp;

    //constructor for coin
    public Coin(){ toss();}

    //getSideUp function
    public String getSideUp(){ return this.sideUp;}

    //simulate a coin toss
    public void toss() {

        if (Math.random() < 0.5) {
            this.sideUp = "tails";
        }
        else  {
            this.sideUp = "heads";
    }
    }
}
