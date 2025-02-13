public class CoinTossSimulator {
    public static void main(String[] args) {
        //make a new coin object and initialize variables
        Coin coin = new Coin();
        int heads = 0;
        int tails = 0;

        //output info
        System.out.println("The initial side is: " + coin.getSideUp());
        System.out.println("I will now flip the coin 10 times");


        //simulate the coin toss 10 times
        for(int i = 0; i<10;i++){
            coin.toss();
            if(coin.getSideUp().equals("tails")){
                tails++;
            } else {
                heads++;
            }
            System.out.println(coin.getSideUp());
        }

        //print totals
        System.out.println("Total Heads:" + heads);
        System.out.println("Total Tails:" + tails);

    }

}