package Lec24Assignment7;
import java.util.*;
public class MergeSortedLinkedList {
	
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
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode temp = new ListNode();
	        ListNode head = temp;
	        while(list1 != null && list2!=null){
	            if(list1.data < list2.data){
	                if(temp == null){
	                temp = list1;
	                head = list1;
	                }else{
	                    temp.next = list1;
	                    temp = list1;
	                }
	                list1 = list1.next;
	            }else{
	                if(temp == null){
	                temp = list2;
	                head = list2;
	                }else{
	                    temp.next = list2;
	                    temp    = list2;
	                }
	                list2 = list2.next;
	            }
	        }
	        if(list1 == null){
	            temp.next = list2;
	        }
	        if(list2 == null){
	            temp.next = list1;
	        }
	        return head.next;
	    }
	public void display(ListNode head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
			int m = sc.nextInt();
			int n = sc.nextInt();
			MergeSortedLinkedList mm = new MergeSortedLinkedList();
			MergeSortedLinkedList nn = new MergeSortedLinkedList();
			while(m-->0) {
				mm.add(sc.nextInt());
			}
			while(n-->0) {
				nn.add(sc.nextInt());
			}
			ListNode newhead = mm.mergeTwoLists(mm.head,nn.head);
			mm.display(newhead);
	}
}
