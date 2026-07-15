package lambdaexpressions;
import java.util.ArrayList;
public class ReverseWordsLambda {
	public static void main(String[] args) 
	{
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Strawberry");
        a1.add("Dragon");
        a1.add("Custard Apple");
        a1.add("Mango");
        a1.add("Grapes");
        a1.add("Pineapple");
        a1.add("Cherry");
        a1.add("Papaya");
        a1.add("Kiwi");
        a1.add("Guava");
        System.out.println("Reverse Order:");
        for (int i = a1.size() - 1; i >= 0; i--) 
        {
            int index = i;
            Runnable r = () -> System.out.println(a1.get(index));
            r.run();
        }
    }
}
