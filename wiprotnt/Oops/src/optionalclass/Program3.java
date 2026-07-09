package optionalclass;
import java.util.Optional;
class InvalidEmployeeException extends RuntimeException{
    public InvalidEmployeeException(String message)
    {
        super(message);
    }
}
class Employee
{
    private int id;
    private String name;
    Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

public class Program3 {

	public static void main(String[] args) 
	{
		Employee emp = null;
        try 
        {
            Employee e = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Employee object is null"));

            e.display();
        } 
        catch (InvalidEmployeeException ex)
        {
            System.out.println(ex.getMessage());
        }
	}
}
