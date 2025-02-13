public class Rank {
    double mark;

    //constructor to create the Rank class
    public Rank(double m) {
        mark = m;
    }

    //getRank function to return the rank
     public String getRank() {
        if(mark < 50){
            return "Unacceptable";
        }
        else if(mark < 70){
            return "Below Expectations";
        }
        else if (mark < 90){
            return "Meets Expectations";
        }
        else{
            return "Exceeds Expectations";
        }
     }
}
