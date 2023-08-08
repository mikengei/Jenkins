import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        String fileName = "test.txt";
        String contentToAppend = "Hello, World!\n";

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
