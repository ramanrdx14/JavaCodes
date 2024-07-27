package Lec25;
import java.util.*;
public class Construct_Smallest_Number_From_DI_String {
	public String smallestNumber(String pattern) {
        int n = pattern.length();
        int[] arr = new int[n+1];
        Stack<Integer> s = new Stack<>();
        int count = 1;
        for(int i=0;i<=n;i++){
            if(i == n || pattern.charAt(i) == 'I'){
                arr[i] = count;
                count ++;
                while(!s.isEmpty()){
                    arr[s.pop()] = count;
                    count++;
                }
                
            }else{
                s.push(i);
            }
        }
        String str = "";
        for(int i=0;i<arr.length;i++){
            str+=arr[i];
        }
		return str;
	}
	public static void main(String[] args) {
		

	}

}
