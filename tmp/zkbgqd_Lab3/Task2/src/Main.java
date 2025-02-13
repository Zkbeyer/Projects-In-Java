import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //define the Scanner object
        Scanner scanner = new Scanner(System.in);

        //Give prompt and store input
        System.out.print("Input an intiger: ");
        int n = scanner.nextInt();

        //Output the result of the equation
        System.out.printf("The answer is %d", ((n+1)* n+2)* n+3);
    }
}