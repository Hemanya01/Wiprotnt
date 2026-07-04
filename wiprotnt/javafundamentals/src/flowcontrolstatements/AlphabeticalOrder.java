package flowcontrolstatements;

import java.util.Scanner;

public class AlphabeticalOrder {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Character:");
		char ch1 = sc.next().charAt(0);
		System.out.println("Enter the second Character:");
		char ch2 = sc.next().charAt(0);
		if(ch1<ch2)
		{
			System.out.println(ch1+","+ch2);
		}
		else
		{
			System.out.println(ch2+","+ch1);
		}
	}

}
