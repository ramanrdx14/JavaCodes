package Lec6Assignment2;
import java.util.*;
public class BostonNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long     n  = sc.nextLong();
		long i      = 2l;
		long sum    = 0l;
		long temp   = n;
		while(i <= (long)Math.sqrt(n)) {
			if(temp%i == 0) {
				long k = i;
				while(k>0) {
					long rem = k%10;
					sum+=rem;
					k/=10;
				}
				temp = temp/i;
				continue;
			}else {
				i++;
			}
		}
		
		if(temp != 1) {
		while(temp != 0) {
			long rem = temp%10;
			sum+=rem;
			temp/=10;
		 }
		}
		long digitSum = 0l;
		while(n>0) {
			long rem = n%10;
			digitSum+=rem;
			n/=10;
		}
		if(digitSum == sum) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
