package functionalInterface;
import java.util.*;
import java.util.function.Consumer;
public class ConsumerMethod {
	 public static void main(String[] args) 
	 {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(2);
	        numbers.add(5);
	        numbers.add(8);
	        numbers.add(11);
	        numbers.add(14);
	        numbers.add(19);
	        numbers.add(20);
	        numbers.add(25);
	        numbers.add(30);
	        numbers.add(41);
	        Consumer<Integer> checkNumber = num -> 
	        {
	            if (num % 2 == 0)
	                System.out.println(num + " even");
	            else
	                System.out.println(num + " odd");
	        };
	        for (Integer num : numbers) 
	        {
	            checkNumber.accept(num);
	        }
	 }
}
