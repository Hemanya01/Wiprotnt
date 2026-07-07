package conditionalstatements;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Values:");
		int A=sc.nextInt();
		System.out.println("Enter B VAlues:");
		int B=sc.nextInt();
		if(A>B)
		{
			System.out.println("A is Greater Number:"+ A);
		}
		else
		{
			System.out.println("B is Greater Number:"+ B);
		}
		sc.close();

	}

}
