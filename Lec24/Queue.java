package Lec24;

public class Queue {
	int[] arr;
	int front=0;
	int size=0;
	public Queue() {
		arr = new int[5];
	}
	public Queue(int n) {
		arr = new int[n];
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	public void enqueue(int data) throws Exception {
		if(size() == arr.length) {
			throw new Exception("Queue is Full");
		}
		
		//arr[size] = data;   ye galat hoga front + size kro hojaiga 
		arr[(front+size)%arr.length] = data;  //aise lene se linear queue hoga aur mod arr.length lelene to circular queue hojaiga
		size++;
	}
	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int temp = arr[front];
		front = (front + 1) % arr.length; // queue ko linear banane k liye
		size--;
		return temp;
	}
	public int getFront() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		return arr[front];
	}
	
	public int size() {
		return size;
	}
	
	public void display() {
		for(int i=0;i<size;i++) {
			int idx = (front + i)%arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
}
