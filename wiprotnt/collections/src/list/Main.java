package list;
import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;
public class Main 
{
	public static void main(String[] args) 
	{
		Vector<Employee> v = new Vector<Employee>();
        v.add(new Employee(111, "Hemanya", "hemanya@gmail.com", "Female", 100000));
        v.add(new Employee(112, "HimeshRam", "himeshram@gmail.com", "Male", 95000));
        v.add(new Employee(113, "Gowri", "gowri@gmail.com", "Female", 55000));
        System.out.println("Using Iterator");
        Iterator<Employee> itr = v.iterator();
        while (itr.hasNext()) 
        {
            Employee e = itr.next();
            e.getEmployeeDetails();
        }
        System.out.println("Using Enumeration");
        Enumeration<Employee> en = v.elements();
        while (en.hasMoreElements()) {
            Employee e = en.nextElement();
            e.getEmployeeDetails();
        }

	}

}
