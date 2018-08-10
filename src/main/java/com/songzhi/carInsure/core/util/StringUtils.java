package com.songzhi.carInsure.core.util;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringUtils {
	private static final Logger LOG = LoggerFactory.getLogger(StringUtils.class);
	
	 public static boolean isEmpty(String str) {
	    	return org.apache.commons.lang.StringUtils.isEmpty(str);
	  }
	 
	 public static boolean isNotEmpty(String str) {
	        return !isEmpty(str);
	    }
	 
	 public static boolean isBlank(String str) {
	    	return org.apache.commons.lang.StringUtils.isBlank(str);
	    }
	 
	 public static boolean isNotBlank(String str) {
	        return !isBlank(str);
	    }
	 
	 public static String trim(String str) {
	    	return org.apache.commons.lang.StringUtils.trim(str);
	    }
	 
	 public static String strip(String str) {
	        return strip(str, null);
	    }
	 
	 public static String strip(String str, String stripChars) {
	    	return org.apache.commons.lang.StringUtils.strip(str, stripChars);
	    }
	 
	 public static String stripStart(String str, String stripChars) {
	    	return org.apache.commons.lang.StringUtils.stripStart(str, stripChars);
	    }
	 
	 public static String stripEnd(String str, String stripChars) {
	    	return org.apache.commons.lang.StringUtils.stripEnd(str, stripChars);
	    }
	 
	 public static String[] stripAll(String... strs) {
	        return stripAll(strs, null);
	    }
	 
	 public static String[] stripAll(String[] strs, String stripChars) {
	    	return org.apache.commons.lang.StringUtils.stripAll(strs, stripChars);
	    }
	 
	 public static boolean equalsIgnoreCase(String str1, String str2) {
	    	return org.apache.commons.lang.StringUtils.equalsIgnoreCase(str1, str2);
	    }
	 
//	 public static int indexOf(String str, int searchChar) {
//	    	return org.apache.commons.lang.StringUtils.indexOf(str, searchChar);
//	    }
	 
//	 public static int indexOf(String str, int searchChar, int startPos) {
//	    	return org.apache.commons.lang.StringUtils.indexOf(str, searchChar, startPos);
//	    }
	 
	 public static int indexOf(String str, String searchStr) {
	    	return org.apache.commons.lang.StringUtils.indexOf(str, searchStr);
	    }
	 
	 public static int indexOf(String str, String searchStr, int startPos) {
	    	return org.apache.commons.lang.StringUtils.indexOf(str, searchStr, startPos);
	    }

	   
	    public static int ordinalIndexOf(String str, String searchStr, int ordinal) {
	    	return org.apache.commons.lang.StringUtils.ordinalIndexOf(str, searchStr, ordinal);
	    }

	   
	    public static int indexOfIgnoreCase(String str, String searchStr) {
	    	return org.apache.commons.lang.StringUtils.indexOfIgnoreCase(str, searchStr);
	    }

	   
	    public static int indexOfIgnoreCase(String str, String searchStr, int startPos) {
	    	return org.apache.commons.lang.StringUtils.indexOfIgnoreCase(str, searchStr, startPos);
	    }


//	    public static int lastIndexOf(String str, int searchChar) {
//	    	return org.apache.commons.lang.StringUtils.lastIndexOf(str, searchChar);
//	    }

	  
//	    public static int lastIndexOf(String str, int searchChar, int startPos) {
//	    	return org.apache.commons.lang.StringUtils.lastIndexOf(str, searchChar, startPos);
//	    }

	   
	    public static int lastIndexOf(String str, String searchStr) {
	    	return org.apache.commons.lang.StringUtils.lastIndexOf(str, searchStr);
	    }

	  
	    public static int lastIndexOf(String str, String searchStr, int startPos) {
	    	return org.apache.commons.lang.StringUtils.lastIndexOfIgnoreCase(str, searchStr, startPos);
	    }

	
	    public static int lastOrdinalIndexOf(String str, String searchStr, int ordinal) {
	    	return org.apache.commons.lang.StringUtils.lastOrdinalIndexOf(str, searchStr, ordinal);
	    }

	   
	    public static int lastIndexOfIgnoreCase(String str, String searchStr) {
	    	return org.apache.commons.lang.StringUtils.lastIndexOfIgnoreCase(str, searchStr);
	    }

	
	    public static int lastIndexOfIgnoreCase(String str, String searchStr, int startPos) {
	    	return org.apache.commons.lang.StringUtils.lastIndexOfIgnoreCase(str, searchStr, startPos);
	    }

	   
//	    public static boolean contains(String str, int searchChar) {
//	    	return org.apache.commons.lang.StringUtils.contains(str, searchChar);
//	    }

	    
	    public static boolean contains(String str, String searchStr) {
	    	return org.apache.commons.lang.StringUtils.contains(str, searchStr);
	    }
	    
	    public static boolean containsIgnoreCase(String str, String searchStr) {
	    	return org.apache.commons.lang.StringUtils.containsIgnoreCase(str, searchStr);
	    }

	    
//	    public static boolean containsWhitespace(String str) {
//	    	return org.apache.commons.lang.StringUtils.containsWhitespace(str);
//	    }

	  
	    public static boolean containsAny(String str, char... searchChars) {
	    	return org.apache.commons.lang.StringUtils.containsAny(str, searchChars);
	    }

//	    public static boolean containsAny(String str, String searchChars) {
//	    	return org.apache.commons.lang.StringUtils.containsAny(str, searchChars);
//	    }

	  
	    public static int indexOfAny(String str, char... searchChars) {
	    	return org.apache.commons.lang.StringUtils.indexOfAny(str, searchChars);
	    }

	    
	    public static int indexOfAny(String str, String searchChars) {
	    	return org.apache.commons.lang.StringUtils.indexOfAny(str, searchChars);
	    }

	   
	    public static int indexOfAnyBut(String str, char... searchChars) {
	    	return org.apache.commons.lang.StringUtils.indexOfAnyBut(str, searchChars);
	    }

	   
	    public static int indexOfAnyBut(String str, String searchChars) {
	    	return org.apache.commons.lang.StringUtils.indexOfAnyBut(str, searchChars);
	    }


	    public static boolean containsOnly(String str, char... valid) {
	    	return org.apache.commons.lang.StringUtils.containsOnly(str, valid);
	    }

	  
	    public static boolean containsOnly(String str, String validChars) {
	    	return org.apache.commons.lang.StringUtils.containsOnly(str, validChars);
	    }

	    
	    public static boolean containsNone(String str, char... searchChars) {
	    	return org.apache.commons.lang.StringUtils.containsNone(str, searchChars);
	    }

	    
	    public static boolean containsNone(String str, String invalidChars) {
	    	return org.apache.commons.lang.StringUtils.containsNone(str, invalidChars);
	    }

	    
	    public static int indexOfAny(String str, String... searchStrs) {
	    	return org.apache.commons.lang.StringUtils.indexOfAny(str, searchStrs);
	    }

	   
	    public static int lastIndexOfAny(String str, String... searchStrs) {
	    	return org.apache.commons.lang.StringUtils.lastIndexOfAny(str, searchStrs);
	    }
	    
	    
//	    public static String toString(byte[] bytes, String charsetName) throws UnsupportedEncodingException {
//	    	return org.apache.commons.lang.StringUtils.toString(bytes, charsetName);
//	    }
	    
	   
		public static String[] subString(String str, int length, int max) {
			String[] result = new String[max];
			try {
				char[] charArray = str.toCharArray();
				StringBuilder sb = new StringBuilder();
				int count = 0;
				int arrayCount = 0;
				for (int i=0; i<charArray.length; i++) {
					char ch = charArray[i];
					int chLength = Character.toString(ch).getBytes("UTF-8").length;
					count += chLength;
					if (count > length) {
						result[arrayCount] = sb.toString();
						arrayCount++;
						if (arrayCount > max-1) break;
						sb = new StringBuilder();
						count = chLength;
					}
					sb.append(ch);
				}
				if (arrayCount < max)
					result[arrayCount] = sb.toString();
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException("UnsupportedEncoding!", e);
			}
			return result;
		}

	    
	    public static String substring(String str, int start) {
	    	return org.apache.commons.lang.StringUtils.substring(str, start);
	    }

	   
	    public static String substring(String str, int start, int end) {
	    	return org.apache.commons.lang.StringUtils.substring(str, start, end);
	    }

	
	    public static String left(String str, int len) {
	    	return org.apache.commons.lang.StringUtils.left(str, len);
	    }

	
	    public static String right(String str, int len) {
	    	return org.apache.commons.lang.StringUtils.right(str, len);
	    }

	
	    public static String mid(String str, int pos, int len) {
	    	return org.apache.commons.lang.StringUtils.mid(str, pos, len);
	    }

	 
	    public static String substringBefore(String str, String separator) {
	    	return org.apache.commons.lang.StringUtils.substringBefore(str, separator);
	    }

	
	    public static String substringAfter(String str, String separator) {
	    	return org.apache.commons.lang.StringUtils.substringAfter(str, separator);
	    }

	 
	    public static String substringBeforeLast(String str, String separator) {
	    	return org.apache.commons.lang.StringUtils.substringBeforeLast(str, separator);
	    }
	    
	    public static String substringAfterLast(String str, String separator) {
	    	return org.apache.commons.lang.StringUtils.substringAfterLast(str, separator);
	    }

	    
	    public static String substringBetween(String str, String tag) {
	        return substringBetween(str, tag, tag);
	    }

	    
	    public static String substringBetween(String str, String open, String close) {
	    	return org.apache.commons.lang.StringUtils.substringBetween(str, open, close);
	    }

	    
	    public static String[] substringsBetween(String str, String open, String close) {
	    	return org.apache.commons.lang.StringUtils.substringsBetween(str, open, close);
	    }

	    
	    public static String[] split(String str) {
	        return split(str, null, -1);
	    }

	   
	    public static String[] split(String str, char separatorChar) {
	    	return org.apache.commons.lang.StringUtils.split(str, separatorChar);
	    }

	   
	    public static String[] split(String str, String separatorChars) {
	    	return org.apache.commons.lang.StringUtils.split(str, separatorChars);
	    }

	   
	    public static String[] split(String str, String separatorChars, int max) {
	    	return org.apache.commons.lang.StringUtils.split(str, separatorChars, max);
	    }

	   
	    public static String[] splitByWholeSeparator(String str, String separator) {
	    	return org.apache.commons.lang.StringUtils.splitByWholeSeparator(str, separator);
	    }

	   
	    public static String[] splitByWholeSeparator( String str, String separator, int max ) {
	    	return org.apache.commons.lang.StringUtils.splitByWholeSeparator(str, separator, max);
	    }

	   
	    public static String[] splitByWholeSeparatorPreserveAllTokens(String str, String separator) {
	    	return org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens(str, separator);
	    }

	   
	    public static String[] splitByWholeSeparatorPreserveAllTokens(String str, String separator, int max) {
	    	return org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens(str, separator, max);
	    }

	   
	    public static String[] splitPreserveAllTokens(String str) {
	    	return org.apache.commons.lang.StringUtils.splitPreserveAllTokens(str);
	    }

	    
	    public static String[] splitPreserveAllTokens(String str, char separatorChar) {
	    	return org.apache.commons.lang.StringUtils.splitPreserveAllTokens(str, separatorChar);
	    }

	  
	    public static String[] splitPreserveAllTokens(String str, String separatorChars) {
	    	return org.apache.commons.lang.StringUtils.splitPreserveAllTokens(str, separatorChars);
	    }

	    
	    public static String[] splitPreserveAllTokens(String str, String separatorChars, int max) {
	    	return org.apache.commons.lang.StringUtils.splitPreserveAllTokens(str, separatorChars, max);
	    }

	    
	    public static String[] splitByCharacterType(String str) {
	    	return org.apache.commons.lang.StringUtils.splitByCharacterType(str);
	    }

	    
	    public static String[] splitByCharacterTypeCamelCase(String str) {
	    	return org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase(str);
	    }

	    
	    public static <T> String join(T... elements) {
	    	return org.apache.commons.lang.StringUtils.join(elements);
	    }

	   
	    public static String join(Object[] array, char separator) {
	    	return org.apache.commons.lang.StringUtils.join(array, separator);
	    }

	    
	    public static String join(Object[] array, char separator, int startIndex, int endIndex) {
	    	return org.apache.commons.lang.StringUtils.join(array, separator, startIndex, endIndex);
	    }

	   
	    public static String join(Object[] array, String separator) {
	    	return org.apache.commons.lang.StringUtils.join(array, separator);
	    }

	    
	    public static String join(Object[] array, String separator, int startIndex, int endIndex) {
	    	return org.apache.commons.lang.StringUtils.join(array, separator, startIndex, endIndex);
	    }

	    
	    public static String join(Iterator<?> iterator, char separator) {
	    	return org.apache.commons.lang.StringUtils.join(iterator, separator);
	    }

	    
	    public static String join(Iterator<?> iterator, String separator) {
	    	return org.apache.commons.lang.StringUtils.join(iterator, separator);
	    }

	    
	    public static String deleteWhitespace(String str) {
	    	return org.apache.commons.lang.StringUtils.deleteWhitespace(str);
	    }

	    
	    public static String removeStart(String str, String remove) {
	    	return org.apache.commons.lang.StringUtils.removeStart(str, remove);
	    }

	   
	    public static String removeStartIgnoreCase(String str, String remove) {
	    	return org.apache.commons.lang.StringUtils.removeStartIgnoreCase(str, remove);
	    }

	    
	    public static String removeEnd(String str, String remove) {
	    	return org.apache.commons.lang.StringUtils.removeEnd(str, remove);
	    }

	    
	    public static String removeEndIgnoreCase(String str, String remove) {
	    	return org.apache.commons.lang.StringUtils.removeEndIgnoreCase(str, remove);
	    }

	    
	    public static String remove(String str, String remove) {
	    	return org.apache.commons.lang.StringUtils.remove(str, remove);
	    }

	    
	    public static String remove(String str, char remove) {
	    	return org.apache.commons.lang.StringUtils.remove(str, remove);
	    }

	    
	    public static String replaceOnce(String text, String searchString, String replacement) {
	    	return org.apache.commons.lang.StringUtils.replaceOnce(text, searchString, replacement);
	    }

	    
	    public static String replace(String text, String searchString, String replacement) {
	    	return org.apache.commons.lang.StringUtils.replace(text, searchString, replacement);
	    }

	    
	    public static String replace(String text, String searchString, String replacement, int max) {
	    	return org.apache.commons.lang.StringUtils.replace(text, searchString, replacement, max);
	    }

	   
	    public static String replaceEach(String text, String[] searchList, String[] replacementList) {
	    	return org.apache.commons.lang.StringUtils.replaceEach(text, searchList, replacementList);
	    }

	    
	    public static String replaceEachRepeatedly(String text, String[] searchList, String[] replacementList) {
	    	return org.apache.commons.lang.StringUtils.replaceEachRepeatedly(text, searchList, replacementList);
	    }

	    
	    public static String replaceChars(String str, char searchChar, char replaceChar) {
	    	return org.apache.commons.lang.StringUtils.replaceChars(str, searchChar, replaceChar);
	    }

	    
	    public static String replaceChars(String str, String searchChars, String replaceChars) {
	    	return org.apache.commons.lang.StringUtils.replaceChars(str, searchChars, replaceChars);
	    }

	    
	    public static String overlay(String str, String overlay, int start, int end) {
	    	return org.apache.commons.lang.StringUtils.overlay(str, overlay, start, end);
	    }

	    
	    public static String chomp(String str) {
	    	return org.apache.commons.lang.StringUtils.chomp(str);
	    }

	    
	    public static String chop(String str) {
	    	return org.apache.commons.lang.StringUtils.chop(str);
	    }

	    
	    public static String repeat(String str, int repeat) {
	    	return org.apache.commons.lang.StringUtils.repeat(str, repeat);
	    }

	    
	    public static String repeat(String str, String separator, int repeat) {
	    	return org.apache.commons.lang.StringUtils.repeat(str, separator, repeat);
	    }

	    
//	    public static String repeat(char ch, int repeat) {
//	    	return org.apache.commons.lang.StringUtils.repeat(ch, repeat);
//	    }

	   
	    public static String rightPad(String str, int size) {
	        return rightPad(str, size, ' ');
	    }

	    
	    public static String rightPad(String str, int size, char padChar) {
	    	return org.apache.commons.lang.StringUtils.rightPad(str, size, padChar);
	    }

	    
	    public static String rightPad(String str, int size, String padStr) {
	    	return org.apache.commons.lang.StringUtils.rightPad(str, size, padStr);
	    }

	    
	    public static String leftPad(String str, int size) {
	        return leftPad(str, size, ' ');
	    }

	    
	    public static String leftPad(String str, int size, char padChar) {
	    	return org.apache.commons.lang.StringUtils.leftPad(str, size, padChar);
	    }

	    
	    public static String leftPad(String str, int size, String padStr) {
	    	return org.apache.commons.lang.StringUtils.leftPad(str, size, padStr);
	    }

	    
	    public static int length(String str) {
	    	return org.apache.commons.lang.StringUtils.length(str);
	    }

	    
	    public static String center(String str, int size) {
	        return center(str, size, ' ');
	    }

	    
	    public static String center(String str, int size, char padChar) {
	    	return org.apache.commons.lang.StringUtils.center(str, size, padChar);
	    }

	    
	    public static String center(String str, int size, String padStr) {
	    	return org.apache.commons.lang.StringUtils.center(str, size, padStr);
	    }

	    
	    public static String upperCase(String str) {
	    	return org.apache.commons.lang.StringUtils.upperCase(str);
	    }

	    public static String upperCase(String str, Locale locale) {
	    	return org.apache.commons.lang.StringUtils.upperCase(str, locale);
	    }

	    
	    public static String lowerCase(String str) {
	    	return org.apache.commons.lang.StringUtils.lowerCase(str);
	    }

	    
	    public static String lowerCase(String str, Locale locale) {
	    	return org.apache.commons.lang.StringUtils.lowerCase(str, locale);
	    }

	   
	    public static String capitalize(String str) {
	    	return org.apache.commons.lang.StringUtils.capitalize(str);
	    }

	    
	    public static String uncapitalize(String str) {
	    	return org.apache.commons.lang.StringUtils.uncapitalize(str);
	    }

	    
	    public static String swapCase(String str) {
	    	return org.apache.commons.lang.StringUtils.swapCase(str);
	    }

	    
	    public static int countMatches(String str, String sub) {
	    	return org.apache.commons.lang.StringUtils.countMatches(str, sub);
	    }

	    
	    public static boolean isAlpha(String str) {
	    	return org.apache.commons.lang.StringUtils.isAlpha(str);
	    }

	    
	    public static boolean isAlphaSpace(String str) {
	    	return org.apache.commons.lang.StringUtils.isAlphaSpace(str);
	    }

	    
	    public static boolean isAlphanumeric(String str) {
	    	return org.apache.commons.lang.StringUtils.isAlphanumeric(str);
	    }

	    
	    public static boolean isAlphanumericSpace(String str) {
	    	return org.apache.commons.lang.StringUtils.isAlphanumericSpace(str);
	    }

	    
	    public static boolean isAsciiPrintable(String str) {
	    	return org.apache.commons.lang.StringUtils.isAsciiPrintable(str);
	    }

	    
	    public static boolean isNumeric(String str) {
	    	return org.apache.commons.lang.StringUtils.isNumeric(str);
	    }

	    
	    public static boolean isNumericSpace(String str) {
	    	return org.apache.commons.lang.StringUtils.isNumericSpace(str);
	    }

	    
	    public static boolean isWhitespace(String str) {
	    	return org.apache.commons.lang.StringUtils.isWhitespace(str);
	    }

	    
	    public static boolean isAllLowerCase(String str) {
	    	return org.apache.commons.lang.StringUtils.isAllLowerCase(str);
	    }

	    
	    public static boolean isAllUpperCase(String str) {
	    	return org.apache.commons.lang.StringUtils.isAllUpperCase(str);
	    }

	    
	    public static String reverse(String str) {
	    	return org.apache.commons.lang.StringUtils.reverse(str);
	    }

	    
	    public static String reverseDelimited(String str, char separatorChar) {
	    	return org.apache.commons.lang.StringUtils.reverseDelimited(str, separatorChar);
	    }

	    
	    public static String abbreviate(String str, int maxWidth) {
	        return abbreviate(str, 0, maxWidth);
	    }

	    
	    public static String abbreviate(String str, int offset, int maxWidth) {
	    	return org.apache.commons.lang.StringUtils.abbreviate(str, offset, maxWidth);
	    }

	    
	    public static String abbreviateMiddle(String str, String middle, int length) {
	    	return org.apache.commons.lang.StringUtils.abbreviateMiddle(str, middle, length);
	    }

	    
	    public static String difference(String str1, String str2) {
	    	return org.apache.commons.lang.StringUtils.difference(str1, str2);
	    }

	   
	    public static int indexOfDifference(String str1, String str2) {
	    	return org.apache.commons.lang.StringUtils.indexOfDifference(str1, str2);
	    }

	    
	    public static int indexOfDifference(String... strs) {
	    	return org.apache.commons.lang.StringUtils.indexOfDifference(strs);
	    }

	   
	    public static String getCommonPrefix(String... strs) {
	    	return org.apache.commons.lang.StringUtils.getCommonPrefix(strs);
	    }

	    
	    public static int getLevenshteinDistance(String s, String t) {
	    	return org.apache.commons.lang.StringUtils.getLevenshteinDistance(s, t);
	    }

	   
//	    public static int getLevenshteinDistance(String s, String t, int threshold) {
//	    	return org.apache.commons.lang.StringUtils.getLevenshteinDistance(s, t, threshold);
//	    }

	    
	    public static boolean startsWith(String str, String prefix) {
	    	return org.apache.commons.lang.StringUtils.startsWith(str, prefix);
	    }

	  
	    public static boolean startsWithIgnoreCase(String str, String prefix) {
	    	return org.apache.commons.lang.StringUtils.startsWithIgnoreCase(str, prefix);
	    }

	   
	    public static boolean startsWithAny(String str, String... searchStrs) {
	    	return org.apache.commons.lang.StringUtils.startsWithAny(str, searchStrs);
	    }
	    
	    
	    public static boolean endsWith(String str, String suffix) {
	    	return org.apache.commons.lang.StringUtils.endsWith(str, suffix);
	    }

	    
	    public static boolean endsWithIgnoreCase(String str, String suffix) {
	    	return org.apache.commons.lang.StringUtils.endsWithIgnoreCase(str, suffix);
	    }

	   
	    public static boolean endsWithAny(String str, String... searchStrs) {
	    	return org.apache.commons.lang.StringUtils.endsWithAny(str, searchStrs);
	    }
	    
	    
	    private static String regexMatcher(String str, String regex){
	    	return Pattern.compile(regex).matcher(str).replaceAll("").trim();
	    }

	   
	    public static byte getByte(String str) throws NumberFormatException, NullPointerException{
	    	str = regexMatcher(str, "[^0-9+-]");
	    	str = str.charAt(0) == '-' ? '-'+regexMatcher(str.substring(1), "[^0-9]") : regexMatcher(str, "[^0-9]");
	    	return Byte.parseByte(str);
	    }
	    
	    
	    public static short getShort(String str) throws NumberFormatException, NullPointerException{
	    	str = regexMatcher(str, "[^0-9+-]");
	    	str = str.charAt(0) == '-' ? '-'+regexMatcher(str.substring(1), "[^0-9]") : regexMatcher(str, "[^0-9]");
	    	return Short.parseShort(str);
	    }


	    public static int getInt(String str) throws NumberFormatException, NullPointerException{
	    	str = regexMatcher(str, "[^0-9+-]");
	    	str = str.charAt(0) == '-' ? '-'+regexMatcher(str.substring(1), "[^0-9]") : regexMatcher(str, "[^0-9]");
	    	return Integer.parseInt(str);
	    }
	    
	    
	    public static long getLong(String str) throws NumberFormatException, NullPointerException{
	    	str = regexMatcher(str, "[^0-9+-]");
	    	str = str.charAt(0) == '-' ? '-'+regexMatcher(str.substring(1), "[^0-9]") : regexMatcher(str, "[^0-9]");
	    	return Long.parseLong(str);
	    }
	    
	   
	    public static float getFloat(String str) throws NumberFormatException, NullPointerException{
	    	str = regexMatcher(str, "[^0-9+\\.+-]");
	    	int d = str.indexOf('.');
	    	str = d == -1 ? str : str.substring(0, d+1)+remove(str.substring(d), ".");
	    	str = str.charAt(0) == '-' ? '-'+regexMatcher(str.substring(1), "[^0-9+\\.]") : regexMatcher(str, "[^0-9+\\.]");
	    	return Float.parseFloat(str);
	    }
	    
	   
	    public static double getDouble(String str) throws NumberFormatException, NullPointerException{
	    	str = regexMatcher(str, "[^0-9+\\.+-]");
	    	int d = str.indexOf('.');
	    	str = d == -1 ? str : str.substring(0, d+1)+remove(str.substring(d), ".");
	    	str = str.charAt(0) == '-' ? '-'+regexMatcher(str.substring(1), "[^0-9+\\.]") : regexMatcher(str, "[^0-9+\\.]");
	    	return Double.parseDouble(str);
	    }
	    
	   
	    public static <T extends Serializable> String toString(T t){
			return t == null ? null : t.toString();
	    }
	    
	    
//	    public static String toCommonString(Object obj) {
//	    	if(obj == null) return "";
//	    	if(obj instanceof String) return (String) obj;
//	    	if(obj instanceof Long) return Long.toString((Long)obj);
//	    	if(obj instanceof Integer) return Integer.toString((Integer)obj);
//	    	if(obj instanceof Double) return Double.toString((Double)obj);
//	    	if(obj instanceof Float) return Float.toString((Float) obj);
//	    	if(obj instanceof Serializable) {
//	    		String str = serializableToString((Serializable) obj);
//	    		if(str != null) 
//	    			return str;
//	    	}
//	    	return obj.toString();
//	    }
	    
	   
//	    @SuppressWarnings("unchecked")
//		public static Serializable stringToSerializable(String src, Class<?> toClass) {
//	    	if(toClass == String.class) return src;
//	    	if(toClass == Long.class) return Long.valueOf(src);
//	    	if(toClass == Integer.class) return Integer.valueOf(src);
//	    	if(toClass == Double.class) return Double.valueOf(src);
//	    	if(toClass == Float.class) return Float.valueOf(src);
//	    	if(Serializable.class.isAssignableFrom(toClass)) {
//	    		return stringConvertToSerializable(src, (Class<? extends Serializable>)toClass);
//	    	}
//	    	return null;
//	    }
	    
//	    protected static String serializableToString(Serializable obj) {
//	    	SerializableStringInterconverter interconverter = SerializableStringInterconverterHolder.getSingleton().findSerializableStringInterconverter(obj.getClass());
//	    	if(interconverter != null) {
//	    		return interconverter.convertToString(obj);
//	    	}
//	    	return null;
//	    }
	    
//	    protected static Serializable stringConvertToSerializable(String str, Class<? extends Serializable> toClass) {
//	    	SerializableStringInterconverter interconverter = SerializableStringInterconverterHolder.getSingleton().findSerializableStringInterconverter(toClass);
//	    	if(interconverter != null) {
//	    		return interconverter.stringToSerializable(str);
//	    	}
//	    	LOG.warn("SerializableStringInterconverter", toClass);
//	    	return null;
//	    }
}
