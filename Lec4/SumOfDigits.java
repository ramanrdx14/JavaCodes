package Lec4;

public class SumOfDigits {

	public static void main(String[] args) {
		int n = 3846;
		int sum = 0;
		while(n!=0) {
			int rem = n%10;
			sum+=rem;
			n = n/10;
		}
		System.out.println(sum);
	}

}
