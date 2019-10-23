package com.bdi.test.test01;

import java.util.HashMap;
import java.util.Map;

public class Member02 {
	public static void run() {
		// "map"을 사용하고 싶으면 parameter 조건을 똑같이 맞춰주면 사용가능
		// ERROR
//		map.put("a", "b");
	}
	
	public static void test(Map<String, String> map2) {
		map2.put("a", "b");
		int a = map2.size();
		System.out.println(map2);
	}
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		test(map); // {a=b}
	}
}
