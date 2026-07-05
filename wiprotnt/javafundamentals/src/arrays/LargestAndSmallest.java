package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class LargestAndSmallest {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Smallest Two Numbers:"+arr[0]+" "+arr[1]);
		System.out.println("Largest Two Numbers:"+arr[n-1]+" "+arr[n-2]);
		sc.close();
	}
}
