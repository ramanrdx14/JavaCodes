package Lec10Assignment3;

import java.util.Scanner;

public class ColorSort {
    public static void sortColors(int[] nums) {
    	int lo = 0;
    	int hi = nums.length - 1;
    	int i  = 0;
    	while(i <= hi) {
    		if(nums[i] == 0) {
    			int temp = nums[i];
    			nums[i]  = nums[lo];
    			nums[lo] = temp;
    			i++;
    			lo++;
    		}else if(nums[i] == 2) {
    			int temp = nums[i];
    			nums[i]  = nums[hi];
    			nums[hi] = temp;
    			hi--;
    		}else {
    			i++;
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
		sortColors(arr);
		for(int i:arr) {
			System.out.println(i+" ");
		}

	}

}
