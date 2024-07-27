package Lec22;

public class ArrayPartition {
    public static int partition(int[] arr) {
    	int pivit = arr[arr.length-1];
    	int left  = 0;
    	int right = arr.length-1;
    	while(left <= right) {
    		while(arr[left] < pivit) {
    			left++;
    		}
    		while(arr[right] > pivit) {
    			right--;
    		}
    		if(left <= right) {
    			int temp = arr[right];
    			arr[right]= arr[left];
    			arr[left]= temp;
    			left++;
    			right--;
    		}
    	}
    	return right;
    }
	public static void main(String[] args) {
	int[] arr = {10,9,7,6,5,4,3,2,1,8};
	int index = partition(arr);
	for(int i:arr)
		{
		System.out.print(i+" ");
		}
	System.out.println();
	System.out.println(index);
	}
}
