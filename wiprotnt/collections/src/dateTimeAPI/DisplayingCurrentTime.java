package dateTimeAPI;
import java.time.LocalTime;

public class DisplayingCurrentTime {
	public static void main(String[] args) 
	{
        LocalTime currentTime = LocalTime.now();
        LocalTime beforeTime = currentTime.minusHours(5).minusMinutes(30);
        System.out.println("Current Time : " + currentTime);
        System.out.println("Time Before 5 Hours 30 Minutes : " + beforeTime);
    }
}
