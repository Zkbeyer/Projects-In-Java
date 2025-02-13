import java.util.Scanner;

public class MagicDatesDemo {
    public static void main(String[] args)
    {
        //create a new scanner class;
        Scanner scanner = new Scanner(System.in);

        //get input for date
        System.out.print("Enter a day: ");
        int day = scanner.nextInt();
        System.out.print("Enter a month: ");
        int month = scanner.nextInt();
        System.out.print("Enter a two digit year(ex: for 1960 input 60): ");
        int year = scanner.nextInt();

        //create a new MagicDate object
        MagicDate magicDate = new MagicDate(day, month, year);

        //logical expression to determine what to print
        if(magicDate.isMagic()){
            System.out.println("Magic Date");
        }else{
            System.out.println("Not a magic date");
        }
    }
}