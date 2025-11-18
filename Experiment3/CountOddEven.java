import java.util.Scanner;
class CountOddEven{
    public static void main(String args[]){
        System.out.println("Bushra 24CSU265");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements = ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array = ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        int arr2[] = new int[n]; 
        int arr3[] = new int[n]; 
        int even = 0, odd = 0, evencount = 0, oddcount = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                arr2[evencount++] = arr[i];
                even++;
            } else {
                arr3[oddcount++] = arr[i];
                odd++;
            }
        }
        System.out.print("\nEven elements = ");
        for(int i = 0; i < evencount; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.print("\nOdd elements = ");
        for(int i = 0; i < oddcount; i++){
            System.out.print(arr3[i] + " ");
        }
        System.out.print("\nTotal Even numbers = " + even);
        System.out.print("\nTotal Odd numbers = " + odd);
    }
}
