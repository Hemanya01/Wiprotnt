package day3;
import java.util.Scanner;
public class IsEven {
	public static int isEven(int n)
	{
		if(n%2==0)
			return 2;
		else
			return 1;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Value:");
		int n=sc.nextInt();
		System.out.println(isEven(n));
		sc.close();
	}

}
