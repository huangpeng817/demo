package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class DateFormatUtils {
	
	public static void main(String[] args) {
//		String str = "2015-08-15 10:12"; // 1439604732000   本值：1439604720000
//		String str = "2015-08-15 11:00"; //               本值：1439607600000 --
//		String str = "2015-08-15 11:58"; //               本值：1439611080000
		
//		String str = "2015-08-15 12:00"; // 1439568000000   本值：1439568000000 --
//		String str = "2015-08-15 12:01"; //  			     本值：1439568060000
//		String str = "2015-08-15 13:00"; //  			     本值：1439614800000
//		String str = "2015-08-15 23:58"; //  			     本值：1439654280000
//		String str = "2015-08-15 24:00"; //  			     本值：1439654400000
		
		
//		String str = StrToDate("2015-08-15 10:12"); // 1439604720000
		
		// *************************************************************
		// *************************************************************
		// *************************************************************
		/**
		 * 正确的转换，目前数据库中的毫秒数有些事脏数据，这个转换的算法是比较权威的
		 */
		// *************************************************************
		// *************************************************************
		// *************************************************************
		
		String str = StrToDate("2015-08-15 04:55:12"); // 1439585700000
		
//		String str = StrToDate("2015-08-15 11:00"); // 1439607600000
//		String str = StrToDate("2015-08-15 12:00"); // 1439611200000 -------------------------------------
//		String str = StrToDate("2015-08-15 12:01"); // 1439611260000
		System.out.println(str);

		
//		String str1 = msecToDateTimeStr("1439568000000"); // 
//		System.out.println(str1);
		
//		String str1 = DateToStr(new Date());
//		System.out.println(str1);
	}
	
	private static String msecToDateTimeStr(String msecStr) {
		Long msecLong = Long.valueOf(msecStr);
		Date dat = new Date(msecLong);
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dat);
		SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm");
		String str = format.format(gc.getTime());
		return str;
	}
	
	
	/**
	* 日期转换成字符串
	* @param date 
	* @return str
	*/
	public static String DateToStr(Date date) {
	  
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	   String str = format.format(date);
	   return str;
	} 

	/**
	* 字符串转换成日期毫秒数
	* @param str
	* @return String
	*/
	public static String StrToDate(String str) {
	  
	   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	   Date date = null;
	   try {
	    date = format.parse(str);
	   } catch (ParseException e) {
	    e.printStackTrace();
	   }
	   return ""+date.getTime();
	}

}
