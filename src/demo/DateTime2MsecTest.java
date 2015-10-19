package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateTime2MsecTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		String str = "2015-08-15 10:12"; // 1439604732000   本值：1439604720000
//		String str = "2015-08-15 11:00"; //               本值：1439607600000
//		String str = "2015-08-15 11:58"; //               本值：1439611080000
		
//		String str = "2015-08-15 12:00"; // 1439568000000   本值：1439568000000
//		String str = "2015-08-15 12:01"; //  			     本值：1439568060000
//		String str = "2015-08-15 13:00"; //  			     本值：1439614800000
//		String str = "2015-08-15 23:58"; //  			     本值：1439654280000
		String str = "2015-08-15 24:00"; //  			     本值：1439654400000
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");

		long millionSeconds = sdf.parse(str).getTime();// 毫秒

		System.out.println(millionSeconds);
	}

}
