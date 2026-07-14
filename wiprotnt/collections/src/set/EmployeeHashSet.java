package set;
import java.util.HashSet;
import java.util.Iterator;
public class EmployeeHashSet {
	public static void main(String[] args) 
	{
        HashSet<String> employees = new HashSet<>();
        employees.add("Hemanya");
        employees.add("Gowri");
        employees.add("Madhu");
        employees.add("Hemanthi");
        System.out.println("Employee Names:");
        Iterator<String> itr = employees.iterator();
        while (itr.hasNext()) 
        {
            System.out.println(itr.next());
        }
    }
}
