package com.songzhi.carInsure.web.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.log4j.Logger;

public class ConvertPoToVoUtil {
	private static Logger log = Logger.getLogger(ConvertPoToVoUtil.class);

	public static <T> T ConvertPoToVo(T source, T dest, String sourceClassName, String destClassName) throws Exception {
		// 读取source对象中的属性值
		Class<? extends Object> sourceClass = source.getClass();
		Field[] fields = sourceClass.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			// field.getName();
			// field.getType();
			// field.get(field.getName());
			// log.debug(field.getName());
			// log.debug(field.getType());
			// log.debug(field.get(field.getName()));
			Object obj = field.get(source);
			if (obj instanceof String) {
				log.debug("string类:" + field.get(source));

			} else if (obj instanceof Integer) {
				int value = (Integer) obj;
				log.debug("Integer类：" + value);
			} else if (obj instanceof Date) {
				Date value = (Date) obj;
				log.debug("Date类：" + value);
			} else {

			}
			{
				log.debug("other其他类！");
			}
		}
		// 读取目标对象属性值

		// 赋值，将原对象属性值赋给目标对象属性值

		// log日志输出所有对象属性值

		return (T) source;
	};

	public static <T> T myConvertPoToVo(Object source, Class<T> dest) throws Exception {

		T t = null;
		if (dest != null && source != null) {
			// 得到原所有属性
			Field[] declaredFields = source.getClass().getDeclaredFields();
			t = dest.newInstance();
			Field[] fields = dest.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				String key = field.getName();
				// 保存原class和目标class是否存在相同属性状态,
				// false为不存在，true表示存在相同属性
				Boolean flag = false;
				for (Field field2 : declaredFields) {
					if (field2.getName().equals(key)) {
						flag = true;
						break;
					}
				}
				if (flag == true) {
					try {
						Field field1 = source.getClass().getDeclaredField(key);
						// 实际上setAccessible是启用和禁用访问安全检查的开关,并不是为true就能访问为false就不能访问
						field1.setAccessible(true);
						Object val = field1.get(source);
						// 将原class中的值赋值给目标class中
						field.set(t, val);
					} catch (Exception e) {
						System.err.println(source.getClass().getName() + "没有该属性: " + key);
					}
				}

			}
		}
		return t;
	}

	public static <T> T myConvertPoToVo2(Object source, Class<T> dest) throws Exception {

		T t = null;
		if (dest != null && source != null) {
			// 得到原所有属性
			Field[] declaredFields = source.getClass().getDeclaredFields();
			t = dest.newInstance();
			// Class cc = dest.getClass();
			// t = dest.cast(t);

			Field[] fields = dest.getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				String key = field.getName();
				// 保存原class和目标class是否存在相同属性状态,
				// false为不存在，true表示存在相同属性
				Boolean flag = false;
				for (Field field2 : declaredFields) {
					if (field2.getName().equals(key)) {
						flag = true;
						break;
					}
				}
				if (flag == true) {
					try {
						Field field1 = source.getClass().getDeclaredField(key);
						// 1.获取原对象中属性对应的get方法，并取出属性对应的值
						Object methodValue = getMethodValue(source, field1.getName());
						log.debug(methodValue);
						// 2.根据目标属性对应的set方法，将刚刚获取的原对象属性的值赋值到目标对象的属性中
						setMethodValue(t, field1.getName(), methodValue);

					} catch (Exception e) {
						System.err.println(source.getClass().getName() + "没有该属性: " + key);
					}
				}

			}
		}
		return t;
	}

	public static Object getMethodValue(Object obj, String methodName) throws Exception {
		methodName = "get" + upperFirst(methodName);
		Method method = getTargetMethod(obj, methodName);
		return method.invoke(obj, null);
	}

	public static void setMethodValue(Object obj, String methodName, Object value) throws Exception {
		methodName = "set" + upperFirst(methodName);
		Method method = getTargetMethod(obj, methodName);
		Object[] params = { value };
		method.invoke(obj, params);
	}

	private static String upperFirst(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
	}

	public static Method getTargetMethod(Object facade, String facadeMethod) {
		Class type = facade.getClass();
		Method methods[] = type.getMethods();
		for (int i = 0; i < methods.length; i++) {
			if (facadeMethod.equals(methods[i].getName())) {
				Class[] paramTypes = methods[i].getParameterTypes();
				if (null == paramTypes || 0 == paramTypes.length || 1 == paramTypes.length) {
					return methods[i];
				} else {
					// 只调用参数个数为0或者1的方法，其他忽略
					continue;
				}
			}
		}
		throw new RuntimeException("Invalid target method " + facadeMethod + " In Class" + facade);
	}
//
//
//	public static void main(String[] args) throws Exception {
//		TUser t = new TUser();
//		t.setId(12);
//		t.setUsername("张三");
//		t.setPassword("123");
//		UserVo userVo = new UserVo();
//		userVo.setToken("56789865678");
//
//		userVo = myConvertPoToVo2(t, userVo.getClass());
//
//		Integer id = userVo.getId();
//		log.debug(id);
//		log.debug("token:" + userVo.getToken());
//	}

}
