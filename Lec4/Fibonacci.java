package Lec4;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		int  a= 0;
		int  b= 1;
		Scanner sc = new Scanner(System.in);
		int  n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			int c = a+b;
			a     = b;
			b     = c;
		}
		System.out.println(a);

	}

}
