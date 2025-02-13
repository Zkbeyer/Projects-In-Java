import java.io.FileNotFoundException;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) throws FileNotFoundException {
        KidsPopularName boyNames = new KidsPopularName("BoyNames.txt");
        KidsPopularName girlNames = new KidsPopularName("GirlNames.txt");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a kids' name: ");
        String name = input.nextLine();

        //variable to test to see if name is found in list
        int isPopular = 0;
        //test boy names
        if(boyNames.isPopularName(name)) {
            System.out.println("That is a popular boy name!");
            isPopular = 1;
        }
        //test girl names
        if(girlNames.isPopularName(name)) {
            System.out.println("That is a popular girl name!");
            isPopular = 1;
        }
        //in neither
        if(isPopular == 0) {
            System.out.println("That is not a popular kids name");
        }


    }
}