import java.util.Scanner;
class Min{
    public static void main(String args[]){
        System.out.println("Bushra 24CSU265");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minutes = ");
        int a = sc.nextInt();
        
        float y = a / (60 * 24 * 365);
        System.out.print("Year = " + y);
        
        float m = a / (60 * 24 * 30);
        System.out.print("\nMonth = " + m);
        
        float d = a / (60 * 24);
        System.out.print("\nDays = " + d);
    }
}
