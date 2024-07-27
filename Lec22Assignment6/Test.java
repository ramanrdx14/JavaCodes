package Lec22Assignment6;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		int[] arr = {1 ,3 ,4 ,2 ,2,2};
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			}else {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
		}
		System.out.println(hm);
		int maxi = Integer.MIN_VALUE;
		int maxvalue = Integer.MIN_VALUE;
		for(int i:hm.keySet()) {
			if(hm.get(i) > maxi) {
				maxi     = hm.get(i);
				maxvalue = i;
			}
		}
		System.out.println(maxvalue);
		
		
	}

}
