package functionalInterface;
import java.util.*;
import java.util.function.Consumer;
public class ReverseWord {
	public static void main(String[] args) 
	{
        ArrayList<String> words = new ArrayList<>();
        words.add("Wipro");
        words.add("Java");
        words.add("Training");
        words.add("Online");
        words.add("Portal");
        words.add("Career");
        words.add("Deployment");
        words.add("Hacking");
        words.add("Communication");
        words.add("Development");
        Consumer<ArrayList<String>> reverseWords = list -> 
        {
            for (int i = 0; i < list.size(); i++) 
            {
                String reverse = new StringBuilder(list.get(i)).reverse().toString();
                list.set(i, reverse);
            }
        };
        reverseWords.accept(words);
        System.out.println("Updated ArrayList:");
        System.out.println(words);
    }
}
