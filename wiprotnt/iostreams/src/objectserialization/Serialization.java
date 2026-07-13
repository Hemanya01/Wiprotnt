package objectserialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
public class Serialization {
	public static void main(String[] args) 
	{
        Employee emp = new Employee(
                "Hemanya",
                new Date(),
                "IT",
                "Software Engineer",
                100000.0);
        try 
        {
            FileOutputStream fos = new FileOutputStream("data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.close();
            fos.close();
            System.out.println("Object Serialized Successfully.");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
