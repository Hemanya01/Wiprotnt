package miniproject;
import java.util.Comparator;
public class EmployeeComparatorDemo implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) 
	{
        return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
    }
}
