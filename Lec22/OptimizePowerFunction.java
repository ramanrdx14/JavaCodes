package Lec22;

public class OptimizePowerFunction {
    public static int power(int x,int n) {
    	if(n == 0) {
    		return 1;
    	}
    	if(n%2 == 0) {
    		int evenans = power(x,n/2)*power(x,n/2);
    		return evenans;
    	}else {
    		int oddans  = power(x,n/2)*power(x,n/2)*x;
    		return oddans;
    	}
    }
	public static void main(String[] args) {
		System.out.println(power(99,3));
	}

}
