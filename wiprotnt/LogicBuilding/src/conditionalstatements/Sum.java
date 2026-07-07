package conditionalstatements;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Value:");
		int A = sc.nextInt();
		System.out.println("Enter B Value:");
		int B = sc.nextInt();
		if((A+B)%2==0)
		{
			System.out.println("The Sum is Even");
		}
		else
		{
			System.out.println("The Sum is Odd");
		}
		sc.close();
	}
}
