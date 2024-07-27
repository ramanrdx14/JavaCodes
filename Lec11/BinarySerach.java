package Lec11;

public class BinarySerach {
    public static int search(int[] arr,int X) {
    	int lo = 0;
    	int hi = arr.length -1;
    	while(lo <= hi) {
    		int mid = (lo+hi)/2;
    		if(arr[mid] == X) {
    			return mid;
    		}else if(arr[mid] > X) {
    			hi = mid -1;
    		}else {
    			lo = mid + 1;
    		}
    	}
    	return -1;
    }
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,7,8,13,14,15,16};
		int item  = 13;
		System.out.println(search(arr,item));
	}

}
