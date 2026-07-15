package methodreference;
import java.util.Scanner;
public class DigitCountMain {
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number: ");
		 int num = sc.nextInt();
		 DigitInterface di = DigitCount::digitCount;
	        int result = di.countDigits(num);
	        System.out.println("Number of digits = " + result);
	        sc.close();
    }
}
