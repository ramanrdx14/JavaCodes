package Lec39Assignment9;
import java.util.*;
public class StringSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n     = sc.nextInt();
		ArrayList<Str> al = new ArrayList<>();
		for(int i=0;i<n;i++) {
			al.add(new Str(sc.next()));
		}
		Collections.sort(al,new CustomSort());
		for(Str str:al)System.out.println(str);
	}
}
class Str{
	String s;
	public Str(String s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return this.s;
	}
}
class CustomSort implements Comparator<Str>{

	@Override
	public int compare(Str o1, Str o2) {
		if(o1.s.startsWith(o2.s))return o2.s.compareTo(o1.s);
		return o1.s.compareTo(o2.s);
	}
	
}
