package com.songzhi.carInsure.web.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class BringIDUtil {
   //产生暂存单ID
   public static String bringTempID() {
	   
	    // TODO Auto-generated method stub
	    String msg = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS");
		// 暂存id生成
		msg += sdf.format(date);
		StringBuffer stringBuffer = new StringBuffer("");
		char a = ':';
		char p = '.';
		char m = '/';
		char c = ' ';
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) != a && msg.charAt(i) != p && msg.charAt(i) != m && msg.charAt(i) != c) {
				stringBuffer.append(msg.charAt(i));
			}
		}
		Random random = new Random();
		int dom = random.nextInt(1000);
		System.out.println(dom);
		StringBuffer randomBuffer = new StringBuffer("");
		if (dom < 10) {
			String and = "00" + dom;
			randomBuffer.append(and);
		} else if (10 <= dom && dom < 100) {
			String and = dom + "0";
			randomBuffer.append(and);
		} else {
			randomBuffer.append(dom);
		}
		stringBuffer.append(randomBuffer);
		System.out.println(stringBuffer.toString());
		
		return stringBuffer.toString();
   }	
}
