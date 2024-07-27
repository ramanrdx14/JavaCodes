package Lec24Assignment7;

import java.util.Scanner;

import Lec24Assignment7.ReverseKElements.ListNode;

public class TrippletFromThreeLinkedList {
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
	public void printTripplet(ListNode head1,ListNode head2,ListNode head3,int sum) {
		while(head1!=null) {
			ListNode temp2 = head2;
			while(temp2!=null) {
				ListNode temp3 = head3;
				while(temp3!=null) {
					    if(head1.data+temp2.data+temp3.data == sum) {
						System.out.println(head1.data+" "+temp2.data+" "+temp3.data);
                        return;
					    }
						temp3 = temp3.next;
				}
				temp2=temp2.next;
			}
			head1=head1.next;
		}
	}
	
	public void display(ListNode head) {
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A      = sc.nextInt();
		int B      = sc.nextInt();
		int C      = sc.nextInt();
		TrippletFromThreeLinkedList t1 = new TrippletFromThreeLinkedList();
		while(A-->0) {
			t1.add(sc.nextInt());
		}
		
		TrippletFromThreeLinkedList t2 = new TrippletFromThreeLinkedList();
		while(B-->0) {
			t2.add(sc.nextInt());
		}
		
		TrippletFromThreeLinkedList t3 = new TrippletFromThreeLinkedList();
		while(C-->0) {
			t3.add(sc.nextInt());
		}
		int sum = sc.nextInt();
		TrippletFromThreeLinkedList t4 = new TrippletFromThreeLinkedList();
		t4.printTripplet(t1.head, t2.head, t3.head, sum);

	}

}
