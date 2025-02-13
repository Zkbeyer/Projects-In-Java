import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //create new scanner object
        Scanner scanner = new Scanner(System.in);

        //get a number input
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        //if else statment to determine odd or even
        if(number%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }


    }
}