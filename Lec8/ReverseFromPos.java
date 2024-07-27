package Lec8;

public class ReverseFromPos {

	public static void main(String[] args) {
		//revrse from pos (3 - 6) OP 10 20 30 70 60 50 40 80 90
		int[] arr = {10,20,30,40,50,60,70,80,90};
		reverse(arr,3,6);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void reverse(int[] arr,int i,int j) {
		while(i <= j) {
			int temp = arr[i];
			arr[i]   = arr[j];
			arr[j]   = temp;
			i++;
			j--;
		}
	}

}
