package demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test1 {
	public static void main(String[] args) {
//		long sd = 1438358400000L;
////		long sd = 1345185923140L;
//		Date dat = new Date(sd);
//		GregorianCalendar gc = new GregorianCalendar();
//		gc.setTime(dat);
//		SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//		String sb = format.format(gc.getTime());
//		System.out.println(sb);
		
		Test1 test1 = new Test1();
//		String dt = test1.msecToDateTimeStr("1434514332000"); // 2015-06-17 12:12
//		String dt = test1.msecToDateTimeStr("1437102732000"); // 2015-07-17 11:12
//		String dt = test1.msecToDateTimeStr("1437534732000"); // 2015-07-22 11:12
//		String dt = test1.msecToDateTimeStr("1439618112000"); // 2015-08-15 01:55
//		String dt = test1.msecToDateTimeStr("1439625312000"); // 2015-08-15 03:55
//		String dt = test1.msecToDateTimeStr("1439628912000"); // 2015-08-15 04:55 --
//		String dt = test1.msecToDateTimeStr("1439597532000"); // 2015-08-15 08:12
//		String dt = test1.msecToDateTimeStr("1439601132000"); // 2015-08-15 09:12
//		String dt = test1.msecToDateTimeStr("1439604732000"); // 2015-08-15 10:12 --
//		String dt = test1.msecToDateTimeStr("1439568000000"); // 2015-08-15 12:00 --
		String dt = test1.msecToDateTimeStr("1440213132000"); // 2015-08-22 11:12

		System.out.println(dt);
		System.out.println("毫秒数字符串比较：1439568000000 > 1439628912000 ? " + "1439568000000".compareTo("1439628912000"));

	}
	
	public String msecToDateTimeStr(String msecStr) {
		Long msecLong = Long.valueOf(msecStr);
		Date dat = new Date(msecLong);
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dat);
		SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm");
//		SimpleDateFormat format = new java.text.SimpleDateFormat("dd MM yyyy - HH:ii p");
//		SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = format.format(gc.getTime());
		return str;
	}
}
