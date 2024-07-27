package Lec4;

public class Hcf {

	public static void main(String[] args) {
		int divisor =  60;
		int divident = 36;
		while(divident%divisor != 0) {
			int rem  = divident%divisor;
			divident = divisor;
			divisor  = rem;
		}
		System.out.println(divisor);
	}

}
