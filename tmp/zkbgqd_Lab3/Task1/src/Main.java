import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //define a Scanner object called scanner
        Scanner scanner = new Scanner(System.in);

        //Print a prompt and then read the value for variable 1
        System.out.print("Input an intiger ");
        int a = scanner.nextInt();
        //Print a second prompt and read the value for variable 2
        System.out.print("Input an integer ");
        int b = scanner.nextInt();

        //print out the final addition of squares
        System.out.printf("The addition of the squares of %d and %d is %d", a, b, (a*a)+(b*b));


    }
}