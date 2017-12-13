package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {
public static void main(String[] args) {
	Date todayDate=new Date();
	
	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
	String yyyyMMddDate = sdf.format(todayDate);
	System.out.println("yyyyMMdd  :: "+yyyyMMddDate);
	
	sdf=new SimpleDateFormat("MMddyyyy");
	String MMddyyyyDate = sdf.format(todayDate);
	System.out.println("MMddyyyy  :: "+MMddyyyyDate);
	
	sdf=new SimpleDateFormat("dd-MM-yyyy");
	String dd_MM_yyyyDate = sdf.format(todayDate);
	System.out.println("dd-MM-yyyy  :: "+dd_MM_yyyyDate);
	
	sdf=new SimpleDateFormat("dd-MMM-yyyy");
	String dd_MMM_yyyyDate = sdf.format(todayDate);
	System.out.println("dd-MMM-yyyy  :: "+dd_MMM_yyyyDate);
	
	sdf=new SimpleDateFormat("dd-MMMM-yyyy");
	String dd_MMMM_yyyyDate = sdf.format(todayDate);
	System.out.println("dd-MMMM-yyyy  :: "+dd_MMMM_yyyyDate);
	
	
	String dateStr=new String("02-February-2014");
	try {
		Date date = sdf.parse(dateStr);
		System.out.println(date);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
}
}
