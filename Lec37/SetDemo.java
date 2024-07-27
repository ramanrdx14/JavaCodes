package Lec37;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
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
