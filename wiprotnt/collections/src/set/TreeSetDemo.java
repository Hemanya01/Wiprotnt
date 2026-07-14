package set;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetDemo {
	public static void main(String[] args) 
	{
        TreeSet<String> ts = new TreeSet<>();
        ts.add("India");
        ts.add("Scotland");
        ts.add("Mexico");
        ts.add("Vietnam");
        System.out.println("Reverse Order:");
        System.out.println(ts.descendingSet());
        System.out.println("\nUsing Iterator:");
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) 
        {
            System.out.println(itr.next());
        }
        String country = "India";
        if (ts.contains(country))
            System.out.println("\n" + country + " Exists");
        else
            System.out.println("\nNot Found");
    }
}
