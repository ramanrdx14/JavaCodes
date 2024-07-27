package Lec8;

public class ReverseArray {
    
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		while(i <= j) {
			int temp = arr[i];
			arr[i]   = arr[j];
			arr[j]   = temp;
			i++;
			j--;
		}
	}
}
