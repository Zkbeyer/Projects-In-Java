import java.util.Scanner;
import static java.lang.Math.sqrt;

public class PrintSquares {
    public static void main(String[] args)
    {
        //new scanner object
        Scanner input = new Scanner(System.in);

        //get variables set up
        System.out.print("Enter your integer: ");
        int n = input.nextInt();
        int s = 1;
        //check for and print squares
        while(s < n){
            if (Math.pow((int) sqrt(s), 2) == s){
                System.out.print(s+", ");
            }
            s++;
        }
    }
}