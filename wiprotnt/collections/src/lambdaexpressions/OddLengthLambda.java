package lambdaexpressions;
import java.util.ArrayList;
public class OddLengthLambda {
	public static void main(String[] args) 
	{
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Dragon");
        a1.add("Star Fruit");
        a1.add("Orange");
        a1.add("Mango");
        a1.add("Grapes");
        a1.add("Pineapple");
        a1.add("Cherry");
        a1.add("Papaya");
        a1.add("Kiwi");
        a1.add("Guava");
        System.out.println("Words with Odd Length:");
        a1.forEach(word -> 
        {
            if (word.length() % 2 != 0)
                System.out.println(word);
        });
    }
}
