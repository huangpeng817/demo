package demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class MsecToDateTimeStrTest {

	private static String msecToDateTimeStr(String msecStr) {
		Long msecLong = Long.valueOf(msecStr);
		Date dat = new Date(msecLong);
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dat);
		SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm");
//		SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = format.format(gc.getTime());
		return str;
	}
	
	public static void main(String[] args) {
		String str1 = msecToDateTimeStr("1439604732000");
		System.out.println("1439604732000: " + str1);
//		String str1 = msecToDateTimeStr("1439604732000");
//		System.out.println("1439604732000: " + str1);
		String str2 = msecToDateTimeStr("1439568000000");
		System.out.println("1439568000000: " + str2);
	}
	
}
