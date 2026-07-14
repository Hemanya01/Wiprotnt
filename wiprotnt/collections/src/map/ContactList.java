package map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class ContactList 
{
    HashMap<String, Long> contacts = new HashMap<>();
    public void addContact(String name, Long number) 
    {
        contacts.put(name, number);
    }
    public void checkKey(String name) 
    {
        if (contacts.containsKey(name))
            System.out.println(name + " exists.");
        else
            System.out.println(name + " does not exist.");
    }
    public void checkValue(Long number) 
    {
        if (contacts.containsValue(number))
            System.out.println(number + " exists.");
        else
            System.out.println(number + " does not exist.");
    }
    public void displayContacts() 
    {
        Iterator<Map.Entry<String, Long>> itr = contacts.entrySet().iterator();
        System.out.println("\nContact List");
        while (itr.hasNext()) 
        {
            Map.Entry<String, Long> entry = itr.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public static void main(String[] args) 
    {
        ContactList obj = new ContactList();
        obj.addContact("SrinivasaRao", 7959832199L);
        obj.addContact("Manoj", 9087753610L);
        obj.addContact("Navya", 8989556623L);
        obj.checkKey("Manoj");
        obj.checkKey("Navya");
        obj.checkValue(9087753610L);
        obj.checkValue(9000000000L);
        obj.displayContacts();
    }
}