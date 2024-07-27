package Lec10;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i]   = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		selectionSort(arr);
        for(int i:arr) {
        	System.out.print(i+" ");
        }
	}

}
