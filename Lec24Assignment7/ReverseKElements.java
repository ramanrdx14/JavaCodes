package Lec24Assignment7;
import java.util.*;
public class ReverseKElements {
	class ListNode{
		int data;
		ListNode next;
			}
	 	private  ListNode head = null;
	    private  ListNode tail = null;
	    private  int size      = 0;
	    private  ListNode newtail = null;
		public void add(int item) {
			ListNode nn = new ListNode();
			nn.data = item;
			if(size == 0) {
				head    = nn;
				tail    = nn;
				size++;
			}else {
				tail.next = nn;
				tail      = nn;
				size++;
			}
		}
		
		public void display() {
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public ListNode kreverse(int k,ListNode head) {
		if(head == null) {
			return head;
		}
		ListNode previous = null;
		ListNode current  = head;
		ListNode forward  = head;
		int i = 0;
		while(forward != null && i < k) {
			forward = current.next;
			current.next = previous;
			previous     = current;
			current      = forward;
			i++;
		}
		if(forward!= null) {
		 head.next = kreverse(k, forward);
		}
		return previous;
	}
	public static void main(String[] args) {
		ReverseKElements ll = new ReverseKElements();
		Scanner sc  = new Scanner(System.in);
		int n       = sc.nextInt();
		int k       = sc.nextInt();
		while(n-->0) {
			ll.add(sc.nextInt());
		}
		ListNode newhead = ll.kreverse(k,ll.head);
		ll.head          = newhead;
		ll.display();
	}

}
