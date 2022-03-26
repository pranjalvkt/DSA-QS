package src.basicDataStructure;

public class LC143ReorderList {
	private ListNode middle(ListNode head) {
        ListNode slow = head, fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null) return prev;
        return slow;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while(curr != null) {
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
    
    public void reorderList(ListNode head) {
        ListNode mid = middle(head);
        ListNode h2 = reverse(mid.next);
        mid.next = null;
        
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        
        while(head != null || h2 != null) {
            if(head != null) {
                tail.next = head;
                tail = head;
                head = head.next;
            }
            if(h2 != null) {
                tail.next = h2;
                tail = h2;
                h2 = h2.next;
                
            }
            
        }
        tail.next = null;
        head = dummy.next;
    }
}
