import java.io.File;

public class ChangeFilePermission {
    public static void main(String[] args) {
    System.out.println("Bushra 24CSU265"); 
        File file = new File("C:\\Users\\user\\Documents\\Bushra\\JAVA 3\\student_data.txt");

        if (file.exists()) {
            
            file.setReadOnly();
            System.out.println("File is now read-only.");

            
            file.setWritable(true);
            System.out.println("File is now writable.");
        } else {
            System.out.println("File not found.");
        }
    }
}