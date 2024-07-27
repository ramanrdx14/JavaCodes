package Lec27;
import java.util.*;
public class StockSpan {
	public static void main(String args[])  {
		   Scanner sc = new Scanner(System.in);
		   int n      = sc.nextInt();
		   int[] arr  = new int[n];
		   for(int i=0;i<n;i++){
			   arr[i] = sc.nextInt();
		   }

		   Stack<Integer> stack = new Stack<>();
		   for(int i=0;i<n;i++){
			   	while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
					   	stack.pop();
				   }
				   if(stack.isEmpty()){
					   System.out.print(i+1+" ");
				   }else{
					   System.out.print(i-stack.peek()+" ");
				   }
				   stack.push(i);
			}
			System.out.print("END");
		}
}
