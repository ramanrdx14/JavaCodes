package Lec37;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("Raman", 100);
		map.put("Deep", 89);
		map.put("Singh", 98);
		map.put("Ashish", 60);
		System.out.println(map);
		System.out.println(map.get("Raman"));
		System.out.println(map.get("dhruv"));
		System.out.println(map.containsKey("Raman"));
		System.out.println(map.containsKey("Raja"));
	}
}
