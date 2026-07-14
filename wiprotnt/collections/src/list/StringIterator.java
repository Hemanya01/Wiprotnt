package list;
import java.util.ArrayList;
import java.util.Iterator;
public class StringIterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("JavaScript");
        printAll(list);
    }
    public static void printAll(ArrayList<String> list) 
    {
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) 
        {
            System.out.println(itr.next());
        }
	}
}
