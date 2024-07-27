package Lec34_OOP3;

public class Pair_Generic<K,T> {
	K a;
	T b;
	public Pair_Generic(K a,T b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "a ->"+a+" b ->"+b;
	}
}
class Main{
	public static void main(String[] args) {
		Pair_Generic<String, Integer> p1 = new Pair_Generic<String, Integer>("Raman",101);
		Pair_Generic<String, Boolean> p2 = new Pair_Generic<String, Boolean>("Male", true);
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
