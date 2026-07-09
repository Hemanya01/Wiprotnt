package strings;
import java.util.Scanner;
public class RepeatLastN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
        String str = sc.next();
        System.out.println("Enter n value:");
        int n = sc.nextInt();
        String last = str.substring(str.length()-n);
        for(int i=0;i<n;i++)
        {
            System.out.print(last);
        }
        sc.close();
	}
}
