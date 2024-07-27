package Lec8;

public class LinearSearch {
    
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		System.out.println(LinearSearch(arr, 30));
	}
	public static int LinearSearch(int[] arr,int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
