import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileSave {
   private String file_name;

    //constructor
    public FileSave(String file_name) {
        this.file_name = file_name;
    }

    //Function to save new lines of text to the file
    public void save(String line) throws IOException {
        File file = new File(file_name);
            //append to the existing file
            FileWriter fw = new FileWriter(file, true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(line);

            pw.close();
            return;

    }
}
