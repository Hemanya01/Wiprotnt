package dateTimeAPI;
import java.time.LocalDate;
import java.time.Period;

public class CalculatingExperience {
	public static void main(String[] args) 
	{
		LocalDate joiningDate = LocalDate.of(2022, 7, 15);
		LocalDate today = LocalDate.now();
		Period experience = Period.between(joiningDate, today);
        System.out.println("Experience in Wipro");
        System.out.println("Years  : " + experience.getYears());
        System.out.println("Months : " + experience.getMonths());
        System.out.println("Days   : " + experience.getDays());
	}
}
