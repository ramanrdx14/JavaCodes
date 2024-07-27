package Lec22;

public class Merge_two_SortedArray {
    public static int[] mergeTwoSortedArray(int[]arr1,int[] arr2) {
    	int[] arr3 = new int[arr1.length+arr2.length];
    	int i = 0;
    	int j = 0;
    	int k = 0;
    	while(i < arr1.length && j < arr2.length) {
    		if(arr1[i] <= arr2[j]) {
    			arr3[k] = arr1[i];
    			k++;
    			i++;
    		}else if(arr2[j] <= arr1[i]) {
    			arr3[k] = arr2[j];
    			k++;
    			j++;
    		}
    	}
    	while(i < arr1.length) {
    		arr3[k] = arr1[i];
    		i++;
    		k++;
    	}
    	while(j < arr2.length) {
    		arr3[k] = arr2[j];
    		j++;
    		k++;
    	}
    	return arr3;
    }
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,8,11};
		int[] arr2 = {1,2,5,6,9,11,13,14};
		int[] ans  = mergeTwoSortedArray(arr1,arr2);
		for(int i:ans) {
			System.out.print(ans[i]+" ");
		}
	}

}
