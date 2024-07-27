package Lec24Assignment7;
import java.util.*;
public class LinkedListKAppend {
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
	public ListNode modifyList(int k) {
		if(k == 0 || k == size) {
			return head;
		}else {
			k = k % size;
		}
		int pos = size - k-1;
		ListNode temp = head;
		while(pos -- > 0) {
			temp = temp.next;
		}
		ListNode head2 = temp.next;
		temp.next = null;
		tail.next = head;
		return head2;
		
	}
	public void display(ListNode head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		LinkedListKAppend la = new LinkedListKAppend();
		Scanner sc = new Scanner(System.in);
		int n      = sc.nextInt();
		while(n -- > 0) {
			la.add(sc.nextInt());
		}
		int k = sc.nextInt();
		la.display(la.modifyList(k));
	}

}
