package Lec30;

import Lec30.IntersectionOfTwoLinkedList.ListNode;

public class CycleRemovalAlgo {
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
		public void CreateCycle() {
			Node nn = getNode(0);
			tail.next = nn;
		}
		
		public Node hasCycle(Node head) {
			Node slow = head;
			Node fast = head;
			while(fast != null && fast.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast) {
					return slow;
				}
			}
			return null;
		}
		
		public void removeCycle() {
			Node meet = hasCycle(head);
			if(meet == null) {
				return;
			}
			Node start = head;
			while(start != null) {
				Node temp = meet;
				while(temp.next != meet) {
					if(temp.next == start) {
						temp.next = null;
						return;
					}
					temp = temp.next;
				}
				start = start.next;
			}
		}
		public  void removeCycle2() {
			Node meet = hasCycle(head);
			if(meet == null) {
				return;
			}
			//circular path ka length find kar
			int count = 1; // 1node ka length include hoga
			Node start = head;
			Node temp  = meet;
			while(temp.next != meet) {
				count ++;
				temp=temp.next;
			}
			
			//ek ko m distance chalado
			Node vishalGf = head ; //m distance chalegi
			for(int i=0;i<count;i++) {
				vishalGf = vishalGf.next;
			}
			
			Node vishal = head;  // vishal n times chelega
			
			while(vishal.next != vishalGf.next) {  //meeting point 
				vishal = vishal.next;
				vishalGf = vishalGf.next;
			}
			vishalGf.next = null;  //cycle remove
			
		}
		public void floydsCycleDetect() {
			Node meet = hasCycle(head);
			if(meet == null) {
				return;
			}
			Node slow = head;
	        Node fast = meet;
	        while(slow.next != fast.next){  //applying floyds cycle detection
	            slow = slow.next;
	            fast = fast.next;
	        }
	       fast.next = null;
		}
		public static void main(String[] args) {
			CycleRemovalAlgo cra = new CycleRemovalAlgo();
			cra.AddLast(1);
			cra.display();
			cra.CreateCycle();
			//cra.removeCycle2();
			cra.floydsCycleDetect();
			cra.display();
		}
}
