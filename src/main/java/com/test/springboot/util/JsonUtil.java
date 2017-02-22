/**
 * @Title: JsonUtil.java 
 * @Package: com.test.springboot.util 
 * @Description: TODO
 * @date: 2017年1月15日
 * @author:  wangkui
 */
package com.test.springboot.util;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

/**
 * @ClassName: JsonUtil 
 * @Description: 
 * @author: Administrator
 * @date: 2017年1月15日
 */
public class JsonUtil {

	// 将Json数组解析成相应的映射对象列表
	public static <T> List<T> parseJsonArrayWithGson(String json, Class<T> clazz) {
		List<T> lst = new ArrayList<T>();

		JsonArray array = new JsonParser().parse(json).getAsJsonArray();
		for(final JsonElement elem : array){
		lst.add(new Gson().fromJson(elem, clazz));
		}

		return lst;

	}
}
