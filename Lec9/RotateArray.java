package Lec9;

public class RotateArray {
    public static void rotateArray(int[] arr,int k) {
    	for(int j=1;j<=k;j++) { //k steps
    	int item = arr[arr.length-1]; //take last element and place to the item
    	for(int i=arr.length-2;i>=0;i--) {
    		arr[i+1] = arr[i];
    	}
    	arr[0] = item; //place the last item in 0th index
    	}
    }
    public static void rotateArrayOptimal(int[] arr,int i,int j) {
    	while(i <= j) {
    		int temp = arr[i];
    		arr[i]   = arr[j];
    		arr[j]   = temp;
    		i++;
    		j--;
    	}
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int k     = 3;
		//rotateArray(arr, 3);
		rotateArrayOptimal(arr,0,arr.length-1); //rotate n-1 elements
		rotateArrayOptimal(arr, 0, k-1); //rotate [0 - k-1] elements
		rotateArrayOptimal(arr, k, arr.length-1); //rotate [k - n-1] elements
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
