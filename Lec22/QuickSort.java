package Lec22;

public class QuickSort {
    public static void quickSort(int[] arr,int lo ,int hi) {
    	int mid = (lo+hi)/2;
    	int pivit = arr[mid];
    	int left  = lo;
    	int right = hi;
    	if(lo >= hi) {
    		return;
    	}
    	while(left <= right) {
    		while(arr[left] < pivit) {
    			left++;
    		}
    		while(arr[right] > pivit) {
    			right--;
    		}
    		if(left <= right) {
    			int temp = arr[left];
    			arr[left]= arr[right];
    			arr[right]= temp;
    			left++;
    			right--;
    		}
    	}
    	quickSort(arr, lo, right);
    	quickSort(arr, left, hi);
    }
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,4,5,6,70,80,90};
		quickSort(arr, 0, arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
