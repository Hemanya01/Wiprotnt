package functionalInterface;
import java.util.*;
import java.util.function.Function;
class Employee {
    int id;
    String name;
    String location;
    double salary;
    Employee(int id, String name, String location, double salary) 
    {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}
public class EmployeeMain {
	public static void main(String[] args) 
	{
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(471, "Hemanya", "Mysore", 100000));
        employees.add(new Employee(472, "Hemanthi", "Pune", 60000));
        employees.add(new Employee(473, "Navya", "Bangalore", 70000));
        employees.add(new Employee(474, "Shruthi", "Chennai", 55000));
        employees.add(new Employee(475, "Sujitha", "Mumbai", 65000));
        Function<Employee, String> getLocation = emp -> emp.location;
        ArrayList<String> locations = new ArrayList<>();
        for (Employee e : employees) 
        {
            locations.add(getLocation.apply(e));
        }
        System.out.println("Employee Locations:");
        System.out.println(locations);
    }
}
