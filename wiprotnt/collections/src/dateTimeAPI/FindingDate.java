package dateTimeAPI;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
public class FindingDate {
	public static void main(String[] args) 
	{
		LocalDate today = LocalDate.now();
		LocalDate nextMonth = today.plusMonths(1).withDayOfMonth(1);
		LocalDate firstSunday = nextMonth.with(
                TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		 LocalDate secondSunday = firstSunday.plusWeeks(1);

	        System.out.println("Second Sunday of Next Month : " + secondSunday);
	}
}
