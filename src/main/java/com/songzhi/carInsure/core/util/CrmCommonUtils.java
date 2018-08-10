package com.songzhi.carInsure.core.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class CrmCommonUtils {
	static Logger logger = LoggerFactory.getLogger(CrmCommonUtils.class);
	private static Map<String,String> configMap=new HashMap();//配置信息
	/**
	 * 解压压缩包
	 * @param zipFileName
	 * @param outputDir
	 * @throws IOException
	 */
	public static void unzip(String zipFileName,String outputDir)throws IOException{
		ZipInputStream zipin=null;
		try{
		zipin =new ZipInputStream(new FileInputStream(zipFileName));
		ZipEntry zen =zipin.getNextEntry();
		while(zen !=null){
			File zf =new File(outputDir);
			String zname =zen.getName();
			zf.mkdir();
			if(zen.isDirectory()){
				zname =zf.getName();
				zf=new File(outputDir+File.separator+zname);
				zf.mkdir();
			}else{
				zf=new File(outputDir+File.separator+zname);
				zf.createNewFile();
				FileOutputStream  out =new FileOutputStream(zf);
				int b ;
				while((b=zipin.read())!=-1){
					out.write(b);
					
				}
				out.close();
			}
			zen=zipin.getNextEntry();
			
		}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			if(zipin!=null){
				zipin.close();
			}
		}
	}
	
	
	
	/**
	 * 从指定目录下载文件
	 * @param url
	 * @param destFile
	 * @throws Exception
	 */
	public static void download(URL url, File destFile) throws Exception {
		if (!destFile.exists()) {
			destFile.getParentFile().mkdirs();
			destFile.createNewFile();
		}
		InputStream in = url.openConnection().getInputStream();
		OutputStream out = new FileOutputStream(destFile);
		byte[] buffer = new byte[1024];
		int n = 0;
		while ((n = in.read(buffer)) > 0) {
			out.write(buffer, 0, n);
		}
		in.close();
		out.close();
	}
	
	/**
	 * 将Base64数据转为字符串
	 * @param str
	 * @return String
	 * @author c_yulei-017
	 */
	public static String convertBase64Data2String(String str) throws Exception{
		if(str == null || "".equals(str)){
			return "";
		}
		BASE64Decoder base64Decoder = new BASE64Decoder();
		byte[] bs = base64Decoder.decodeBuffer(str);
//		byte[] bs = Base64.decode(str);
		for (int j = 0; j < bs.length; j++) {
			if (bs[j] < 0) {// 调整异常数据
				bs[j] += 256;
			}
		}
		return new String(bs, "UTF-8");
	}
	
	/**
	 * 将字符串转为Base64数据
	 * @param str
	 * @return String
	 * @author c_yulei-017
	 */
	public static String convertString2Base64Data(String base64Data) throws Exception{
		if(base64Data == null || "".equals(base64Data)){
			return "";
		}
		BASE64Encoder base64Encoder = new BASE64Encoder();
		
		String resStr=base64Encoder.encode(base64Data.getBytes());		
//		String resStr = Base64.encode(base64Data.getBytes());
		
		return resStr;
	}
	
	public static byte[] getBytesFromFile(File file) throws IOException {

		InputStream is = new FileInputStream(file);
		long length = file.length();
		if (length > Integer.MAX_VALUE) {
			// 文件太大，无法读取
			throw new IOException("File is to large " + file.getName());
		}
		// 创建一个数据来保存文件数据
		byte[] bytes = new byte[(int) length];
		// 读取数据到byte数组中
		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length
				&& (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
			offset += numRead;
		}
		// 确保所有数据均被读取
		if (offset < bytes.length) {
			throw new IOException("Could not completely read file "
					+ file.getName());
		}
		// Close the input stream and return bytes
		is.close();
		return bytes;

	}
	
	/**
	 * 清空目录
	 * @param dir
	 * @author c_yulei-017
	 */
	public static void clearDir(File dir) {
		if (!dir.exists()) {
			dir.mkdirs();
			return;
		} else {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					clearDir(file);
				} else {
					file.delete();
				}
			}
		}
	}
	
	
	/**
	 * 压缩目录下的文件为zip
	 * @param dir
	 * @return File
	 * @throws Exception
	 * @author c_yulei-017
	 */
	public static File zipDir(File dir) throws Exception {
		logger.info(dir.getName()+"******开始压缩文件*********"+CrmCommonUtils.getCurrentTime("5"));
		File zipFile = new File(dir.getParentFile(), dir.getName() + ".zip");
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile));
		ZipEntry dirEntry = new ZipEntry(dir.getName() + "/");
		zos.putNextEntry(dirEntry);
		File[] files = dir.listFiles();
		for (File file : files) {
			ZipEntry entry = new ZipEntry(dir.getName() + "/" + file.getName());
			entry.setSize(file.length());
			zos.putNextEntry(entry);
			InputStream in = new FileInputStream(file);
			int len = 0;
			while ((len = in.read()) != -1) {
				zos.write(len);
			}
			in.close();
		}
		zos.close();
		logger.info(dir.getName()+"******压缩文件结束*********"+CrmCommonUtils.getCurrentTime("5"));
		return zipFile;
	}
	
	
	/**
	 * 将文件拷贝到另一个目录下
	 * @param srcFile
	 * @param destFile
	 * @throws Exception
	 */
	@SuppressWarnings("resource")
	public static void copyFile(File srcFile, File destFile) throws Exception {
		if (!srcFile.exists())
			return;
		if (!destFile.exists()) {
			destFile.createNewFile();
		}
		FileChannel in = new RandomAccessFile(srcFile, "r").getChannel();
		FileChannel out = new RandomAccessFile(destFile, "rw").getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		int n = 0;
		while ((n = in.read(buffer)) > 0) {
			buffer.flip();
			out.write(buffer);
			buffer.clear();
		}
		in.close();
		out.close();
	}
	
	/**
	 * MD5加密
	 * @return String
	 * @author c_yulei-017
	 * @throws NoSuchAlgorithmException 
	 */
	public static String md5(String inStr) throws NoSuchAlgorithmException{
		String resStr = "";
		if (inStr == null || "".equals(inStr.trim())) {
			resStr = "";
		}
		// 实例化、初始化
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		// 得到一个操作系统默认的字节编码格式的字节数组
		byte[] btInput = inStr.getBytes();
		// 对得到的字符数组进行处理
		md5.update(btInput);
		// 进行哈希计算并返回结果
		byte[] btResult = md5.digest();
		// 进行哈希计算后得到的数据的长度
		StringBuffer sBuffer = new StringBuffer();
		for (byte b:btResult) {
			int bt = b&0xff;
			if (bt<16) {
				sBuffer.append(0);
			}
			sBuffer.append(Integer.toHexString(bt));
		}
		resStr = sBuffer.toString();
		return resStr;
	}	
	
	
	/**
	 * 生成随机数UUID
	 * @return UUID
	 * @author c_yulei-017
	 */
	public static String getUUID(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}	
	
	
	/***
	 * @param int
	 * 生成随机数，不足位数的前面补0
	 * @return String
	 * @author c_yulei-017
	 */
	public static String getRadom(int digit,int maxValue,int minValue){
		String res = "";
		Random rd = new Random();
		res = String.format("%0"+digit+"d", 1+rd.nextInt(maxValue));
		return res;
	}
	
	
	/**
	 * 去掉参数map中值为空的参数
	 * @param paramMap
	 */
	public static Map<String, Object> putOffNullParam(Map<String, Object> paramMap){
		List<String> removeList = new ArrayList<String>();
		try{
			for (Map.Entry<String, Object> entry: paramMap.entrySet()) {
				// 键不为空
				if(entry.getKey() != null && !"".equals(entry.getKey())){
					// 值为空，删除该参数
					if(entry.getValue() == null || "".equals(entry.getValue())){
						removeList.add(entry.getKey());
					}
				}
			}
			for (int i = 0; i < removeList.size(); i++) {
				paramMap.remove(removeList.get(i));
			}
			return paramMap;
		}finally{
			removeList = null;
			paramMap = null;
			System.gc();
		}		
	}
	
	/**
	 * 获取properties文件中的值
	 * @param key
	 * @return String
	 * @author c_yulei-017
	 */
	public static String GetCommomProperties(String key){
		Properties prop = new Properties();
		//InputStream in = CrmCommonUtils.class.getResourceAsStream("/common/systemConfig.properties");
		 //开发
		InputStream in = CrmCommonUtils.class.getResourceAsStream("/common/commonDev.properties");
		 //压测
		//InputStream in = CrmCommonUtils.class.getResourceAsStream("/common/commonYc.properties");
		 //测试
		//InputStream in = CrmCommonUtils.class.getResourceAsStream("/common/commonUat.properties");
		 //sit
		//InputStream in = CrmCommonUtils.class.getResourceAsStream("/common/commonSit.properties");
		 //生产
		//InputStream in = CrmCommonUtils.class.getResourceAsStream("/common/common.properties");
		try {
			prop.load(in);
			in.close();
		} catch (IOException e) {
			logger.error("读取properties文件内容出现IO异常！");
		}
		if(key != null && !"".equals(key)){
			// 返回键对应的值
			System.out.println("key:"+key+" value:"+prop.getProperty(key));
			return prop.getProperty(key);
		}else{
			return "";
		}
		
//		if(key != null && !"".equals(key)){
//			// 返回键对应的值
//			logger.info("获取key:"+key+" value:"+configMap.get(key));
//			return configMap.get(key);
//		}else{
//			return "";
//		}
		
	}
	/**
    * 更新（或插入）一对properties信息(主键及其键值)
    * 如果该主键已经存在，更新该主键的值；
    * 如果该主键不存在，则插件一对键值。
    * @param keyname 键名
    * @param keyvalue 键值
    */
    public static void SetCommomProperties(String keyname,String keyvalue) {       
        try {
        	configMap.put(keyname, keyvalue);
        } catch (Exception e) {
        	//e.printStackTrace();
        	logger.info("更新错误");
        }
    }
    /**
     * 获取系统配置个数
     * @return
     */
    public static int getCommomPropertieSize() {       
        return configMap.size();
    }
	/**
	 * 获取当前时间，并format
	 * @param flag 1:yyyy-MM-dd
	 * @param flag 2:yyyyMMdd
	 * @param flag 3:yyyy-MM-dd HH:mm:ss
	 * @param flag 4:HH:mm:ss
	 * @param flag 5:yyyyMMddHHmmssSSS
	 * @param flag 6:yyyyMMddHHmmss
	 * @return String
	 * @author c_yulei-017
	 */
	public static String getCurrentTime(String flag){
		String nowTime = "";
		Date now = new Date();
		if("1".equals(flag)){
			nowTime = DateUtils.format(now, "yyyy-MM-dd");
		}else if("2".equals(flag)){
			nowTime = DateUtils.format(now, "yyyyMMdd");
		}else if("3".equals(flag)){
			nowTime = DateUtils.format(now, "yyyy-MM-dd HH:mm:ss");
		}else if("4".equals(flag)){
			nowTime = DateUtils.format(now, "HH:mm:ss");
		}else if("5".equals(flag)){
			nowTime = DateUtils.format(now, "yyyyMMddHHmmssSSS");
		}else if("6".equals(flag)){
			nowTime = DateUtils.format(now, "yyyyMMddHHmmss");
		}
		return nowTime;
	}
	

	/***
	 * 打印错误日志到log文件中
	 * @param e
	 * @return
	 */
	public static String getTrace(Throwable e){
		StringWriter st = new StringWriter();
		PrintWriter pw = new PrintWriter(st);
		e.printStackTrace(pw);
		StringBuffer sb = st.getBuffer();
		return sb.toString();
	}
	
	// 必须使用组件
	// 字符串工具
	// 将所有元素用分隔符分隔并拼装成一个字符
	public static String join(Object[] array,char separator){
		return StringUtils.join(array, separator);
	} 
	// 用指定的字符替换目标字符中首次出现的特殊字符
	public static String replaceOnce(String text, String searchString, String replacement){
		return StringUtils.replaceOnce(text, searchString, replacement);
	}
	
	//List对象排序的通用方法
	public static class ListSort<E>{
		/**
		 * 
		 * @param list 要排序的集合 
		 * @param method 要排序的实体的属性所对应的get方法
		 * @param sort desc 为正序 
		 */
		public void Sort(final List<ScoreDetail> list, final String method, final String sort) throws Exception { 
			
			// 用内部类实现排序  
			Collections.sort(list, new Comparator<ScoreDetail>() {
				public int compare(ScoreDetail a, ScoreDetail b) {  
					int ret = 0;  
					try {  
						// 获取m1的方法名  
						Method m1 = a.getClass().getMethod(method, null);  
						// 获取m2的方法名  
						Method m2 = b.getClass().getMethod(method, null);  
						
						if (sort != null && "desc".equals(sort)) { 
							String type = m1.invoke(((ScoreDetail)a),null).getClass().toString();
							if(type.endsWith("BigDecimal")){
								BigDecimal strb=(BigDecimal)m2.invoke(((ScoreDetail)b), null);
								BigDecimal stra=(BigDecimal)m1.invoke(((ScoreDetail)a),null);
								if(strb.subtract(stra).doubleValue()>0){
									ret=4;
								}else{	
									ret=-1;
								}
							}else if(type.endsWith("String")){
								ret=m1.invoke(((ScoreDetail)b), null).toString().compareTo(m2.invoke(((ScoreDetail)b), null).toString());
							}else{
								throw new Exception("暂不支持该类型排序！");
							}
						} else {
							throw new Exception("暂不支持asc排序！");
						}
					}catch (Exception e){
						e.printStackTrace();
					}
					return ret;  
				}
			});
		}
	}
	
	
	//判断字符串中是否有中文
	//有中文返回true

	public static boolean isChineseChar(String str){
	        boolean temp = false;
	        Pattern p=Pattern.compile("[\u4e00-\u9fa5]"); 
	        Matcher m=p.matcher(str); 
	        if(m.find()){ 
	            temp =  true;
	        }
	        return temp;
	    }
	
	
	/**
	 * 验证手机号码
	 * @param mobiles
	 * @return
	 */
	public static boolean checkMobileNumber(String mobileNumber){
		boolean flag = false;
		try{
			Pattern regex = Pattern.compile("^(((13[0-9])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8})|(0\\d{2}-\\d{8})|(0\\d{3}-\\d{7})$");
			Matcher matcher = regex.matcher(mobileNumber);
			flag = matcher.matches();
		}catch(Exception e){
			flag = false;
		}
		return flag;
	}
	
	public static void main(String[] args){
		//GetCommomProperties.
		String url = CrmCommonUtils.GetCommomProperties("CRM_REDIS_URL");
		System.out.print(url);
	}
	
	
}
