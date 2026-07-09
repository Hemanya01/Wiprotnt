package day3;
import java.lang.Math;
import java.util.Scanner;
public class SumOfDigit {
	public static int digitSum(int a, int b)
	{
		a=Math.abs(a);
		b=Math.abs(b);
		int last1=a%10;
		int last2=b%10;
		return last1+last2;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value:");
		int a=sc.nextInt();
		System.out.println("Enter b Value:");
		int b=sc.nextInt();
		System.out.println(digitSum(a,b));
		sc.close();
	}
}
