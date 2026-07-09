package strings;
import java.util.Scanner;
public class Repeation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        String first = str.substring(0,2);
        for(int i=0;i<str.length();i++)
        {
            System.out.print(first);
        }
        sc.close();
	}
}
