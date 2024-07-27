package Lec36;
import java.util.*;
class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
public class MergeKSortedList {
	 public ListNode mergeKLists(ListNode[] lists) {
	        ListNode dummy = new ListNode();
	        ListNode temp  = dummy;
	        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>(){
	            public int compare(ListNode o1,ListNode o2){
	                return o1.val - o2.val;
	            }
	        });
	        for(int i=0;i<lists.length;i++){
	            if(lists[i] != null)
	            pq.add(lists[i]);
	        }
	        while(!pq.isEmpty()){
	            ListNode element  = pq.poll();
	            dummy.next = element;
	            dummy= dummy.next;
	            if(element.next != null){
	                pq.add(element.next);
	            }
	        }
	        return temp.next;
	    }
		public static void main(String[] args) {
			
		}
}
