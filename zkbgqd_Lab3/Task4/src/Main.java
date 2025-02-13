import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //make a new scanner
        Scanner scanner = new Scanner(System.in);

        //get your double input
        System.out.print("input your double: "); double n = scanner.nextDouble();

        System.out.printf("%d.0\n", (int) n);
        System.out.printf("%.1f\n", n - (double)(int) n );

    }
}