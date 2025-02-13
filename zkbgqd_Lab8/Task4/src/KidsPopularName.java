import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KidsPopularName {
    private String[] Kidsnames;
    private String fileName;

    //constructor
    public KidsPopularName(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        fillNames();

    }

    //get length of list from file
    public int getNumNames() throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        int count = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            count++;
        }
        scanner.close();
        return count;
    }

    //get names into an array
    public void fillNames() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        Kidsnames = new String[getNumNames()];
        for (int i = 0; i < Kidsnames.length; i++) {
            Kidsnames[i] = scanner.nextLine();
        }
        scanner.close();
    }

    //test for name
    public boolean isPopularName(String name) {
        for (int i = 0; i < Kidsnames.length; i++) {
            if (Kidsnames[i].equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }





}
