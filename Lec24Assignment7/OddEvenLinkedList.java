package Lec24Assignment7;

import java.util.Scanner;

import Lec24Assignment7.ReverseKElements.ListNode;

public class OddEvenLinkedList {
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
		public ListNode evenOdd() {
			ListNode evenhead = null;
			ListNode eventail = null;
			ListNode oddtail  = null;
			ListNode oddhead  = null;
			int evensize = 0;
			int oddsize  = 0;
			while(head != null) {
				if(head.data % 2 == 0) {
					if(evensize == 0) {
						evenhead= head;
						eventail= head;
						evensize++;
					}else {
						eventail.next = head;
						eventail = head;
						evensize++;
					}
				}else {
					if(oddsize == 0) {
						oddhead= head;
						oddtail= head;
						oddsize++;
					}else {
						oddtail.next = head;
						oddtail = head;
						oddsize++;
					}
				}
				head = head.next;
			}
			
			
			if(evenhead == null) {
				return oddhead;
			}else {
				eventail.next = null;
			}
			if(oddhead == null) {
				return evenhead;
			}else {
				oddtail.next = evenhead;
			}
			return oddhead;
		}
		public static void main(String[] args) {
			OddEvenLinkedList ll = new OddEvenLinkedList();
			Scanner sc  = new Scanner(System.in);
			int n       = sc.nextInt();
			while(n-->0) {
				ll.add(sc.nextInt());
			}
			ListNode newhead = ll.evenOdd();
			ll.head =newhead;
			ll.display();
		}
}
