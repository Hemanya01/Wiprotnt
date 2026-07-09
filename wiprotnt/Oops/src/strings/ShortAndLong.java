package strings;
import java.util.Scanner;
public class ShortAndLong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
        String a = sc.next();
        System.out.println("Enter b:");
        String b = sc.next();
        if(a.length()<b.length())
        {
            System.out.println(a+b+a);
        }
        else
        {
            System.out.println(b+a+b);
        }
        sc.close();
	}
}
