package flowcontrolstatements;

import java.util.Scanner;

public class FloydsFormat {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		if(!sc.hasNextInt())
		{
			System.out.println("Please enter an integer number");
			return;
		}
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
