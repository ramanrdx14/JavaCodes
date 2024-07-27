package Lec27;
import java.util.*;
public class Largest_Rectangle_In_Histogram {
public static void largestRectangleArea(int[] heights) {
	    int n = heights.length;
	    int left[] = new int[n];
	    int[] right = new int[n];
	    int ans    = 0;
	    Stack<Integer> stack = new Stack<>();
	    //finding nextsmaller right
	    for(int i=0;i<n;i++) {
	    	while(!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
	    		right[stack.pop()] = i;
	    	}
	    	stack.push(i);
	    }
	    while(!stack.isEmpty()) {
	    	right[stack.pop()] = n;
	    }
	    
	  //finding nextsmaller left
	    
	    for(int i=n-1;i>=0;i--) {
	    	while(!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
	    		left[stack.pop()] = i;
	    	}
	    	stack.push(i);
	    }
	    while(!stack.isEmpty()) {
	    	left[stack.pop()] = -1;
	    }
	    
	    for(int i=0;i<heights.length;i++) {
	    	int labelleft = right[i] - left[i]- 1;
	    	ans = Math.max(ans, heights[i] * labelleft);
	    }
	    System.out.println(ans);
	   
    } 
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		largestRectangleArea(arr);
	}
	
}
