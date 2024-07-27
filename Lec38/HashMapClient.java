package Lec38;

public class HashMapClient {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("1", 1);
		hm.put("2", 2);
		System.out.println(hm.get("1"));
		System.out.println(hm.get("2"));
		hm.put("2", 1);
		System.out.println(hm.get("2"));
		System.out.println(hm.remove("2"));
		System.out.println(hm.get("2"));
		
	}

}
