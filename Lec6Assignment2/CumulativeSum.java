package Lec6Assignment2;
import java.util.*;
public class CumulativeSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum    = 0;
		while(true) {
		int n      = Integer.parseInt(sc.next());
			sum    = sum + n;
			if(sum >= 0) {
				System.out.println(n);
			}else {
				break;
			}
		}
	}
}
