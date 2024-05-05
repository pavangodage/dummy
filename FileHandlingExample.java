import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class FileHandlingExample {
    public static void main(String[] args) {
        // Write to a file
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a simple file handling example in Java.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from a file
        try {
            File file = new File("example.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
