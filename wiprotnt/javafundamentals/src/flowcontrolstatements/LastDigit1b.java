package flowcontrolstatements;

import java.util.Scanner;

public class LastDigit1b {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		if((a%10)==(b%10))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
