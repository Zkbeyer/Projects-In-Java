public class MagicDate {
    int month;
    int day;
    int year;

    //constructor
    public MagicDate(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    //is Magic function
    public Boolean isMagic(){

        if(month*day == year){
            return true;
        }else {
            return false;
        }
    }
}
