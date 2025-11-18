class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class ArgumentSum {
    public static void main(String[] args) {
        System.out.println("Bushra 24csu265");
        try {
            if (args.length < 5) {
                throw new CheckArgumentException("Error: You must pass 5 integer arguments.");
            }
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("Sum of 5 numbers = " + sum);
        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers only.");
        }
    }
}
