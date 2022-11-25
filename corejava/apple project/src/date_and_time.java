import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class date_and_time {
public static void main(String[] args) {
	
// before java8
	
	String date=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(Calendar.getInstance().getTime());
	System.out.println("current :" +date);
	Date date1=new Date(System.currentTimeMillis());
	System.out.println(date1);
	
//	after java8
	
	LocalDate localdate= LocalDate.now();	System.out.println(localdate);
	LocalDateTime tm=LocalDateTime.now();
	System.out.println(tm);
	LocalDate t=LocalDate.now();
	System.out.println(t);
}
}
