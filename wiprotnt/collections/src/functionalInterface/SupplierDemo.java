package functionalInterface;
import java.util.*;
import java.util.function.Supplier;
public class SupplierDemo {
	 public static void main(String[] args) 
	 {
	        Supplier<ArrayList<Integer>> supplier = () -> 
	        {
	            ArrayList<Integer> primes = new ArrayList<>();
	            int number = 2;
	            while (primes.size() < 10) 
	            {
	                boolean isPrime = true;
	                for (int i = 2; i <= Math.sqrt(number); i++) 
	                {
	                    if (number % i == 0) 
	                    {
	                        isPrime = false;
	                        break;
	                    }
	                }
	                if (isPrime) 
	                {
	                    primes.add(number);
	                }
	                number++;
	            }
	            return primes;
	        };
	        ArrayList<Integer> primeNumbers = supplier.get();
	        System.out.println("First 10 Prime Numbers:");
	        System.out.println(primeNumbers);
	    }
}
