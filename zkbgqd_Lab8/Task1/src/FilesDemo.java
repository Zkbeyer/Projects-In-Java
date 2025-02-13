import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args){
        String file_name = "lines.txt";

        //deleting the file each time I run main to make sure I am using a blank file for each new run
        File file = new File(file_name);
        if(file.exists()){
            file.delete();
        }

        //New FileSave object
        FileSave fileSave = new FileSave(file_name);

        //writing all of the lines to the new file
        try {
            fileSave.save("1-Lorem ipsum dolor sit amet");
            fileSave.save("2-Consectetuer adipiscing elit");
            fileSave.save("3-Sed diam nonummy nibh euismod tincidunt");
            fileSave.save("4-Ut wisi enim ad minim veniam");
            fileSave.save("5-Quis nostrud exerci tation ullamcorper");
            fileSave.save("6-Suscipit lobortis nisl ut aliquip ex ea commodo consequat");
            fileSave.save("7-Duis autem vel eum iriure dolor in hendrerit");
            fileSave.save("8-Vel illum dolore eu feugiat nulla facilisis at vero eros");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //new FileDisplay object
        FileDisplay fileDisplay = new FileDisplay(file_name);

        //doing all of the display functions
        try {
            fileDisplay.display();
            System.out.println(" ");
            fileDisplay.display(3);
            System.out.println(" ");
            fileDisplay.display(10);
            System.out.println(" ");
            fileDisplay.display(3, 5);
            System.out.println(" ");
            fileDisplay.display(3, 10);
            System.out.println(" ");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}