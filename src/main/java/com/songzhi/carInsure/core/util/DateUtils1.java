package com.songzhi.carInsure.core.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;
import com.songzhi.carInsure.core.util.StringUtils;

public class DateUtils1 extends org.apache.commons.lang.time.DateUtils {
	
	private static String[] parsePatterns = {
		"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM", 
		"yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
		"yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};

	/**
	 * 得到当前日期字符串 格式（yyyy-MM-dd）
	 */
	public static String getDate() {
		return getDate("yyyy-MM-dd");
	}
	
	/**
	 * 得到当前日期字符串 格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
	 */
	public static String getDate(String pattern) {
		return DateFormatUtils.format(new Date(), pattern);
	}
	
	/** 
     * 获取当前时间的后一天时间 
     * @return 
     */  
	public static String getAfterNextDay(){  
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
		Calendar myDate = Calendar.getInstance();
		myDate.add(Calendar.DAY_OF_MONTH, 1);
		Date date  = myDate.getTime();		
		String rtnYes = format.format(date);
		return rtnYes;
    }
	
	/**
	 * 得到日期字符串 默认格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
	 */
	public static String formatDate(Date date, Object... pattern) {
		String formatDate = null;
		if (pattern != null && pattern.length > 0) {
			formatDate = DateFormatUtils.format(date, pattern[0].toString());
		} else {
			formatDate = DateFormatUtils.format(date, "yyyy-MM-dd");
		}
		return formatDate;
	}
	
	/**
	 * 得到日期时间字符串，转换格式（yyyy-MM-dd HH:mm:ss）
	 */
	public static String formatDateTime(Date date) {
		return formatDate(date, "yyyy-MM-dd HH:mm:ss");
	}
     
	
	/**
	 * 得到linux时间戳
	 */
	public static int linuxDate(Date date) {
		return (int) (date.getTime()/1000);
	}
	
	/**
	 * 得到当前时间字符串 格式（HH:mm:ss）
	 */
	public static String getTime() {
		return formatDate(new Date(), "HH:mm:ss");
	}

	/**
	 * 得到当前日期和时间字符串 格式（yyyy-MM-dd HH:mm:ss）
	 */
	public static String getDateTime() {
		return formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 得到当前年份字符串 格式（yyyy）
	 */
	public static String getYear() {
		return formatDate(new Date(), "yyyy");
	}

	/**
	 * 得到当前月份字符串 格式（MM）
	 */
	public static String getMonth() {
		return formatDate(new Date(), "MM");
	}

	/**
	 * 得到当天字符串 格式（dd）
	 */
	public static String getDay() {
		return formatDate(new Date(), "dd");
	}

	/**
	 * 得到当前星期字符串 格式（E）星期几
	 */
	public static String getWeek() {
		return formatDate(new Date(), "E");
	}
	
	/**
	 * 日期型字符串转化为日期 格式
	 * { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", 
	 *   "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm",
	 *   "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm" }
	 */
	public static Date parseDate(Object str) {
		if (str == null){
			return null;
		}
		try {
			return parseDate(str.toString(), parsePatterns);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * 获取过去的天数
	 * @param date
	 * @return
	 */
	public static long pastDays(Date date) {
		long t = new Date().getTime()-date.getTime();
		return t/(24*60*60*1000);
	}

	/**
	 * 获取过去的小时
	 * @param date
	 * @return
	 */
	public static long pastHour(Date date) {
		long t = new Date().getTime()-date.getTime();
		return t/(60*60*1000);
	}
	
	/**
	 * 获取过去的分钟
	 * @param date
	 * @return
	 */
	public static long pastMinutes(Date date) {
		long t = new Date().getTime()-date.getTime();
		return t/(60*1000);
	}
	
	/**
	 * 转换为时间（天,时:分:秒.毫秒）
	 * @param timeMillis
	 * @return
	 */
    public static String formatDateTime(long timeMillis){
		long day = timeMillis/(24*60*60*1000);
		long hour = (timeMillis/(60*60*1000)-day*24);
		long min = ((timeMillis/(60*1000))-day*24*60-hour*60);
		long s = (timeMillis/1000-day*24*60*60-hour*60*60-min*60);
		long sss = (timeMillis-day*24*60*60*1000-hour*60*60*1000-min*60*1000-s*1000);
		return (day>0?day+",":"")+hour+":"+min+":"+s+"."+sss;
    }
	
	/**
	 * 获取两个日期之间的天数
	 * 
	 * @param before
	 * @param after
	 * @return
	 */
	public static double getDistanceOfTwoDate(Date before, Date after) {
		long beforeTime = before.getTime();
		long afterTime = after.getTime();
		return (afterTime - beforeTime) / (1000 * 60 * 60 * 24);
	}
	
	/** 
     * 时间戳转换成日期格式字符串 
     * @param seconds 精确到秒的字符串 
     * @param formatStr 
     * @return 
     */  
    public static String timeStamp2Date(long seconds,String format) {  
        if(format == null || format.isEmpty()) {
        	format = "yyyyMMddHHmmss";  
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);  
        return sdf.format(new Date(seconds));  
    } 
    	
	/**
	 * 计算两个日期的时间间隔
	 * 
	 * @param sDate开始时间
	 * 
	 * @param eDate结束时间
	 * 
	 * @param type间隔类型("Y/y"--年  "M/m"--月  "D/d"--日)
	 * 
	 * @return interval时间间隔
	 * */
	public static int calInterval(Date sDate, Date eDate, String type)
	{
		//时间间隔，初始为0
		int interval = 0;
		
		/*比较两个日期的大小，如果开始日期更大，则交换两个日期*/
		//标志两个日期是否交换过
		boolean reversed = false;
		if(compareDate(sDate, eDate) > 0)
		{
			Date dTest = sDate;
			sDate = eDate;
			eDate = dTest;
			//修改交换标志
			reversed = true;
		}
		
		/*将两个日期赋给日历实例，并获取年、月、日相关字段值*/
		Calendar sCalendar = Calendar.getInstance();
		sCalendar.setTime(sDate);
		int sYears = sCalendar.get(Calendar.YEAR);
		int sMonths = sCalendar.get(Calendar.MONTH);
		int sDays = sCalendar.get(Calendar.DAY_OF_YEAR);
		
		Calendar eCalendar = Calendar.getInstance();
		eCalendar.setTime(eDate);
		int eYears = eCalendar.get(Calendar.YEAR);
		int eMonths = eCalendar.get(Calendar.MONTH);
		int eDays = eCalendar.get(Calendar.DAY_OF_YEAR);
		
		//年
		if(cTrim(type).equals("Y") || cTrim(type).equals("y"))
		{
			interval = eYears - sYears;
			if(eMonths < sMonths)
			{
				--interval;
			}else if( ((eMonths == sMonths) && (eDays < sDays))){
				--interval;
			}
		}
		//月
		else if(cTrim(type).equals("M") || cTrim(type).equals("m"))
		{
			interval = 12 * (eYears - sYears);
			interval += (eMonths - sMonths);
		}
		//日
		else if(cTrim(type).equals("D") || cTrim(type).equals("d"))
		{
			interval = 365 * (eYears - sYears);
			interval += (eDays - sDays);
			//除去闰年天数
			while(sYears < eYears)
			{
				if(isLeapYear(sYears))
				{
					--interval;
				}
				++sYears;
			}
		}
		//如果开始日期更大，则返回负值
		if(reversed)
		{
			interval = -interval;
		}
		//返回计算结果
		return interval;
	}
	
	/**
	 * zhanglei
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
	
	/**
	* 
	* 字符串去除两头空格，如果为空，则返回""，如果不空，则返回该字符串去掉前后空格
	* 
	* @param tStr输入字符串
	* 
	* @return 如果为空，则返回""，如果不空，则返回该字符串去掉前后空格
	* 
	*/
	public static String cTrim(String tStr) 
	{
		String ttStr = "";
		if (tStr == null) 
		{} 
		else 
		{
			ttStr = tStr.trim();
		}
		return ttStr;
	}
	/**
	 * 比较两个Date类型的日期大小
	 * 
	 * @param sDate开始时间
	 * 
	 * @param eDate结束时间
	 * 
	 * @return result返回结果(0--相同  1--前者大  2--后者大)
	 * */
	public static int compareDate(Date sDate, Date eDate)
	{
		int result = 0;
		//将开始时间赋给日历实例
		Calendar sC = Calendar.getInstance();
		sC.setTime(sDate);
		//将结束时间赋给日历实例
		Calendar eC = Calendar.getInstance();
		eC.setTime(eDate);
		//比较
		result = sC.compareTo(eC);
		//返回结果
		return result;
	}
	
	public static Date getMonthDate(){
		Calendar calendar=Calendar.getInstance();//获取当前日期 
        calendar.add(Calendar.MONTH, -1);
        calendar.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
        return calendar.getTime();
	}
	
	@Test
	public void testName() throws Exception {
		Calendar calendar=Calendar.getInstance();//获取当前日期 
        calendar.add(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        System.out.println(calendar.getTime());
	}
	
	/**
	  * 判定某个年份是否是闰年
	  * 
	  * @param year待判定的年份
	  * 
	  * @return 判定结果
	  * */
	 private static boolean isLeapYear(int year)
	 {
		 return (year%400 == 0 || (year%4 == 0 && year%100 != 0));
	 }

    /**
     * 格式化日期
     * 
     * @return
     */
    public static Date fomatDate(String date) {
	DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
	try {
	    return fmt.parse(date);
	} catch (ParseException e) {
	    e.printStackTrace();
	    return null;
	}
    }
    
    public static Date fomatDateByPaten(String date,String paten) {
    	if(StringUtils.isEmpty(paten)){
    		paten = "yyyy-MM-dd";
    	}
    	DateFormat fmt = new SimpleDateFormat(paten);
    	try {
    	    return fmt.parse(date);
    	} catch (ParseException e) {
    	    e.printStackTrace();
    	    return null;
    	}
        }
    
    /**
     * frmateDate:(获取当前日期). <br/>
     *
     * @author LeiChi-Hzq
     * @return Date
     * @since JDK 1.7
     */
    public static Date frmateDate(){
    	return fomatDate(getDate());
    }

    
    /**
     * 获取当前时间的前几个月
     * getDistanceMonthDate:(这里用一句话描述这个方法的作用). <br/>
     *
     * @author 陈文博
     * @return
     * @since JDK 1.7
     */
    public static Date getDistanceMonthDate(Date date,int size){

    	Calendar calendar=Calendar.getInstance();  
    	calendar.setTime(date);  
    	calendar.add(Calendar.MONTH, size);
        return calendar.getTime();
    }
    /**
     * 获取当前月第一天
     * getCurrentMonthFirstDay:(这里用一句话描述这个方法的作用). <br/>
     *
     * @author 陈文博
     * @return
     * @since JDK 1.7
     */
    public static Date getCurrentMonthFirstDay(){
    	Calendar c = Calendar.getInstance();    
    	c.add(Calendar.MONTH, 0);
    	c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
    	return c.getTime();
    }
    public static String getNextStrTime(String strDate ,int num, String type){
    	if(StringUtils.isEmpty(strDate)){
    		return null;
    	}
    	Date dddate = fomatDate(strDate);
    	Calendar c = Calendar.getInstance();  
    	c.setTime(dddate); 
    	if("Y".equals(type) || "y".equals(type)){
    		 c.add(Calendar.YEAR,num);
    	}else if("M".equals(type) || "m".equals(type)){
    		 c.add(Calendar.MONTH,num);
    	}else if("D".equals(type) || "d".equals(type)){
    		 c.add(Calendar.DATE,num);
    	}
    	return formatDate(c.getTime());
    }
    /**
     * 获取当前月最后一天
     * getCurrentMonthLastDay:(这里用一句话描述这个方法的作用). <br/>
     *
     * @author 陈文博
     * @return
     * @since JDK 1.7
     */
    public static Date getCurrentMonthLastDay(){
    	Calendar ca = Calendar.getInstance();    
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));  
        return ca.getTime();
    }
    
    /**
     * @param args
     * @throws ParseException
     */
    public static void main(String[] args) throws ParseException {
    	
    	int u = (int) DateUtils1.calcVehicleAge(DateUtils1.fomatDate("2011-07-22 00:00:00"), DateUtils1.fomatDate("2017-07-22 00:00:00"));
    	
    	String ageStr = "";
    	if(u < 1){
    		ageStr="306001";
		}else if(2>u && u >=1){
			ageStr="306002";
		}else if(3>u&& u >=2){
			ageStr="306003";
		}else if(4>u&& u >=3){
			ageStr="306004";
		}else if(6>u&& u >=4){
			ageStr="306005";
		}else if(u >=6){
			ageStr="306007";
		}
    	
    	System.out.println(u +"   |   "+ ageStr);
    	
    	System.out.println(DateUtils1.getAfterNextDay());
    }

}
