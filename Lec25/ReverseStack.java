package Lec25;

import java.util.Stack;

public class ReverseStack {
	
    public static void reverse(Stack<Integer> stack) {
    	if(stack.size() == 0) {
    		return;  // 1 2 3 4 5 
    	}
    	int pop = stack.pop();
    	reverse(stack);//reverse recursiove call   
    	insertElementAtEnd(stack, pop);//append element at last
    }
    public static void insertElementAtEnd(Stack<Integer> stack,int n) {
    	if(stack.size() == 0) {
    		stack.push(n);
    		return;
    	}
    	int pop = stack.pop();
    	insertElementAtEnd(stack,n);
    	stack.push(pop);
    }
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);
		reverse(s);
		System.out.println(s);

	}

}
