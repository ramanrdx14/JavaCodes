package Lec30;

public class SortAList {
	  public class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	
    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!= null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = middle(head);
        ListNode head2   = mid.next;
        mid.next     = null;
        ListNode rrans1  = sortList(head);
        ListNode rrans2  = sortList(head2);
        return mergeTwoLists(rrans1,rrans2);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode();
        ListNode head = temp;
        while(list1 != null && list2!=null){
            if(list1.val < list2.val){
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
    public static void main(String[] args) {
		//Take input and use it 
	}
}
