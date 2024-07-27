package Lec10Assignment3;
import java.util.*;
public class InverseOfArray {
   public static  int[] inverseArray(int[] arr) {
	   int[] inverse = new int[arr.length];
	   for(int i=0;i<arr.length;i++) {
		   int swapIndex = arr[i];
		   inverse[swapIndex] = i;
	   }
	   return inverse;
   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		 arr = inverseArray(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
