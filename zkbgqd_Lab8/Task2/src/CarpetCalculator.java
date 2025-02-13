import java.util.Scanner;

public class CarpetCalculator {
    public static void main(String[] args) {
        //get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price per square foot: ");
        double price = scanner.nextDouble();
        System.out.print("Enter the length of the room: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the room: ");
        double width = scanner.nextDouble();

        RoomDimension d = new RoomDimension(width, length);
        RoomCarpet room = new RoomCarpet(d, price);

        //print information
        System.out.println(d);
        System.out.println(room);
    }
}