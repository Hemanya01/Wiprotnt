package arrays;

import java.util.Scanner;

public class SumOfElements {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		boolean skip=false;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==6)
			{
				skip=true;
			} 
			if(!skip)
			{
				sum+=arr[i];
			}
			if(skip && arr[i]==7)
			{
				skip=false;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
