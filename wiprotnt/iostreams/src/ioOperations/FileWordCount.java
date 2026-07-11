package ioOperations;
import java.io.*;
import java.util.*;
public class FileWordCount {
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input file name: ");
        String inputFile = sc.nextLine();
        System.out.print("Enter the output file name: ");
        String outputFile = sc.nextLine();
        TreeMap<String, Integer> map = new TreeMap<>();
        try 
        {
            Scanner file = new Scanner(new File(inputFile));
            while (file.hasNext()) 
            {
                String word = file.next();
                word = word.replaceAll("[^a-zA-Z]", "");
                if (!word.isEmpty()) 
                {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
            }
            file.close();
            PrintWriter writer = new PrintWriter(new FileWriter(outputFile));
            for (Map.Entry<String, Integer> entry : map.entrySet()) 
            {
                writer.println(entry.getKey() + " : " + entry.getValue());
            }
            writer.close();
            System.out.println("Word count written to " + outputFile);
        } 
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
