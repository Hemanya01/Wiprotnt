package flowcontrolstatements;
import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		if(n<=1)
		{
			System.out.println("Not Prime");
		}
		else 
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println("Prime");
			else
				System.out.println("Not Prime");
		}
	}

}
