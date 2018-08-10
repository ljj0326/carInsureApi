package com.songzhi.carInsure.core.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateUtils {
	/** yyyy-MM-dd */
	public static final String DATE_FMT = "yyyy-MM-dd";
	/** yyyy-MM-dd HH:mm:ss */
	public static final String DATETIME_FMT = "yyyy-MM-dd HH:mm:ss";
	/** HH:mm:ss */
	public static final String TIME_FMT = "HH:mm:ss";
	/** yyyyMMdd */
	public static final String DATE_TPT_TWO="yyyyMMdd";
	/** 一天的毫秒数 */
	public static final long DAY_MS = 24 * 60 * 60 * 1000;
	
	/**
	 * yyyyMMddhhmmss
	 */
	public static final String DATE_TIME_FULL ="yyyyMMddhhmmss";
	/**
	 * yyyyMMddHHmmss
	 */
	public static final String DATE_TIME_FULL_24 ="yyyyMMddHHmmss";

	public DateUtils() {
		super();
	}

	/**
	 * <p>
	 * 格式化日期字符串
	 * </P>
	 * 
	 * @param date
	 *            日期字符串
	 * @param format
	 *            格式化串
	 * @return
	 */
	public static Date parse(String date, String format)
			throws IllegalArgumentException {
		if (StringUtils.isBlank(date)) {
			return null;
		}

		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	/**
	 * String 转换为 Timestamp
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static Timestamp parseTimestamp(String date, String format)
			throws IllegalArgumentException {
		Date d = parse(date, format);
		if (d == null) {
			return null;
		}
		return new Timestamp(d.getTime());
	}

	/**
	 * <P>
	 * 格式化日期
	 * </P>
	 * 
	 * @param date
	 *            日期
	 * @param format
	 *            格式化串
	 * @return
	 */
	public static String format(Date date, String format) {
		if (date == null) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	/**
	 * Timestamp转换为String
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String format(Timestamp date, String format) {
		if (date == null) {
			return null;
		}

		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	/**
	 * 转换Date到Calendar
	 * 
	 * @param date
	 * @return
	 */
	public static Calendar toCalendar(Date date) {
		if (date == null) {
			return null;
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

	/**
	 * 
	 * @param c
	 * @return
	 */
	public static Date toDate(Calendar c) {
		if (c == null) {
			return null;
		}
		Date date = new Date();
		date.setTime(c.getTimeInMillis());
		return date;
	}

	/**
	 * 日期比较(比较到毫秒）
	 * 
	 * @param d1
	 * @param d2
	 * @return d1等于d2返回0，d1小于d2返回小于0的值，d1大于d2返回大于0的值
	 */
	public static int compare(Date d1, Date d2) {
		return d1.compareTo(d2);
	}

	/**
	 * 日期比较(比较到毫秒）
	 * 
	 * @param d1
	 * @param d2
	 * @return cal1等于cal2返回0，cal1小于cal2返回小于0的值，cal1大于cal2返回大于0的值
	 */
	public static int compare(Calendar cal1, Calendar cal2) {
		return cal1.compareTo(cal2);
	}

	/**
	 * 日期比较(比较到日期）
	 * 
	 * @param d1
	 * @param d2
	 * @return d1等于d2返回0，d1小于d2返回小于0的值，d1大于d2返回大于0的值
	 */
	public static int compareDay(Date d1, Date d2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d1);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		return compareDay(cal1, cal2);
	}

	/**
	 * 日期比较(比较到日期）
	 * 
	 * @param cal1
	 * @param cal2
	 * @return cal1等于cal2返回0，cal1小于cal2返回小于0的值，cal1大于cal2返回大于0的值
	 */
	public static int compareDay(Calendar cal1, Calendar cal2) {
		DateFormat df = new SimpleDateFormat(DATE_FMT);
		Date d1 = null;
		try {
			d1 = df.parse(df.format(cal1.getTime()));
		} catch (ParseException e) {

		}
		Date d2 = null;
		try {
			d2 = df.parse(df.format(cal2.getTime()));
		} catch (ParseException e) {

		}
		return d1.compareTo(d2);
	}

	public static Date addYears(Date date, int years) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return addYears(cal, years).getTime();
	}

	public static Calendar addYears(Calendar cal, int years) {
		//不能直接使用cal,不希望输入值被改变 chensheng 20140328
		Calendar cloneCal = Calendar.getInstance();
		cloneCal.setTime(cal.getTime());
		cloneCal.add(Calendar.YEAR, years);
		return cloneCal;
	}

	public static Date addMonths(Date date, int months) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return addMonths(cal, months).getTime();
	}

	public static Calendar addMonths(Calendar cal, int months) {
		
		//不能直接使用cal,不希望输入值被改变 chensheng 20140328
		Calendar cloneCal = Calendar.getInstance();
		cloneCal.setTime(cal.getTime());
		cloneCal.add(Calendar.MONTH, months);
		return cloneCal;
		
	}

	public static Date addDays(Date date, int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return addDays(cal, days).getTime();
	}

	public static Calendar addDays(Calendar cal, int days) {
		//不能直接使用cal,不希望输入值被改变 chensheng 20140328
		Calendar cloneCal = Calendar.getInstance();
		cloneCal.setTime(cal.getTime());
		cloneCal.add(Calendar.DAY_OF_MONTH, days);
		return cloneCal;
	}

	public static Date addHours(Date date, int hours) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return addHours(cal, hours).getTime();
	}

	public static Calendar addHours(Calendar cal, int hours) {
		//不能直接使用cal,不希望输入值被改变 chensheng 20140328
		Calendar cloneCal = Calendar.getInstance();
		cloneCal.setTime(cal.getTime());
		cloneCal.add(Calendar.HOUR, hours);
		return cloneCal;
	}

	/**
	 * 取得两个日期之间的日数。如：beginDate＝"2005-08-26",endDate="2005-08-29",则返回3
	 * 
	 * @param t1
	 *            日期
	 * @param t2
	 *            日期
	 * @return t1到t2间的日数
	 */
	public static long calDays(Date beginDate, Date endDate) {
		long beginTime = beginDate.getTime();
		long endTime = endDate.getTime();
		if (beginTime == endTime) {
			return 0;
		} else if (beginTime > endTime) {
			long temp = beginTime;
			beginTime = endTime;
			endTime = temp;
		}
		return (endTime - beginTime) / DAY_MS;
	}

	/**
	 * 计算两个月份的差值
	 * 
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	public static int calMonths(Date beginDate, Date endDate) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(endDate);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(beginDate);
		if (cal2.equals(cal1)) {
			return 0;
		}

		if (cal1.after(cal2)) {
			Calendar temp = cal1;
			cal1 = cal2;
			cal2 = temp;
		}

		int flag = 0;
		if (cal2.get(Calendar.DAY_OF_MONTH) > cal1.get(Calendar.DAY_OF_MONTH)) {
			flag = 1;
		}

		int iMonth = 0;
		if (cal2.get(Calendar.YEAR) > cal1.get(Calendar.YEAR)) {
			iMonth = (cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR)) * 12
					+ cal2.get(Calendar.MONTH) - cal1.get(Calendar.MONTH)
					+ flag;
		} else {
			iMonth = cal2.get(Calendar.MONTH) - cal1.get(Calendar.MONTH) + flag;
		}
		return iMonth;
	}

	/**
	 * 从身份证号码中获取生日日期
	 * 
	 * @param cardID
	 * @return
	 */
	public static Date getBirthday(String cardID) {
		if (StringUtils.isBlank(cardID)) {
			return null;
		}

		if (cardID.length() == 15) {
			Pattern p = Pattern
					.compile("^[1-9]\\d{5}(\\d{2}((((0[13578])|(1[02]))(([0-2][0-9])|(3[01])))|(((0[469])|(11))(([0-2][0-9])|(30)))|(02[0-2][0-9])))\\d{3}$");
			Matcher m = p.matcher(cardID);
			if (m.matches()) {
				String s = m.group(1);
				try {
					return new SimpleDateFormat("yyyyMMdd").parse("19" + s);
				} catch (ParseException e) {
				}
			}
		} else if (cardID.length() == 18) {
			Pattern p = Pattern
					.compile("^[1-9]\\d{5}(\\d{4}((((0[13578])|(1[02]))(([0-2][0-9])|(3[01])))|(((0[469])|(11))(([0-2][0-9])|(30)))|(02[0-2][0-9])))\\d{3}[\\dX]$");
			Matcher m = p.matcher(cardID);
			if (m.matches()) {
				String s = m.group(1);
				try {
					return new SimpleDateFormat("yyyyMMdd").parse(s);
				} catch (ParseException e) {
				}
			}
		}

		return null;
	}
	
	/**
	 * 比较两个时间（毫秒数）的时间差
	 * @param time1 
	 * @param time2
	 * @return 相差秒数
	 */
	public static long compareTime(long time1,long time2){
		long diff = 0L;
		if((time1-time2) > 0){
			diff = (time1-time2)/1000L;
		}else{
			diff = (time2-time1)/1000L;
		}
		return diff;
	}
	
	/**
	 * 
	 * @param startDate 开始时间
	 * @param endDate 结束时间
	 * @return 返回相差年份
	 */
	public static double calcVehicleAge(Date startDate,Date endDate){
		int designedAge=0;
		//开始时间
		Calendar startCalendar=Calendar.getInstance();
		//结束时间
		Calendar endCalendar=Calendar.getInstance();
		//开始时间大于结束时间
		if(startDate.getTime()>=endDate.getTime()){
			return designedAge;
		}
		
		
		startCalendar.setTime(startDate);
		int startYear=startCalendar.get(Calendar.YEAR);
		//Calendar.MONTH 值是0-11 所以月份需要+1
		int startMonth=startCalendar.get(Calendar.MONTH)+1;
		int startDay=startCalendar.get(Calendar.DATE);
		
		endCalendar.setTime(endDate);
		int endYear=endCalendar.get(Calendar.YEAR);
		//Calendar.MONTH 值是0-11 所以月份需要+1
		int endMonth=endCalendar.get(Calendar.MONTH)+1;
		int endDay=endCalendar.get(Calendar.DATE);
		
		int diffYear=endYear-startYear;
		int diffMonth=endMonth-startMonth;
		
		int month=diffYear*12+diffMonth;
		if(startDay>endDay){
			month--;
		}
		month=month>=0?month:0;
		
		return Math.floor(month/12);
	}
	public static void main(String[] args) throws Exception{
	}
}
