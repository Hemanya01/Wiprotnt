package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MaxAndMin {
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
		Arrays.sort(arr);
		int max=arr[n-1];
		int min=arr[0];
		System.out.println("Minimum="+min);
		System.out.println("Maximum="+max);
		sc.close();
	}

}
