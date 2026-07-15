package miniproject;
import java.util.*;
public class MiniProject3Main {
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Character, MiniProject3Card> map = new LinkedHashMap<>();
        int count = 0;
        while (map.size() < 4) 
        {
            System.out.println("Enter a card :");
            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();
            count++;
            if (!map.containsKey(symbol)) 
            {
                map.put(symbol, new MiniProject3Card(symbol, number));
            }
        }
        System.out.println("Four symbols gathered in " + count + " cards.");
        System.out.println("Cards in Set are :");
        TreeMap<Character, MiniProject3Card> sorted = new TreeMap<>(map);
        for (MiniProject3Card c : sorted.values()) 
        {
            System.out.println(c.getSymbol() + " " + c.getNumber());
        }
        sc.close();
    }
}
