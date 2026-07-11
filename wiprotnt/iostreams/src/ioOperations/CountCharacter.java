package ioOperations;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CountCharacter {
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();
        System.out.print("Enter the character to be counted: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));
        int count = 0;
        try 
        {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNextLine()) 
            {
                String line = file.nextLine().toLowerCase();
                for (int i = 0; i < line.length(); i++) 
                {
                    if (line.charAt(i) == ch) 
                    {
                        count++;
                    }
                }
            }
            file.close();
            System.out.println("File '" + fileName + "' has " + count +
                    " instances of letter '" + ch + "'.");
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found.");
        }
        sc.close();
    }
}
