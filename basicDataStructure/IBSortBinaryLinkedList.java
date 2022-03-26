package src.basicDataStructure;

public class IBSortBinaryLinkedList {
	public ListNode solve(ListNode A) {
        ListNode leftH = new ListNode(-1);
        ListNode rightH = new ListNode(-1);

        ListNode leftT = leftH, rightT = rightH;

        while(A != null) {
            if(A.val == 0) {
                leftT.next = A;
                leftT = A;
            } else {
                rightT.next = A;
                rightT = A;
            }
            A = A.next;
        }

        rightT.next = null;
        leftT.next = rightH.next;
        return leftH.next;
    }
}
