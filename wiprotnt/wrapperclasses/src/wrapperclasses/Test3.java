package wrapperclasses;
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-255): ");
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        binary = String.format("%8s", binary).replace(' ', '0');
        System.out.println("Binary Representation: " + binary);
        sc.close();
	}
}
