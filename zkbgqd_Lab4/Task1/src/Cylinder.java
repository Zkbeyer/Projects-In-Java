public class Cylinder{
   // Set all of the initial Variables
    double radius;
    double height;
    double PI = 3.14159;

    //Constructor
    public Cylinder(double r, double h){
        radius = r;
        height = h;
    }

    // Function to set the radius
    public void setRadius(double r) {
        radius = r;
    }

    // Function to set the height
    public void setHeight(double h) {
        height = h;
    }

    //Function to get the radius
    public double getRadius() {
        return radius;
    }

    //Function to get the height
    public double getHeight() {
        return height;
    }

    //Function to get the Volume
    public double getVolume() {
        return PI * radius * radius * height;
    }

    //Function to get the Curved Surface Area
    public double getCurvedSurfaceArea() {
        return 2 * PI * radius * height;
    }

    //Function to get the Surface Area
    public double getTotalSurfaceArea() {
        return 2 * PI * radius * (height + radius);
    }
}
