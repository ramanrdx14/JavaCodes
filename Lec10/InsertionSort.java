package Lec10;

public class InsertionSort {
    public static void insertLastElement(int[] arr,int i) {
    	int item = arr[i];
    	int j    = i-1;
    	while(j >= 0 && arr[j] > item) {
    		arr[j+1] = arr[j];
    		j--;
    	}
    	arr[j+1] = item;
    }
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		for(int i=1;i<arr.length;i++) {
			insertLastElement(arr, i);
		}
		for(int i:arr) {
			System.out.println(i+" ");
		}
	}

}
