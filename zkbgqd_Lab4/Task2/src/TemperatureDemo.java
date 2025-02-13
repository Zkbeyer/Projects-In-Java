import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args)
    {
        //make new scanner object
        Scanner keyboard = new Scanner(System.in);

        //get input for temperature
        System.out.print("Enter the Fahrenheit temperature: ");
        double fTemp = keyboard.nextDouble();

        //make a new temperature class
        Temperature temperature = new Temperature(fTemp);

        //Print out all the data
        System.out.println("Celsius: " + temperature.getCelsius());
        System.out.println("Kelvin: " + temperature.getKelvin());

    }
}