package strings;
import java.util.Scanner;
public class ConcatenateTwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("First String: ");
        String s1 = sc.next();
        System.out.print("Second String: ");
        String s2 = sc.next();
        if(Character.toLowerCase(s1.charAt(s1.length()-1))
                == Character.toLowerCase(s2.charAt(0)))
        {
            System.out.println((s1 + s2.substring(1)).toLowerCase());
        }
        else
        {
            System.out.println((s1+s2).toLowerCase());
        }
        sc.close();
	}
}
