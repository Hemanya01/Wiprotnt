package arrays;

import java.util.Scanner;

public class NumberChecking {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the Array Elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Key to Search:");
		int k=sc.nextInt();
		int index=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==k)
			{
				index=i;
				break;
			}
		}
		System.out.println(index);
		sc.close();
	}

}
