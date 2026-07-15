package miniproject;
import java.util.*;
public class MiniProject5Main {
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<MiniProject5Box> set = new LinkedHashSet<>();
        System.out.println("Enter the number of Box");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            System.out.println("Enter the Box " + i + " details");
            System.out.println("Enter Length");
            double length = sc.nextDouble();
            System.out.println("Enter Width");
            double width = sc.nextDouble();
            System.out.println("Enter Height");
            double height = sc.nextDouble();
            set.add(new MiniProject5Box(length, width, height));
        }
        System.out.println("Unique Boxes in the Set are");
        for (MiniProject5Box b : set) 
        {
            System.out.printf(
                "Length =%.1f Width =%.1f Height =%.1f Volume =%.2f%n",
                b.getLength(),
                b.getWidth(),
                b.getHeight(),
                b.getVolume());
        }
        sc.close();
    }
}
