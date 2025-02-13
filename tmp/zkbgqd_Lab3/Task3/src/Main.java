import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //make a new scanner
        Scanner scanner = new Scanner(System.in);
        // get your number from an input
        System.out.printf("Input a two-digit integer: "); int d = scanner.nextInt();
        //print result
        System.out.printf("%d<->%d", d%10, d/10);
    }
}