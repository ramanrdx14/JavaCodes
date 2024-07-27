package Lec22;

public class MergeSort {
    public static int[] mergeSort(int[] arr,int lo,int hi) {
    	if(lo == hi) {
    		int[] baseResult = new int[1];
    		baseResult[0]    = arr[lo];
    		return baseResult;
    	}
    	
    	int mid= (lo+hi)/2;
    	int[] arr1rr = mergeSort(arr, lo, mid);
    	int[] arr2rr = mergeSort(arr, mid+1, hi);
    	int[] finalReuslt =  mergeTwoSortedArray(arr1rr, arr2rr);
    	return finalReuslt;
    	
    }
    public static int[] mergeTwoSortedArray(int[]arr1,int[] arr2) {
    	int[] arr3 = new int[arr1.length+arr2.length];
    	int i = 0;
    	int j = 0;
    	int k = 0;
    	while(i < arr1.length && j < arr2.length) {
    		if(arr1[i] <= arr2[j]) {
    			arr3[k] = arr1[i];
    			k++;
    			i++;
    		}else if(arr2[j] <= arr1[i]) {
    			arr3[k] = arr2[j];
    			k++;
    			j++;
    		}
    	}
    	while(i < arr1.length) {
    		arr3[k] = arr1[i];
    		i++;
    		k++;
    	}
    	while(j < arr2.length) {
    		arr3[k] = arr2[j];
    		j++;
    		k++;
    	}
    	return arr3;
    }
	public static void main(String[] args) {
		int[] arr = {10,1,-2,20,15,17,11};
		arr       = mergeSort(arr, 0, arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
