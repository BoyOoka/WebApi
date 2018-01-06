package com.test.model;

import net.sf.json.JSONObject;

public class jsonDemo {
	public static void main(String[] args){
		JSONObject obj = new JSONObject();
		JSONObject obj2 = new JSONObject();
		JSONObject obj3 = new JSONObject();
		obj.element("name", "jack");
		obj.element("sex", "男");
//		obj.accumulateAll(arg0, arg1);
		obj2.element("name", "jack");
		obj2.element("sex", "男");
		obj2.accumulate("test", obj);
		obj3.element("class", obj);
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj3);
	}
}
