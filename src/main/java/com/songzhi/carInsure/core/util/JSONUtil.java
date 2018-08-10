package com.songzhi.carInsure.core.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JSONUtil extends JSONSerializer{
	private static Logger logger = Logger.getLogger(JSONUtil.class);
	
	
	public static String object2json(Object obj) {
		String res = JsonUtils.objToJson(obj);
		return res;
	}

	public static String bean2json(Object bean) {
		String res = JSON.toJSONString(bean);
		return res;
	}

	public static String list2json(List<?> list) {
		String res = JSON.toJSONString(list);
		return res;
	}

	public static String array2json(Object[] array) {
		String res = JSON.toJSONString(array);
		return res;
	}
	
	public static String map2json(Map<?, ?> map){
		String res=  JSON.toJSONString(map,false);
//		String res = JsonUtils.objToJson(map);
		return res;
	}

	public static String set2json(Set<?> set) {
		String res = JSON.toJSONString(set);
		return res;
	}
	
	public static Map<String, Object> parseJSON2Map(String jsonStr) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> list = null;
		// 最外层解析
		try {
			JSONObject json = JSONObject.fromObject(jsonStr);
			for (Object k : json.keySet()) {
				Object v = json.get(k);
				// 如果内层还是数组的话，继续解析
				if (v instanceof JSONArray) {
					list = new ArrayList<Map<String, Object>>();
					Iterator<JSONObject> it = ((JSONArray) v).iterator();
					while (it.hasNext()) {
						JSONObject json2 = it.next();
						list.add(parseJSON2Map(json2.toString()));
					}
					map.put(k.toString(), list);
				} else {
					map.put(k.toString(), v);
				}
			}
			return map;
		} catch (Exception e) {
			logger.error(CrmCommonUtils.getTrace(e));
		}finally{
			list = null;
		}
		return null;
	}
	
	public static Object jsonToObject(String json, Class clazz) {
		return JsonUtils.jsonToObj(json, clazz);
//        JSONObject obj = JSONObject.fromObject(json);
//        return JSONObject.toBean(obj, clazz);
    }
	/**
	 * trans json string to java object
	 * 
	 * @param json
	 * @param o
	 * @return
	 */
	public static Object getObjectfromJacksonJson(String json, Class<?> clazz) {
		Object obj = null;
		ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
		if(json == null || json.equals("")){
			return null;
		}
		try {
			obj = mapper.readValue(json, clazz);
		} catch (JsonParseException e) {
			logger.error(CrmCommonUtils.getTrace(e));
		} catch (JsonMappingException e) {
			logger.error(CrmCommonUtils.getTrace(e));
		} catch (IOException e) {
			logger.error(CrmCommonUtils.getTrace(e));
		}
		return obj;
	}
	/**
	 * String   @param s
	 * String   @return
	 */
	public static String twser(String s){
		return null;
	}
	public static ObjectMapper mapper;

    static {
    	JSONUtil.mapper = new ObjectMapper();
    }
	public static <T> Object readValue(String pContent, Object pObj) throws JsonParseException, JsonMappingException,
		IOException {
		return JSONUtil.mapper.readValue(pContent, (Class<T>) pObj);
	}
	public static String writeValue(Object pObj) throws JsonGenerationException, JsonMappingException, IOException {
        return JSONUtil.mapper.writeValueAsString(pObj);
   
	}
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static String listToObject(String jsstr,boolean isTpf){
		JSONObject paramObject = null;
		try {
			paramObject = JSONObject.fromObject(jsstr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if(paramObject.containsKey("responseObject")){
			JSONObject reso = paramObject.getJSONObject("responseObject");
			JSONArray ja  = null;
			Map ccc = new HashMap();
			if(isTpf){
				 ja = reso.getJSONArray("cvrg_list_tpf");
				reso.remove("cvrg_list_tpf");
				reso.put("cvrg_list_tpf_app", ja);
			}else{
				 ja = reso.getJSONArray("cvrg_list_biz");
				reso.remove("cvrg_list_biz");
				reso.put("cvrg_list_biz_app", ja);
			}
			
			for(int i=0;i<ja.size();i++){
				JSONObject jod = (JSONObject) ja.get(i);
				Object[] ks = jod.keySet().toArray();
				int alll = ks.length;
				Map ccc0 = new HashMap();
				for(int k = 0;k<ks.length;k++){
					String sks = (String) ks[k];
					if(StringUtils.isNotEmpty(String.valueOf(jod.get(sks)))){
						ccc0.put(sks, jod.get(sks));
					}
					
				}
				if(isTpf){
					ccc.put("tpf_"+jod.get("c_cvrg_no"), ccc0);
				}else{
					ccc.put("biz_"+jod.get("c_cvrg_no"), ccc0);
				}
				
			}
			if(isTpf){
				reso.put("cvrg_list_tpf", ccc);
			}else{
				reso.put("cvrg_list_biz", ccc);
			}
			return paramObject.toString();
		}
		return paramObject.toString();		
	}
	
}
