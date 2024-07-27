package Lec6Assignment2;
import java.util.*;
public class ArmStrong1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n      = sc.nextLong();
		long temp   = n;
		long countDigits = 0l;
		while(temp!=0) {
			temp = temp/10;
			countDigits++;
		}
		long sum = 0;
		temp    = n;
		while(temp!=0) {
			long rem = temp%10;
			sum     = sum + (int)Math.pow(rem, countDigits);
			temp    = temp/10;
		}
		if(n == sum) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
