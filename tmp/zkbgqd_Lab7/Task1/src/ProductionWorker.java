import static java.lang.String.format;

public class ProductionWorker extends Employee {
    //production worker variables
    private int shift;
    private double payRate;
    public final int DAY_SHIFT = 1;
    public final int NIGHT_SHIFT = 2;

    //constructor
    public ProductionWorker(String n, String num, String date, int sh, double rate) {
        super(n, num, date);
        this.shift = sh;
        this.payRate = rate;
    }

    //empty constructor
    public ProductionWorker() {
        super();
        shift = 0;
        payRate = 0;
    }

    public void setShift(int sh) {
        this.shift = sh;
    }

    public void setPayRate(double rate) {
        this.payRate = rate;
    }

    public int getShift() {
        return shift;
    }

    public double getPayRate() {
        return payRate;
    }

    //override the toString function
    public String toString() {
        String shiftTime;
        //determine day or night shift
        if(this.shift == DAY_SHIFT) {
            shiftTime = "Day";
        }else if (this.shift == NIGHT_SHIFT) {
            shiftTime = "Night";
        } else{
            shiftTime = "None";
        }

        //format string to return how instructed
        return format("Name: %s\nEmployee Number: %s\nHire Date: %s\nShift: %s\nHourly Pay Rate: $%.2f", this.getName(), this.getEmployeeNumber(), this.getHireDate(), shiftTime, this.getPayRate());
    }
}
