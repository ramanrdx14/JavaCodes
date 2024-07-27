package Lec37;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> hs = new TreeSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(10);
		System.out.println(hs);
		System.out.println(hs.contains(10));
		System.out.println(hs.contains(99));
		System.out.println(hs.remove(10));
		System.out.println(hs);
		for(int i:hs)System.out.println(i);
	}

}
