package miniproject;
import java.io.*;
import java.util.*;
public class EmployeeManagement {
	static Scanner sc = new Scanner(System.in);
    static String fileName = "employee.dat";
    public static void main(String[] args) 
    {
        while (true) 
        {
            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) 
            {
            case 1:
            	addEmployee();
                break;
            case 2:
                displayEmployees();
                break;
            case 3:
                System.out.println("Exiting the System");
                System.exit(0);
            default:
                System.out.println("Invalid Choice");
            }
        }
    }
    static void addEmployee() 
    {
        try 
        {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();
            Employee emp = new Employee(id, name, age, salary);
            FileOutputStream fos = new FileOutputStream(fileName, true);
            ObjectOutputStream oos;
            File file = new File(fileName);
            if (file.length() == 0) 
            {
                oos = new ObjectOutputStream(fos);
            } 
            else 
            {
                oos = new AppendableObjectOutputStream(fos);
            }
            oos.writeObject(emp);
            oos.close();
            fos.close();
            System.out.println("Employee Added Successfully.");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    static void displayEmployees() 
    {
        try 
        {
            File file = new File(fileName);
            if (!file.exists()) 
            {
                System.out.println("No Records Found.");
                return;
            }
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println("\n-----Report-----");
            while (true) 
            {
                Employee emp = (Employee) ois.readObject();
                System.out.println(emp);
            }
        } 
        catch (EOFException e) 
        {
            System.out.println("-----End of Report-----");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
class AppendableObjectOutputStream extends ObjectOutputStream {

    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
    protected void writeStreamHeader() throws IOException {

    }
}


