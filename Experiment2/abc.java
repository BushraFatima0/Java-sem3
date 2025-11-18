import java.util.Scanner;
class abc{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an alphabet:");
		String x=in.nextLine();
		switch(x){
		case "a": {
			System.out.println("Vowel");
			break;}
		case "e": {
			System.out.println("Vowel");
			break;}
		case "i": {
			System.out.println("Vowel");
			break;}
		case "o": {
			System.out.println("Vowel");
			break;}
		case "u": {
			System.out.println("Vowel");
			break;}
		default: {
			System.out.println("Consonent");
			break;}
		}
	}
}