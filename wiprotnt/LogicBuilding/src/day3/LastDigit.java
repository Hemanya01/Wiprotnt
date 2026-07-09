package day3;
import java.util.Scanner;
public class LastDigit {
	public static int lastDigit(int n)
	{
		n=n%10;
		return Math.abs(n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value:");
		int n = sc.nextInt();
		System.out.println(lastDigit(n));
		sc.close();
	}

}
