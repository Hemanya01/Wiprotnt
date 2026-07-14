package list;
import java.util.ArrayList;
public class NumberList 
{
	public static void main(String[] args) 
	{
		 ArrayList<Number> list = new ArrayList<>();
	        list.add(10);        
	        list.add(25.5f);     
	        list.add(35.75);     
	        list.add(100L);      
	        list.add((short)5); 
	        list.add((byte)2);   
	        System.out.println("Numbers in ArrayList:");
	        for (Number n : list) 
	        {
	            System.out.println(n);
	        }
	}
}
