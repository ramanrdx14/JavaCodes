package Lec24Assignment7;

import java.util.Scanner;

import Lec24Assignment7.TrippletFromThreeLinkedList.ListNode;

public class LinkedListSum {
    
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
				nn.next = head;
				head    = nn;
				size++;
			}
		}
	public void sum(ListNode head1,ListNode head2) {
		long number1 =  0L;
		long pv       = 1L;
		while(head1!=null) {
			number1 = number1 + head1.data*pv;
			head1 = head1.next;
			pv*=10;
		}
		long number2 =  0;
		pv       = 1;
		while(head2!=null) {
			number2 = number2 + head2.data*pv;
			head2 = head2.next;
			pv*=10;
		}
		String ans = Long.toString(number1+number2);
		for(long i=0;i<ans.length();i++) {
			System.out.print(ans.charAt((int) i)+" ");
		}
		
	}
	public static void main(String[] args) {
		LinkedListSum ls1 = new LinkedListSum();
		Scanner sc = new Scanner(System.in);
		int A      = sc.nextInt();
		int B      = sc.nextInt();
		while(A-->0) {
			ls1.add(sc.nextInt());
		}
		
		LinkedListSum ls2 = new LinkedListSum();
		while(B-->0) {
			ls2.add(sc.nextInt());
		}

		ls2.sum(ls1.head,ls2.head);
	}

}
