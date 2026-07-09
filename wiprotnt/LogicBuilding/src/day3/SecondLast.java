package day3;
import  java.lang.Math;
import java.util.Scanner;
public class SecondLast {
	public static int secondLast(int n)
	{
		n=Math.abs(n);
		if(n<10)
			return -1;
		else
			return n=(n%100)/10;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value:");
		int n=sc.nextInt();
		System.out.println(secondLast(n));
		sc.close();
	}

}
