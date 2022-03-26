package src.basicDataStructure;

public class LC82RemoveDuplicatesFromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while(head != null) {
            if(head.next != null && head.val == head.next.val) {
                ListNode curr = head;
                while(curr != null && curr.val == head.val) {
                    curr = curr.next;
                }
                head = curr;
            } else {
                tail.next = head;
                tail = head;
                head = head.next;
            }
        }
        tail.next = null;
        return dummy.next;
    }
}
