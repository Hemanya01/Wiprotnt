package conditionalstatements;
import java.util.Scanner;
public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N Value:");
		int N = sc.nextInt();
		if(N%2==0)
		{
			System.out.println("The Number is Even");
		}
		else
		{
			System.out.println("The Number is Odd");
		}
		sc.close();
	}

}
