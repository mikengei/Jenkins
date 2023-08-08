import java.io.FileWriter;
import java.io.IOException;

//test
public class AppendToFile {
    public static void main(String[] args) {
        String fileName = "test.txt";
        String contentToAppend = "Fetching changes from the remote Git repository\n";

        try {
            FileWriter fileWriter = new FileWriter(fileName, true); // The true parameter indicates append mode
            fileWriter.write(contentToAppend);
            fileWriter.close();
            System.out.println("Content appended to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
