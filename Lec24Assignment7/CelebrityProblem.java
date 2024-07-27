package Lec24Assignment7;
import java.util.*;
public class CelebrityProblem {
    public static int findCelebrity(int[][] arr) {
    	Stack<Integer> stack = new Stack<>();
    	for(int i=0;i<arr.length;i++) {
    		stack.push(i);
    	}
    	
    	//Elemination round;
    	
    	while(stack.size() > 1) {
    		int candidate1 = stack.pop();
    		int candidate2 = stack.pop();
    		if(arr[candidate1][candidate2] == 1) {
    			stack.push(candidate2);
    		}else {
    			stack.push(candidate1);
    		}
    	}
    	int finalcandidate = stack.pop();
    	for(int i=0;i<arr.length;i++) {
    		if(arr[finalcandidate][i] == 1) {
    			return -1;
    		}
    	}
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i][finalcandidate] == 0) {
    			return -1;
    		}
    	}
    	return finalcandidate;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		int[][] arr= new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(findCelebrity(arr));
	}
}
