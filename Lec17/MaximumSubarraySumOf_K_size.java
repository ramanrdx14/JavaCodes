package Lec17;

public class MaximumSubarraySumOf_K_size {
    
	public static void main(String[] args) {
		//Bruteforce 
		int[] arr = {2,3,1,4,7,2,6,4,5};
		int  k    = 3;
		for(int i=0;i<=arr.length-k;i++) {
			for(int j=i;j<i+k;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		
		//har ek ka sum kro jo maximum hoga wohe apna anshoga

	}

}
