package src.basicDataStructure;

public class LC83RemoveDuplicatesFromSortedListApproach2 {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        
        while(head != null && head.next != null) {
            if(head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return node;
    }
}
