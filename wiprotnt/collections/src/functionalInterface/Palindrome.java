package functionalInterface;
import java.util.*;
import java.util.function.Predicate;
public class Palindrome {
	public static void main(String[] args) 
	{
        ArrayList<String> words = new ArrayList<>();
        words.add("madam");
        words.add("wipro");
        words.add("level");
        words.add("hemanya");
        words.add("radar");
        words.add("training");
        words.add("noon");
        words.add("welcome");
        words.add("malayalam");
        words.add("number");
        Predicate<String> palindrome = word -> 
        {
            String reverse = new StringBuilder(word).reverse().toString();
            return word.equalsIgnoreCase(reverse);
        };
        System.out.println("Palindrome Words:");
        for (String word : words) 
        {
            if (palindrome.test(word)) 
            {
                System.out.println(word);
            }
        }
    }
}
