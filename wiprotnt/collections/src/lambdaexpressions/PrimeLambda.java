package lambdaexpressions;
import java.util.ArrayList;
import java.util.Random;
public class PrimeLambda {
	public static void main(String[] args) 
	{
        ArrayList<Integer> a1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 25; i++) 
        {
            a1.add(random.nextInt(100) + 1);
        }
        System.out.println("All Numbers:");
        System.out.println(a1);
        System.out.println("Prime Numbers:");
        a1.forEach(num -> 
        {
            if (isPrime(num))
                System.out.print(num + " ");
        });
    }
    public static boolean isPrime(int n) 
    {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) 
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
