package Lec29;

public class LinkedList {
	class Node{
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	public int size;
	
	//O(1)
	public void AddFirst(int data) {
		Node node = new Node();
		node.data = data;
		if(size == 0) {
			head = node;
			tail = node;
			size++;
		}else {
			node.next = head;
			head      = node;
			size++;
		}
		
	}
	
	//O(1)
	public void AddLast(int data) {
		Node node = new Node();
		node.data = data;
		if(size == 0) {
			head = node;
			tail = node;
			size++;
		}else {
			tail.next = node;
			tail      = node;
			size++;
		}
	}
	
	
	//O(N)
	public void AddAt(int item , int k) {
		if(k == 0) {
			AddFirst(k);
		}else if(k == size) {
			AddLast(k);
		}else {
			Node node = new Node();
			node.data = item;
			Node prevnode = getNode(k-1);
			node.next     = prevnode.next;
			prevnode.next = node;
			size++;
			
		}
	}
	
	
	public int getFirst() {
		return head.data;
	}
	
	public int getLast() {
		return tail.data;
	}
	
	public int getIndex(int k) {
		return getNode(k).data;
	}
	
	
	//O(1)
	public int removeFirst() {
		int rv  = head.data;
		if(size == 1) {
			head = null;
			tail = null;
		}else {
			Node temp = head;
			head      = head.next;
			temp.next = null;
		}
		size--;
		return rv;
	}
	
	//O(N)
	public int removeLast() {
		int rv = tail.data;
		if(size == 1) {
			return removeFirst();
		}
		Node second_last_node = getNode(size-2);
		second_last_node.next = null;
		tail = second_last_node;
		size--;
		
		return rv;
	}
	
	
	public int removeAtIndex(int k) {
		if(k == 0) {
			return removeFirst();
		}else if(k == size) {
			return removeLast();
		}else {
			Node first_last_index = getNode(k-1);
			int rv                = first_last_index.data;
			first_last_index.next = first_last_index.next.next;
			return rv;
		}
	}
	
	
	//O(N)
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"--->");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	public Node getNode(int k) {
		Node temp = head;
		while(k -- > 0) {
			temp = temp .next;
		}
		return temp;
	}
}

