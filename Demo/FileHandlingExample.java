import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        try {
            // Create a new file
            File file = new File("myFile.txt");

            // Write content to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is some content in my file!");
            writer.close();

            // Read content from the file
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
