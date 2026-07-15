package functionalInterface;
import java.util.*;
import java.util.function.Predicate;
public class PerfectSquare {
	public static void main(String[] args) 
	{
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(15);
        numbers.add(16);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        Predicate<Integer> perfectSquare = n -> 
        {
            int root = (int) Math.sqrt(n);
            return root * root == n;
        };
        System.out.println("Perfect Square Numbers:");
        for (Integer num : numbers) 
        {
            if (perfectSquare.test(num)) 
            {
                System.out.println(num);
            }
        }
	}
}
