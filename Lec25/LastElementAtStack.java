package Lec25;
import java.util.*;
public class LastElementAtStack {
    public static void insertLastElement(Stack<Integer> stack,int x) {
    	if(stack.isEmpty()) {
    		stack.push(x);
    		return;
    	}
    	int item = stack.pop();
    	insertLastElement(stack, x);
    	stack.push(item);
    }
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		int x            = -6;
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);
		insertLastElement(s,x);
		System.out.println(s);
		
	}

}
