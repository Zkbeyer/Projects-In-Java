public class RankSwitchVersion {
    double mark;

    public RankSwitchVersion(double m) {
        mark = m;
    }

    //Function to get Rank
    public String getRank(){
        int temp = (int) (mark / 10);
        switch(temp) {
            case 0,1,2,3,4:
                return "Unacceptable";
            case 5,6:
                return "Below Expectations";
            case 7,8:
                return "Meets Expectations";
            //This default case assumes a valid mark has been passed
            default:
                return "Above Expectations";
        }
    }
}
