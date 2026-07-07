package conditionalstatements;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N Value:");
		int N = sc.nextInt();
		if(N>0)
		{
			System.out.println("The Number is Positive");
		}
		else if(N<0)
		{
			System.out.println("The Number is Negative");
		}
		else
		{
			System.out.println("The Number is Zero");
		}
		sc.close();
	}

}
