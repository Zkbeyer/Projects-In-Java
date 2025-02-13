import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
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

        //print the solutions
        for(int i = a; i <= b; i++){
            if(i%3==0){
                System.out.print("Fizz");
            }
            if(i%5==0){
                System.out.print("Buzz");
            }
            if(i%5!=0 && i%3!=0) {
                System.out.print(i);
            }
            System.out.println();
            }
        }
    }
