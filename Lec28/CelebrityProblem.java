package Lec28;

import java.util.Stack;

public class CelebrityProblem {
	
	//BruteForce Tarika
    public static int celebrityProbleamBruteforce(int[][] arr,int n) {
    	for(int i=0;i<n;i++){
    	    boolean b = true;
    	    for(int j=0;j<n;j++){   //check karenge ki sara row 0 hai na 
    	        if(arr[i][j] == 1 &&  i != j ){
    	            b = false;
    	        }
    	    }
    	    if(b){  // agar row 0 hai to sara column ko chek krenge agar sara column
    	           //  1 hoga to return i krnge ki wohe celebrity h 
    	        for(int k=0;k<n;k++){
    	            if(arr[k][i] !=1 && k!=i){
    	                b = false;
    	            }
    	        }
    	    }
    	    if(b) return i;
    	}
    	return -1;
    }
    	
    
    public static int StackSolving(int[][] arr) {
    	Stack<Integer> stack = new Stack<>();
    	for(int i=0;i<arr.length;i++) {
    		stack.push(i);
    	}
    	
    	
    	//Elemination Round
    	while(stack.size() > 1) {
    		int firstElementIndex =  stack.pop();
    	    int secondElementIndex=  stack.pop();
    	    if(arr[firstElementIndex][secondElementIndex] == 1) {
    	    	stack.push(secondElementIndex);
    	    }else {
    	    	stack.push(firstElementIndex);
    	    }
    	}
    	int celebrity = stack.pop();
    	boolean b = true;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[celebrity][i] == 1 && celebrity != i) {
    			b = false;
    		}
    	}
    	for(int i=0;i<arr[0].length;i++) {
    		if(arr[i][celebrity] != 1 && celebrity != i) {
    			b = false;
    		}
    	}
    	if(b) {
    		return celebrity;
    	}
    	return -1;
    }
    
	public static void main(String[] args) {
	int[][] arr = {{0, 1 ,0},
	         	   {0 ,0 ,0}, 
	               {0 ,1 ,0}};
	System.out.println(StackSolving(arr));

	}

}
