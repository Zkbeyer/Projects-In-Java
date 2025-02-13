import java.util.Scanner;

public class SumAll {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //get your integer
        System.out.print("Input an integer: ");
        int n = scanner.nextInt();
        //initialize variables
        int sum = 0;
        int s = 0;

        //get the sum
        do{
            sum = sum + s;
            s++;
        }while(s<=n);

        //print the final sum
        System.out.println(sum);

    }
}