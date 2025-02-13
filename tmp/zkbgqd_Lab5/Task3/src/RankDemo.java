import java.util.Scanner;
public class RankDemo {
    public static void main(String args[]) {
        double mark; // To hold the student given mark
// create a scanner object
        Scanner keyboard = new Scanner(System.in);
// Prompt the user to enter the student's mark
        System.out.print("Enter the student's mark: ");
        mark = keyboard.nextDouble();
// create the mark converter object using the rank class
// initialized by the given student's mark
        Rank converter = new Rank(mark);
// convert and display the mark and the corresponding rank category
        System.out.println("The mark " + mark + " is ranked as " + converter.getRank());
    }
}