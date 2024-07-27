package Lec18;

public class PowerFunction {
    public static long pow(int n,int x) {
    	if(x == 0)return 1;
    	long rr = pow(n, x-1);  // recursion result
    	long ans= n * rr ; // bigger problem ka ans bnayenye recursion result se
    	return ans;
    }
	public static void main(String[] args) {
		System.out.println(pow(2, 5));
	}

}
