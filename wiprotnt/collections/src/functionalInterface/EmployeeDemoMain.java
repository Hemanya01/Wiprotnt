package functionalInterface;
import java.util.*;
import java.util.function.Predicate;
public class EmployeeDemoMain 
{
	public static void main(String[] args) 
	{
        ArrayList<EmployeeDemo> employees = new ArrayList<>();
        employees.add(new EmployeeDemo(051, "Punneth", 9000));
        employees.add(new EmployeeDemo(052, " Datta Kiran", 12000));
        employees.add(new EmployeeDemo(053, "Bilvika", 8000));
        employees.add(new EmployeeDemo(054, "Hemanya", 15000));
        employees.add(new EmployeeDemo(055, "Deepthi", 7000));
        Predicate<EmployeeDemo> p = emp -> emp.getSalary() < 10000;
        for (EmployeeDemo e : employees) 
        {
            if (p.test(e)) 
            {
                System.out.println(e.getName());
            }
        }
	}
}
