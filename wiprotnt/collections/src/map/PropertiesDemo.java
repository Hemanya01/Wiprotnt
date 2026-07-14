package map;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
public class PropertiesDemo {
	public static void main(String[] args) 
	{
        Properties states = new Properties();
        states.put("Andhra Pradesh", "Amaravati");
        states.put("Telangana", "Hyderabad");
        states.put("Karnataka", "Bengaluru");
        states.put("Tamil Nadu", "Chennai");
        states.put("Kerala", "Thiruvananthapuram");
        Set set = states.entrySet();
        Iterator itr = set.iterator();
        System.out.println("States and Capitals");
        while (itr.hasNext()) 
        {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
