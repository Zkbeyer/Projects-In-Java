import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDisplay {
    private String file_name;

    //constructor
    public FileDisplay(String file_name) {
        this.file_name = file_name;
    }

    //displays given no int
    public void display() throws FileNotFoundException {
        File file = new File(file_name);
        if (!file.exists()) {
            System.out.println("File does not exist");
            return;
        }

        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
        return;
    }

    //displays given an int value
    public void display(int n) throws FileNotFoundException {
        File file = new File(file_name);
        if (!file.exists()) {
            System.out.println("File does not exist");
            return;
        }

        Scanner scanner = new Scanner(file);
        int i = 0;
        while( i < n && scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            i++;
        }

        scanner.close();
        return;
    }

    //displays given two int values
    public void display(int from, int to) throws FileNotFoundException {
        File file = new File(file_name);
        if (!file.exists()) {
            System.out.println("File does not exist");
            return;
        }

        Scanner scanner = new Scanner(file);
        int i = 0;
        while(i < from-1 && scanner.hasNextLine()) {
            scanner.nextLine();
            i++;
        }

        while(i < to && scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            i++;
        }

        scanner.close();
        return;
    }
}
