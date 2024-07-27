package Lec10Assignment3;
import java.util.*;
public class MaximumSumPathOfTwoArrays {
    public static int sumpath(int[] arr1,int[]arr2) {
    	int i =0;
    	int j = 0;
    	int ithSum = 0;
    	int jthSum = 0;
    	int finalans=0;
    	while(i < arr1.length && j < arr2.length) {
    		if(arr1[i] < arr2[j]) {
    			ithSum+=arr1[i];
    			i++;
    		}else if(arr2[j] < arr1[i]) {
    			jthSum+=arr2[j];
    			j++;
    		}else {
    			finalans = finalans+Math.max(ithSum, jthSum)+arr1[i];
    			i++;
    			j++;
    			ithSum = 0;
    			jthSum = 0;
    		}
    	}

    	while(i < arr1.length) {
    		ithSum+=arr1[i];
    		i++;
    	}

    	while(j < arr2.length) {
    		jthSum+=arr2[j];
    		j++;
    	}
    	finalans +=Math.max(ithSum, jthSum);
    	return finalans;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t-->0) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int[] arr1= new int[X];
			int[] arr2= new int[Y];
			for(int i=0;i<X;i++) {
				arr1[i] = sc.nextInt();
			}
			for(int i=0;i<Y;i++) {
				arr2[i] = sc.nextInt();
			}
			System.out.println(sumpath(arr1,arr2));
		}
	}

}
