package methodreference;
import java.util.Scanner;
public class PrimeNumberMain {
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        PrimeCheck obj = PrimeNumber::new;
	        obj.check(num);
	        sc.close();
    }
}
