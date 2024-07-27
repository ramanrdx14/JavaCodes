package Lec10;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
    	for(int i=1;i<arr.length;i++) {
    		for(int j=0;j<arr.length-i;j++) {
    			if(arr[j] > arr[j+1]) {
    				int temp = arr[j];
    				arr[j]   = arr[j+1];
    				arr[j+1] = temp;
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,-1,-2,-3,-4};
		bubbleSort(arr);
        for(int i:arr) {
        	System.out.print(i+" ");
        }
	}

}
