package streamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class NegativeEvenNumbers {
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            list.add(sc.nextInt());
        }
        List<Integer> result = list.stream()
                .filter(num -> num < 0 && num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Negative Even Numbers:");
        result.forEach(System.out::println);
        sc.close();
    }
}
