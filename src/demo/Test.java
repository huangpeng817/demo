package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		String dateStr1 = "2015-07-11";
		String dateStr2 = "2015-08-01";
//		String dateStr1 = "2015-07-11 10:10:10";
//		String dateStr2 = "2015-08-01 10:10:10";
		Test test = new Test();
//		System.out.println("1形式为："+StrToDate(dateStr1));
//		System.out.println("2形式为："+StrToDate(dateStr2));
		System.out.println("8月15号："+StrToDate("2015-06-01 12:00:00"));
		System.out.println("8月1号："+StrToDate("2015-08-01 12:12:12"));
		System.out.println("8月31号："+StrToDate("2015-08-31 12:12:12"));
//		try {
//			System.out.println("长整型1形式为："+test.dateToLong(dateStr1));
//			System.out.println("长整型2形式为："+test.dateToLong(dateStr2));
//			System.out.println("字符串1形式为："+test.dateToString(dateStr1));
//			System.out.println("字符串2形式为："+test.dateToString(dateStr2));
//			
//		} catch (ParseException e) {
//			throw new RuntimeException(e);
//		}
	}

	public long dateToLong(String in) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		// SimpleDateFormat format = new SimpleDateFormat("y/M/d H:m:s");
//		Date date = format.parse(in);
//		
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(date);
		return format.parse(in).getTime();
	}
	public String dateToString(String in) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date = format.parse(in);

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return Long.toString(cal.getTimeInMillis());
	}
	
	/**
	* 日期转换成字符串
	* @param date 
	* @return str
	*/
	public static String DateToStr(Date date) {
	  
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   String str = format.format(date);
	   return str;
	} 
	
	/**
	* 字符串转换成日期毫秒数
	* @param str
	* @return String
	*/
	public static String StrToDate(String str) {
	  
//	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   Date date = null;
	   try {
	    date = format.parse(str);
	   } catch (ParseException e) {
	    e.printStackTrace();
	   }
	   return ""+date.getTime();
	}
	
	
//	public long dateToLong(String in) throws ParseException {
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
//		// SimpleDateFormat format = new SimpleDateFormat("y/M/d H:m:s");
//		Date date = format.parse(in);
//		
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(date);
//		return cal.getTimeInMillis();
//	}
}
