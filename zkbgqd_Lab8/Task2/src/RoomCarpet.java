public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;

    //constructor
    public RoomCarpet(RoomDimension dim, double cost) {
        this.size = dim;
        this.carpetCost = cost;
    }

    //return the total cost
    public double getTotalCost() {
        return size.getArea() * carpetCost;
    }

    //toString
    public String toString() {
        return String.format("Carpet cost: $%.2f", getTotalCost());
    }


}
