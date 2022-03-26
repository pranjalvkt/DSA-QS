package src.basicDataStructure;

public class LC86PartitionList {
	public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(-1);
        ListNode right = new ListNode(-1);
        ListNode leftT = left, rightT = right;
        
        while(head != null) {
            if(head.val < x) {
                leftT.next = head;
                leftT = head;
            } else {
                rightT.next = head;
                rightT = head;
            }
            head = head.next;
        }
        rightT.next = null;
        leftT.next = right.next;
        return left.next;
    }
}
