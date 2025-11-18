public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Bushra 24csu265");
        try {
            throw new Exception("This is a custom Exception message!");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed successfully.");
        }
    }
}
