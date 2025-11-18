import java.util.Scanner;
class ReverseNumber{
    public static void main(String args[]){
        System.out.println("Bushra 24CSU265");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. = ");
        int a = sc.nextInt();
        int d1 = a % 10;
        int d2 = (a / 10) % 10;
        int d3 = a / 100;
        int rev = d1 * 100 + d2 * 10 + d3;
        System.out.print("Reverse of this no. = " + rev);
    }
}
