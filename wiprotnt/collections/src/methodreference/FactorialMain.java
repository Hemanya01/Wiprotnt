package methodreference;
import java.util.Scanner;
public class FactorialMain 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        Factorial obj = new Factorial();
	        FactorialInterface fi = obj::factorial;
	        int result = fi.findFactorial(num);
	        System.out.println("Factorial = " + result);
	        sc.close();
	}
}
