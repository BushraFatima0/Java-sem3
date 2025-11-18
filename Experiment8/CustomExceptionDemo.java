class MyException extends Exception {
    private String message;
    public MyException(String message) {
        this.message = message;
    }
    public void printMessage() {
        System.out.println("Stored Message: " + message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Bushra 24csu265");
        try {
            throw new MyException("This is my own exception message!");
        } catch (MyException e) {
            e.printMessage();
        }
    }
}
