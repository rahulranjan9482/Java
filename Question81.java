// Q:- Write a java program to display the current date and time in a specific format.
 import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Question81 {

	public static void main(String args[]) {
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
	}
}
