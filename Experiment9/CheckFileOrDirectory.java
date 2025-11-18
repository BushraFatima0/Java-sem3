import java.io.File;

public class CheckFileOrDirectory {
    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\user\\Documents\\Bushra\JAVA 3\\student_data.txt");

        if (!file.exists()) {
            System.out.println("The path does not exist.");
        } else if (file.isFile()) {
            System.out.println("The path refers to a FILE.");
        } else if (file.isDirectory()) {
            System.out.println("The path refers to a DIRECTORY.");
            
        }
    }
}
