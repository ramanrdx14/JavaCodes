package Lec29;

public class LinkedListClient {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
//		ll.AddFirst(10);
//		ll.AddFirst(20);
//		ll.AddFirst(30);
//		ll.AddFirst(40);
//		ll.AddFirst(50);
//		ll.display();
		
		ll.AddLast(100);
		ll.AddLast(200);
		ll.AddLast(300);
		ll.AddLast(400);
		ll.AddLast(500);
		ll.display();
		
		ll.AddAt(99, 3);
		ll.display();
		
		ll.removeFirst();
		ll.display();
		
		ll.removeLast();
		ll.display();
		
		ll.removeAtIndex(1);
		ll.display();
		
	}
}
