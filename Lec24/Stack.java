package Lec24;

public class Stack {
	private int[] arr;
	private int idx = -1;
	public Stack() {
		arr = new int[5];
	}
	public Stack(int n) {
		arr = new int[n];
		
	}
	public boolean isEmpty() {
		if(idx == -1) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return idx+1;
	}
	
	public void push(int data) throws Exception {
		if(size() == arr.length) {
				throw new Exception("Stack is Full");
		}
		idx++; //-1 se 0 hoga idx ka value pehle fir data fill
		arr[idx] = data;
		
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int temp = arr[idx];
		idx--;
		return temp;
	}
	
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return arr[idx];
	}
	
}
