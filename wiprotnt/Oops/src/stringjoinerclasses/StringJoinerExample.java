package stringjoinerclasses;
import java.util.Scanner;
import java.util.StringJoiner;
public class StringJoinerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StringJoiner s1 = new StringJoiner("-");
        StringJoiner s2 = new StringJoiner("-");
        System.out.print("Enter number of cities for s1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter cities:");
        for (int i=0;i<n1;i++) 
        {
            s1.add(sc.next());
        }
        System.out.print("Enter number of cities for s2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter cities:");
        for (int i=0;i<n2;i++) 
        {
            s2.add(sc.next());
        }
        StringJoiner first = new StringJoiner("-");
        first.merge(s1);
        first.merge(s2);
        StringJoiner second = new StringJoiner("-");
        second.merge(s2);
        second.merge(s1);
        System.out.println("s1 merged to s2 : " + first);
        System.out.println("s2 merged to s1 : " + second);
        sc.close();
	}
}
