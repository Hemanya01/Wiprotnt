package optionalclass;
import java.util.Optional;
public class Program1 {

	public static void main(String[] args) {
		String names[] = new String[5];
        Optional<String> val = Optional.ofNullable(names[0]);
        if (val.isPresent())
        {
            System.out.println(val.get().length());
        } 
        else 
        {
            System.out.println("Value is null");
        }
	}

}
