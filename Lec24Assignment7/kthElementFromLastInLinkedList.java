package Lec24Assignment7;

import java.awt.DisplayMode;
import java.util.Scanner;

class ListNode{
	int data;
	ListNode next;
}
public class kthElementFromLastInLinkedList {
    private  ListNode head = null;
    private  ListNode tail = null;
    private  int size      = 0;
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
	public int display(int k) {
		ListNode temp = head;
		while(k-->0) {
			temp = temp.next;
		}
		return temp.data;
	}
	public void reverse() {
		ListNode rev = reverse(head);
		head         = rev;
	}
	public ListNode reverse(ListNode head) {
		if(head.next == null) {
			return head;
		}
		ListNode newhead = reverse(head.next);
		head.next.next   = head;
		head.next        = null;
		return newhead;
	}
	public static void main(String[] args) {
		kthElementFromLastInLinkedList ll = new kthElementFromLastInLinkedList();
		Scanner sc  = new Scanner(System.in);
		int n       = sc.nextInt();
		while(n != -1) {
			ll.add(n);
			n       = sc.nextInt();
		}
		int k  = sc.nextInt();
		ll.reverse();
		System.out.println(ll.display(k-1));
	}
}
