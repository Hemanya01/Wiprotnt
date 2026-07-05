package arrays;

import java.util.Scanner;

public class PrintingCharacters {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the Ascii Values:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Characters:");
		for(int i=0;i<n;i++)
		{
			System.out.println((char) arr[i]+" ");
		}
		sc.close();
	}

}
