package Lec10Assignment3;
import java.util.*;
public class TargetSumPairs {
    public static void pairSum(int[] arr,int sum) {
    	Arrays.sort(arr);
    	int left = 0;
    	int right = arr.length - 1;
    	while(left<= right) {
    		if(arr[left]+arr[right] > sum) {
    			right --;
    		}else if(arr[left]+arr[right] < sum) {
    			left ++;
    		}else {
    			System.out.println(arr[left]+" and "+arr[right]);
    			left++;
    			right--;
    		}
    	}
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		pairSum(arr,sum);
	}

}
