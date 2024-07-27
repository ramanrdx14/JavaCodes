package Lec22Assignment6;
import java.util.*;
public class SplitArray {
	static int count = 0;
    public static void splitArray(int[] arr,int si,int sum1,int sum2,String result1,String result2) {
        if(si == arr.length) {
    	if(sum1 == sum2) {
        	System.out.println(result1+" and "+result2);
        	count++;
        	return;
         }else {
        	 return;
         }
        }
        
        //include ka result layega 
    	splitArray(arr, si+1, sum1+arr[si], sum2,result1+arr[si]+" ",result2);
    	//not include ka result layega
    	splitArray(arr, si+1, sum1, sum2+arr[si],result1,result2+arr[si]+" ");
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[] arr  = new int[n];
		int sum2  = 0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum2   += arr[i];
		}
		splitArray(arr, 0,0,0,"","");
		System.out.println(count);
	}

}
