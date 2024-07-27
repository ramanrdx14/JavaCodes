package Lec22;

public class PrimeSeive {
    public static void  print(int n) {
    	int[] arr = new int[n+1];
    	for(int i=2;i<=n;i++) {
    		for(int j=2;j*i<=n;j++) {
    			arr[i*j] = Integer.MIN_VALUE;    		}
    	}
    	for(int i=2;i<=n;i++) {
    		if(arr[i] != Integer.MIN_VALUE) {
    			System.out.print(i+" ");
    		}
    	}
    }
	public static void main(String[] args) {
		print(10);

	}

}
