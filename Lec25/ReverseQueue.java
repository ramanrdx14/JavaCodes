package Lec25;

import java.util.LinkedList;
import java.util.Stack;

import Lec24.Queue;
import Lec24.Queue;
public class ReverseQueue {

	public static void main(String[] args) throws Exception {
		Queue q = new Queue(1000);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.display();
		System.out.println();
		reverseQueue(q);
		q.display();
	}

	private static void reverseQueue(Queue q) throws Exception {
		if(q.isEmpty()) {
			return;
		}
		int item = q.dequeue(); // stack building
		reverseQueue(q);
		q.enqueue(item);       // stack failing
	}

}
