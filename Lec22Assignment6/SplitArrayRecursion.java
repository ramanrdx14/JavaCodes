package Lec22Assignment6;

public class SplitArrayRecursion {
	public static void split(int[] arr,int si,String res,int halfsum) {
		
		if(halfsum == 0) {
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<arr.length;i++) {
				sb.append(arr[i]);
			}
			
			for(int j=0;j<res.length();j++) {
				sb.deleteCharAt(sb.indexOf(res.charAt(j)+""));
			}
			System.out.println(res+" and "+sb.toString()); 
			return;
		}
		if(si == arr.length) {
			return;
		}
		split(arr, si+1, res+arr[si],halfsum-arr[si]);
		split(arr, si+1, res,halfsum);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,5};
		split(arr, 0, "", 9);
	}
}
