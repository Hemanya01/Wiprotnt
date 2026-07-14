package map;
import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) 
	{
        HashMap<String, String> map = new HashMap<>();
        map.put("471", "Hemanthi");
        map.put("472", "Puneeth");
        map.put("473", "Yashwanth");
        System.out.println("Key 472 Exists : " + map.containsKey("472"));
        System.out.println("Value Puneeth Exists : " + map.containsValue("Puneeth"));
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        System.out.println("\nUsing Iterator");
        while (itr.hasNext()) 
        {
            Map.Entry<String, String> entry = itr.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
