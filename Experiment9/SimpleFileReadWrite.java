import java.io.*;

public class SimpleFileReadWrite {
    public static void main(String[] args) {
    System.out.println("Bushra 24CSU265"); 
        String filePath = "C:\\Users\\user\\Documents\\Bushra\\JAVA 3\\student_data.txt";

        try {
            
            FileWriter writer = new FileWriter(filePath);
            writer.write("Hello, this is a sample text file.\n");
            writer.write("File handling in Java is easy!");
            writer.close();

            
            FileReader reader = new FileReader(filePath);
            int ch;
            System.out.println("Contents of the file:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}