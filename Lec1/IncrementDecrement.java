package Lec1;

public class IncrementDecrement {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a++); //Post increment
		System.out.println(a);
		int b = 6;
		System.out.println(b--); //Post decrement
		System.out.println(b);
		int x = 6;
		
		System.out.println(++x);
		System.out.println(x);
		
		//Questions :
		int m = 2;
		int ans = m++ + 10 + --m + 7 + --m + m++;
		System.out.println(ans);
	}

}
