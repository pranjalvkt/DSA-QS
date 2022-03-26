package src.basicDataStructure;

public class LC328OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
        ListNode fHead = new ListNode(-1);
        ListNode sHead = new ListNode(-1);
        
        ListNode fTail = fHead, sTail = sHead;
        
        while(head != null) {
            fTail.next = head;
            fTail = head;
            head = head.next;
            
            if(head != null) {
                sTail.next = head;
                sTail = head;
                head = head.next;
            }
        }
        
        fTail.next = null;
        sTail.next = null;
        
        fTail.next = sHead.next;
        head = fHead.next;
        return head;
    }
}
