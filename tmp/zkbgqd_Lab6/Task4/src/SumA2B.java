import java.util.InputMismatchException;
import java.util.Scanner;

public class SumA2B {
    public static void main(String[] args)
    {
        //initialize variables
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;

        //get a valid lower bound
        while(true){
            try{
                System.out.print("Input the lower bound: ");
                a = scanner.nextInt();
                break;
            } catch(InputMismatchException e) {
                System.out.println("Invalid input");
                scanner.next();
            }
        }
        //get a valid upper bound
        while(true){
            try{
                System.out.print("Input the upper bound: ");
                b = scanner.nextInt();
                if(a>b){
                    System.out.println("Upper bound must be greater than lower bound");
                    continue;
                }
                break;
            } catch(InputMismatchException e) {
                System.out.println("Invalid input");
                scanner.next();
            }
        }

        //find the sum
        for(int i = a; i <= b; i++){
            sum += i;
        }
        //print the sum
        System.out.println("The sum is: " + sum);
    }
}