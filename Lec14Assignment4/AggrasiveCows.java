package Lec14Assignment4;
import java.util.Arrays;
import java.util.Scanner;

public class AggrasiveCows {
    public static void AggrasiveCows(int[] arr,int cows) {
    	Arrays.sort(arr);  //Kyu ki barn mera straight line mai hai mtlb inscreasing order mai
    					  //distance hoga isliye sort liye
    	
    	int lo = 0;
    	int hi = arr[arr.length-1];
    	int ans= 0;
    	while(lo <= hi) {
    		int mid = (lo+hi)/2;
    		if(isItPossibleToPlaceCows(arr,mid,cows)) {
    			ans= mid;
    			lo = mid + 1;
    		}else {
    			hi = mid - 1;
    		}
    	}
    	System.out.println(ans);
    }
    public static boolean isItPossibleToPlaceCows(int[] arr,int mid,int cows) {
    	int cowSitted = 1;
    	int i         = 1;
    	int pos       = 0;
    	while(i < arr.length) {
    		if(arr[i] - arr[pos] >= mid) {
    			cowSitted ++;
    			pos = i;
    		}
    		if(cowSitted == cows) {
    			return true;
    		}
    		i++;
    	}
    	return false;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int c      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		AggrasiveCows(arr,c);
	}

}
