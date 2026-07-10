package exceptionhandling;
import java.util.Scanner;
public class UserRegistration {
	public void registerUser(String username, String userCountry)
            throws InvalidCountryException 
	{
        if (!userCountry.equalsIgnoreCase("India")) 
        {
            throw new InvalidCountryException(
                    "User Outside India cannot be registered");
        } 
        else 
        {
            System.out.println("User registration done successfully");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username:");
        String username = sc.nextLine();
        System.out.println("Enter Country:");
        String country = sc.nextLine();
        UserRegistration user = new UserRegistration();
        try 
        {
            user.registerUser(username, country);
        } 
        catch (InvalidCountryException e) 
        {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
