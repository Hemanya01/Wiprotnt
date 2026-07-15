package miniproject;
import java.util.*;

public class MiniProject4Main {
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        TreeMap<Character, ArrayList<MiniProject4Card>> map = new TreeMap<>();
        System.out.println("Enter Number of Cards:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            System.out.println("Enter card " + i + ":");
            char symbol = sc.next().charAt(0);
            int number = sc.nextInt();
            MiniProject4Card card = new MiniProject4Card(symbol, number);
            if (map.containsKey(symbol)) 
            {
                map.get(symbol).add(card);
            } 
            else 
            {
                ArrayList<MiniProject4Card> list = new ArrayList<>();
                list.add(card);
                map.put(symbol, list);
            }
        }
        System.out.println("Distinct Symbols are :");
        for (char ch : map.keySet()) 
        {
            System.out.print(ch + " ");
        }
        System.out.println();
        for (char ch : map.keySet()) 
        {
            ArrayList<MiniProject4Card> list = map.get(ch);
            System.out.println("Cards in " + ch + " Symbol");
            int sum = 0;
            for (MiniProject4Card c : list) 
            {
                System.out.println(c.getSymbol() + " " + c.getNumber());
                sum += c.getNumber();
            }
            System.out.println("Number of cards : " + list.size());
            System.out.println("Sum of Numbers : " + sum);
        }
        sc.close();
    }
}
