import java.io.*;

public class BufferedFileExample {
    public static void main(String[] args) {
    System.out.println("Bushra 24CSU265"); 
        String filePath = "C:\\Users\\user\\Documents\\Bushra\\JAVA 3\\student_data.txt";

        try {
           
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            bw.write("1 John 8.9 A");
            bw.newLine();
            bw.write("2 Mary 9.2 A");
            bw.newLine();
            bw.write("3 Alex 7.5 B");
            bw.newLine();
            bw.close();
            System.out.println("Data written successfully!");

           
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            System.out.println("\nContents of the file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}