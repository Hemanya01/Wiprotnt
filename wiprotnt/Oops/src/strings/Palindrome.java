package strings;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        String rev = new StringBuffer(str).reverse().toString();
        if (str.equalsIgnoreCase(rev))
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
