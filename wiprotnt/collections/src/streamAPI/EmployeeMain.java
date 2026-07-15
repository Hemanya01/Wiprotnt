package streamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class EmployeeMain {
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        System.out.println("Enter details of 5 Employees");
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("\nEmployee " + i);
            System.out.print("Employee Number: ");
            int empNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Location: ");
            String location = sc.nextLine();
            employees.add(new Employee(empNo, name, age, location));
        }
        List<Employee> puneEmployees = employees.stream()
                .filter(emp -> emp.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());
        System.out.println("\nEmployees from Pune:");
        puneEmployees.forEach(System.out::println);
        sc.close();
    }
}
