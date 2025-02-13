import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //create a new scanner object
        Scanner scanner = new Scanner(System.in);

        //get your year input
        System.out.print("Input a year: ");
        int year = scanner.nextInt();

        //Logical statments to determine a leap year or not2
        if(year % 4 != 0){
            System.out.println("NOT A LEAP YEAR");
        }
        else if(year % 100 != 0){
            System.out.println("LEAP YEAR");
        }
        else if(year % 400 == 0){
            System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("NOT A LEAP YEAR");
        }
    }
}