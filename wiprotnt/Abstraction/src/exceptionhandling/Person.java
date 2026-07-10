package exceptionhandling;

public class Person {
	public static void main(String[] args) 
	{
        try 
        {
            if (args.length != 2) 
            {
                throw new AgeException("Please enter Name and Age.");
            }
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            if (age < 18 || age >= 60) 
            {
                throw new AgeException(
                        "Age should be greater than or equal to 18 and less than 60.");
            }
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Registration Successful");
        }
        catch (NumberFormatException e) 
        {
            System.out.println("Age must be an integer.");
        }
        catch (AgeException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
