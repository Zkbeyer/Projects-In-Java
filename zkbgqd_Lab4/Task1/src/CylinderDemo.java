import java.util.Scanner;


public class CylinderDemo {
    public static void main(String[] args)
    {
        //Make your scanner object
        Scanner keyboard = new Scanner(System.in);

        //Get input for radius and height
        System.out.print("Enter the radius of a clinder: ");
        double radius = keyboard.nextDouble();
        System.out.print("Enter the height of a cylinder: ");
        double height = keyboard.nextDouble();

        //Create the new cylinder object
        Cylinder cylinder = new Cylinder(radius, height);

        //Print out all of the information about the cylinder
        System.out.println("The cylinder's radius is " + cylinder.getRadius());
        System.out.println("The cylinder's height is " + cylinder.getHeight());
        System.out.println("The cylinder's volume is " + cylinder.getVolume());
        System.out.println("The cylinder's curved surface area is " + cylinder.getCurvedSurfaceArea());
        System.out.println("The cylinder's total surface area is " + cylinder.getTotalSurfaceArea());
    }
}


