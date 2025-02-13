public class RoomDimension {
    private double width;
    private double length;

    //constructor
    public RoomDimension(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //returns the area
    public double getArea() {
        return width * length;
    }

    //to string function
    public String toString() {
        return String.format("Length: %.1f Width: %.1f Area: %.1f", length, width, getArea());
    }
}
