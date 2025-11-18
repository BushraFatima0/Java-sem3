import java.util.Scanner;
class ReverseArray{
    public static void main(String args[]){
        System.out.println("Bushra 24CSU265");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];

        System.out.print("Enter the elements = ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = n - 1; i >= 0; i--){
            arr2[i] = arr[n - 1 - i];
        }

        System.out.print("Reversed Array = ");
        for(int i = 0; i < n; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
