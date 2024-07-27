package Lec19;

public class FiboNacci {

	    public static int fibo(int n) {
	    	if(n == 0 || n == 1) {
	    		return n;
	    	}
	    	int fibon1 = fibo(n-1);
	    	int fibon2  = fibo(n-2);
	    	return fibon1 + fibon2;
	    }
		public static void main(String[] args) {
			System.out.println(fibo(12));
		}

}
